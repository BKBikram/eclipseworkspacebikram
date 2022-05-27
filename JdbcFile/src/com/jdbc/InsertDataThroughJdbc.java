package com.jdbc;

import java.sql.*;

public class InsertDataThroughJdbc {

	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/student";
		String uname="root";
		String pass="Bikram15@1";
		String insert="insert into employee values(8,'saroj','cuttack','saroj@gmail.com',27)";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		int count=st.executeUpdate(insert);
		System.out.println("new row affected");
		st.close();
		con.close();
		

	}

}
