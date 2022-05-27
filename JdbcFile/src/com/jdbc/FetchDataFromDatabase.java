package com.jdbc;

import java.sql.*;


public class FetchDataFromDatabase {

	public static void main(String[] args) throws Exception{
		String url="jdbc:mysql://localhost:3306/student";
		String uname="root";
		String pass="Bikram15@1";
		String query="select * from employee";
		String newq="insert into employee values(9,'nikhil','dhamnagar','nikhil@gmail.com',34)";
		//String delq="delete from employee where eid=9";
		String up="update employee set ename='biplab' where eid=9";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement  st=con.createStatement();
		//int n=st.executeUpdate(newq);
		//int n=st.executeUpdate(newq);
		int n=st.executeUpdate(up);
		ResultSet rs=st.executeQuery(query);
		while(rs.next()) {
			
		//String name=rs.getString("Ename");
		System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+" \t "+rs.getString(3)+"  \t "+rs.getString(4)+" \t "+rs.getInt(5));
		}
		st.close();
		con.close();
		
		

	}

}
