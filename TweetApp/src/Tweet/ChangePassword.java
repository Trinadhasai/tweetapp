package Tweet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ChangePassword {
	
	static final String URL="jdbc:mysql://localhost:3306/tweetapp";
	static final String USER="root";
	static final String PASSWORD="root";
	static final String QUERY1="select * from  registration where name=? AND email=? ;";
	static final String QUERY="update registration set password=? where name=? AND email=?;";
	

	public static void changePassword(UserDetails currentUser) {
		// TODO Auto-generated method stub
		try(Connection con=DriverManager.getConnection(URL,USER,PASSWORD);	
				Statement stmt= con.createStatement();
				PreparedStatement ps=con.prepareStatement(QUERY);
				PreparedStatement ps1=con.prepareStatement(QUERY1);
				){
			
		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter new password");
			String password=sc.nextLine();
		
			ps.setString(2,currentUser.getUserName());
			ps.setString(3,currentUser.getUserEmail());
			ps.setString(1,password);
			
			
			ps.executeUpdate();
			
			System.out.println("password change sucessfuly");
		
		
		
		
		
		}catch(SQLException e) {
			
			
		}
		

	}

}

