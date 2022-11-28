package Tweet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Forgotpassword {
	static final String URL="jdbc:mysql://localhost:3306/tweetapp";
	static final String USER="root";
	static final String PASSWORD="root";
	static final String QUERY="select * from  registration where name=? AND email=? ;";
	static final String QUERY1="update registration set password=?where name=? AND email=?;";
	 // static final String QUERY=  "update student set roll_number = ? where student_id = ?";

	public static void forgorpassword() {
		// TODO Auto-generated method stub
		try(Connection con=DriverManager.getConnection(URL,USER,PASSWORD);	
				Statement stmt= con.createStatement();
				PreparedStatement ps=con.prepareStatement(QUERY);
				PreparedStatement ps1=con.prepareStatement(QUERY1);
				){
			
		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your full name");
			String name=sc.nextLine();
			String name1 = name; 
			System.out.println("enter email name");
			String email=sc.nextLine();
			String email1= email;
		    ps.setString(1, name);
			ps.setString(2,email);
			ResultSet rs=ps.executeQuery();
			
			
			if(rs.next()) {

				
				
				System.out.println("enter new password");
				String password=sc.nextLine();
				
				ps1.setString(2,name);
				ps1.setString(3, email);
				ps1.setString(1, password);
				
				
				ps1.executeUpdate();

				System.out.println("password updation successfully");
				
			
			}
		else {
			System.out.println("user name or email is incorrect");
			}
		}catch(SQLException e) {
			
			
		}
		

	}

}
