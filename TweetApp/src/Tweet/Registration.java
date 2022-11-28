package Tweet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class Registration {
	
	static final String URL="jdbc:mysql://localhost:3306/tweetapp";
	static final String USER="root";
	static final String PASSWORD="root";
	static final String QUERY="insert into registration (name,email,password) values(?,?,?);";


	public static void registration() {
		// TODO Auto-generated method stub
	
		try(Connection con=DriverManager.getConnection(URL,USER,PASSWORD);	
				Statement stmt= con.createStatement();
				PreparedStatement ps=con.prepareStatement(QUERY);){
			
		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter full name");
			String name=sc.nextLine();
			System.out.println("enter email name");
			String email=sc.nextLine();
			System.out.println("enter password");
			String password=sc.nextLine();
			
			
			
			ps.setString(1,name);
			ps.setString(2,email);
			ps.setString(3, password);
		
			ps.executeUpdate();

				System.out.println("user registration successfully");
			

		}catch(SQLException e) {
			System.out.println("user registration not successfully");
			
		}
		
		
	}


	}


