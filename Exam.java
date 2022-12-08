package com.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.cj.x.protobuf.MysqlxCrud.Insert;

public class Exam {
 public static void getExamQue() {
		 try {
		 Class.forName("com.mysql.jdbc.Driver");
	Connection connection= DriverManager.getConnection("jdbc.mysql://localhost:3306/miniproject","root","root");
	PreparedStatement pStatement=connection.prepareStatement("insert into onlineexam(que,option1,option2,option3,option4,ans)values('?','?','?','?','?','?')");
	pStatement.setString(1, "Which was the first fully color film of India?");
	pStatement.setString(2, "aan");
	pStatement.setString(3, "King Harishchandra");
	pStatement.setString(4,"Alamara");
	pStatement.setString(5,"Rani of Jhansi");
	int j =pStatement.executeUpdate();
	System.out.println("insert data sucessfully>>"+j);
	connection.close();
	pStatement.close();
	
	 } catch (Exception e) {
		e.printStackTrace();
	}
		 
 }
}
