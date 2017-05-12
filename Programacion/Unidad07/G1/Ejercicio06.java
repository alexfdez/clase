package G1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "ALUMNADODB", "alumnado");
			// con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "usuario", "password");
			stmt = con.createStatement();
			
			// TABLA DEPART
			rs = stmt.executeQuery("SELECT * FROM depart");
			
			ResultSetMetaData meta = rs.getMetaData();
			int maxColumn = meta.getColumnCount();
			
			System.out.print("| ");
			for (int i = 1; i <= maxColumn; i++) {
				System.out.print(meta.getColumnName(i) + " | ");
			}
			System.out.println("");
			
			while(rs.next()) {
				for (int i = 1; i <= maxColumn; i++) {
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println("");
			}
			
			
			System.out.println("\n");
			
			// TABLA EMPLE
			rs = stmt.executeQuery("SELECT * FROM emple");
			meta = rs.getMetaData();
			maxColumn = meta.getColumnCount();
			
			System.out.print("| ");
			for (int i = 1; i <= maxColumn; i++) {
				System.out.print(meta.getColumnName(i) + " | ");
			}
			System.out.println("");
			
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