package bdd;

import java.sql.*;

public class CreationTable {
	static private final String URL = "jdbc:mysql://localhost:3306/jee_db";
	static private final String USER = "root";
	static private final String PWD = "root";
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(URL, USER, PWD);

			Statement stmt = conn.createStatement();

			String sql = "DROP TABLE IF EXISTS COMPTE ";
			stmt.executeUpdate(sql);
			sql = "DROP TABLE IF EXISTS OPERATIONS ";
			stmt.executeUpdate(sql);
			sql = "CREATE TABLE COMPTE " +
					"(NOCOMPTE CHAR(4) not NULL, " +
					" NOM VARCHAR(20), " + 
					" PRENOM VARCHAR(20), " + 
					" SOLDE DECIMAL(10,2) not NULL, " + 
					" PRIMARY KEY ( NOCOMPTE ))"; 
			
			stmt.executeUpdate(sql);

			sql = "DROP TABLE IF EXISTS OPERATION ";
			sql = "CREATE TABLE OPERATION " +
					"(NOCOMPTE CHAR(4) not NULL, " +
					" DATE DATE not NULL, " + 
					" HEURE TIME not NULL, " + 
					" OP CHAR(1) not NULL, " + 
					" VALEUR DECIMAL(10,2) not NULL)"; 

			stmt.executeUpdate(sql);

			sql = "INSERT INTO COMPTE VALUES ('0001', 'Magnes', 'Charles', 10.00)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO COMPTE VALUES ('0002', 'Legrand', 'Louis', 205.00)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO COMPTE VALUES ('0003', 'Labelle', 'Katia', 500.50)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO OPERATION VALUES('0001', CURDATE(), CURTIME(), '+', 210.00)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO OPERATION VALUES('0001', CURDATE(), CURTIME(), '-', 200.00)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO OPERATION VALUES('0002', CURDATE(), CURTIME(), '+', 205.00)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO OPERATION VALUES('0003', CURDATE(), CURTIME(), '+', 200.00)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO OPERATION VALUES('0003', CURDATE(), CURTIME(), '+', 300.50)";
			stmt.executeUpdate(sql);
			
			conn.close();
		}
		catch(Exception e){ 
			System.out.println(e);
		}
	}
}
