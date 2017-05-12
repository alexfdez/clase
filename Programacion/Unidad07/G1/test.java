package G1;

import java.sql.*;

public class test {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "ALUMNADODB", "alumnado");
			// con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "usuario", "password");
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM alum");
			
			// Cuenta el número máximo de columnas
			ResultSetMetaData meta = rs.getMetaData();
			int maxColumn = meta.getColumnCount();
			
			// Muestra el nombre de las columnas
			for (int i = 1; i <= maxColumn; i++) {
				System.out.print(meta.getColumnName(i) + "\t");
			}
			System.out.println("\n-------------------------");
			
			// Imprime las columnas
			while(rs.next()) {
				for (int i = 1; i <= maxColumn; i++) {
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println("");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
