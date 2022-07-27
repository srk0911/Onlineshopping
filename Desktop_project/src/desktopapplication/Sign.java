package desktopapplication;

import java.sql.*;

public class Sign {

	public static void main(String[] args) throws SQLException {
		String driverName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/";
		String Name = "root";
		String Password = "4455";

		Connection con = DriverManager.getConnection(url, Name, Password);

		System.out.println("connection successfully" + con);

		Statement st = con.createStatement();

	//	st.execute("create database Otto");

		st.execute("use Otto");

		st.execute("create table sign(Name varchar(20),Dob varchar(20),Mobile varchar(20),Age int,Gendar varchar(20))");
		System.out.println("created successed");

	}

}
