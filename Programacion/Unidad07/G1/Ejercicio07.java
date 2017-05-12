package G1;

import java.sql.*;

public class Ejercicio07 {
	
	static Connection con = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	static ResultSetMetaData meta = null;
	static int maxColumn = 0;
	
	
	public static void listar() {
		// SIN COMPLETAR
	}
	
	
	public static void darAlta() throws SQLException {
		String apellido = LibLeer.cadena("\nApellido: ").toUpperCase();
		String oficio = LibLeer.cadena("Oficio: ").toUpperCase();
		int dir = LibLeer.entero("Directorio: ");
		int salario = LibLeer.entero("Salario (€): ");
		int dept = LibLeer.entero("Número de departamento: ");
		
		// Obtener nuevo EMP_NO
		String sql = "SELECT MAX(emp_no) FROM emple";
		rs = stmt.executeQuery(sql);
		meta = rs.getMetaData();
		maxColumn = meta.getColumnCount();
		String idStr = "";
		while (rs.next()) {
			for (int i = 1; i <= maxColumn; i++) {
				idStr += rs.getString(i);
			}
		}
		int id = Integer.parseInt(idStr) + 1;
		
		sql = "INSERT INTO emple (EMP_NO,APELLIDO,OFICIO,DIR,FECHA_ALT,SALARIO,COMISION,TOTAL,DEPT_NO) VALUES (" + id + ",'" + apellido + "','" + oficio + "'," + dir + ",(SELECT to_char(trunc(sysdate),'dd/mm/yyyy') FROM dual)," + salario + ",0," + salario + "," + dept + ")";
		rs = stmt.executeQuery(sql);
		
		System.out.println("\nEmpleado dado de alta.");
	}
	
	
	public static void modificar() throws SQLException {
		int id = LibLeer.entero("\nEscribe el número del empleado: ");
		
		int op = 0;
		do {
			System.out.println("\n¿Qué deseas modificar?");
			System.out.println("1. Salario");
			System.out.println("2. Comisión");
			System.out.println("3. Directorio");
			System.out.println("4. Oficio");
			System.out.println("5. Departamento");
			System.out.println("6 --> Salir");
			
			op = LibLeer.entero("> ");
			
			if (op == 1) {
				int salarioNuevo = LibLeer.entero("\nIntroduce el nuevo salario: ");
				String sql = "UPDATE emple SET SALARIO = " + salarioNuevo + " WHERE emp_no = " + id;
				rs = stmt.executeQuery(sql);
				System.out.println("\nSalario actualizado.");
				
				sql = "UPDATE emple SET TOTAL = " + salarioNuevo + " + COMISION WHERE emp_no = " + id;
				rs = stmt.executeQuery(sql);
			}
			else if (op == 2) {
				int comisionNueva = LibLeer.entero("\nIntroduce la nueva comisión: ");
				String sql = "UPDATE emple SET COMISION = " + comisionNueva + " WHERE emp_no = " + id;
				rs = stmt.executeQuery(sql);
				System.out.println("\nComisión actualizada.");
				
				sql = "UPDATE emple SET TOTAL = SALARIO + " + comisionNueva + " WHERE emp_no = " + id;
				rs = stmt.executeQuery(sql);
			}
			else if (op == 3) {
				int dirNuevo = LibLeer.entero("\nIntroduce el nuevo directorio: ");
				String sql = "UPDATE emple SET DIR = " + dirNuevo + " WHERE emp_no = " + id;
				rs = stmt.executeQuery(sql);
				System.out.println("\nDirectorio actualizado.");
			}
			else if (op == 4) {
				String oficioNuevo = LibLeer.cadena("\nIntroduce el nuevo oficio: ");
				String sql = "UPDATE emple SET OFICIO = '" + oficioNuevo + "' WHERE emp_no = " + id;
				rs = stmt.executeQuery(sql);
				System.out.println("\nOficio actualizado.");
			}
			else if (op == 5) {
				int deptNuevo = LibLeer.entero("\nIntroduce el número del nuevo departamento: ");
				String sql = "UPDATE emple SET DEPT_NO = " + deptNuevo + " WHERE emp_no = " + id;
				rs = stmt.executeQuery(sql);
				System.out.println("\nSalario actualizado.");
			}
			else if (op != 6) {
				System.out.println("\n/!\\ Opción inválida");
			}
			
			System.out.println("");
		} while (op < 1 || op > 6);
	}
	
	
	public static void eliminarEmpleado() throws SQLException {
		int id = LibLeer.entero("\nEscribe el número del empleado: ");
		
		String sql = "DELETE FROM emple WHERE emp_no = " + id;
		rs = stmt.executeQuery(sql);
		
		System.out.println("\nEmpleado nº" + id + " borrado de la base de datos.");
	}
	
	
	public static void eliminarEmpleado(String dept) throws SQLException {
		String sql = "DELETE FROM emple WHERE dept_no IN (SELECT dept_no FROM depart WHERE dnombre = '" + dept + "')";
		rs = stmt.executeQuery(sql);
	}
	
	
	public static void eliminarDepartamento() throws SQLException {
		String dept = LibLeer.cadena("\nEscribe el nombre del departamento: ").toUpperCase();
		eliminarEmpleado(dept);
		
		String sql = "DELETE FROM depart WHERE dnombre = '" + dept + "'";
		rs = stmt.executeQuery(sql);
		
		System.out.println("\nDepartamento " + dept + " borrado de la base de datos.");
	}
	
	
	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "ALUMNADODB", "alumnado");
			// con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "usuario", "password");
			stmt = con.createStatement();
			
			int op = 0;
			do {
				System.out.println("Menú:");
				System.out.println("1. Listar todos los empleados");
				System.out.println("2. Dar de alta");
				System.out.println("3. Modificar datos de un empleado");
				System.out.println("4. Eliminar empleado");
				System.out.println("5. Eliminar departamento");
				System.out.println("6 --> Salir");
				
				op = LibLeer.entero("> ");
				
				switch (op) {
					case 1 : listar(); break;
					case 2 : darAlta(); break;
					case 3 : modificar(); break;
					case 4 : eliminarEmpleado(); break;
					case 5 : eliminarDepartamento(); break;
					case 6 : break;
					default : System.out.println("\n/!\\ Opción inválida");
				}
				
				System.out.println("");
			} while (op != 6);
			
			
			if (rs != null) rs.close();
			if (stmt != null) stmt.close();
			if (con != null) con.close();
			System.out.println("¡Hasta luego!");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}