package DAO;
 import java.sql.*;
public class utilitaire {
	
private static Connection conn; 
static{
try{
	Class.forName("com.mysql.jdbc.Driver");
	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tp3","root","");
	
}
catch(Exception e){ e.printStackTrace();
}
}
public static Connection getConnection(){
	return conn;
}

public static void main(String [] args)
{
Connection c = utilitaire.getConnection();
}}