package Tweet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class TweetPost {
	
	static final String URL="jdbc:mysql://localhost:3306/tweetapp";
	static final String USER="root";
	static final String PASSWORD="root";
	static final String QUERY="insert into posttwet(name,email,post) values(?,?,?);";

	 static final String QUERY1="SELECT * FROM tweetapp.registration;;";
	 
	 
	 
	 public static void post(UserDetails currentUser)  {
		// TODO Auto-generated method stub
		try(Connection con=DriverManager.getConnection(URL,USER,PASSWORD);	
				Statement stmt= con.createStatement();
				PreparedStatement ps=con.prepareStatement(QUERY);
				PreparedStatement ps1=con.prepareStatement(QUERY1);){
			//gets two arguments a) Current User Details and b) post
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Post your NewTweet");
			String post=sc.nextLine();
			ps.setString(1,currentUser.getUserName());
			ps.setString(2,currentUser.getUserEmail());
			ps.setString(3,post);
			
			
			ps.executeUpdate();
			
			System.out.println("Your new post is added");
//			ResultSet rs=ps1.executeQuery();
//			if(rs.next()) {
//				System.out.println(rs.getString(1));
//			}
			
			
		}catch(SQLException e) {
			System.out.println("user registration not successfully");
			
		}
		
		
	}
	
		// TODO Auto-generated method stub
		
	}


	