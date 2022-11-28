package Tweet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyTweet {
	static final String URL="jdbc:mysql://localhost:3306/tweetapp";
	static final String USER="root";
	static final String PASSWORD="root";
	static final String QUERY="SELECT post FROM posttwet where email= ? ; ";
	 public static void mytweet(UserDetails currentUser)  {
		// TODO Auto-generated method stub

		//Current User details
		//write a query which will fetch all the tweets from tweet table based on user email id
		try(Connection con=DriverManager.getConnection(URL,USER,PASSWORD);	
				Statement stmt= con.createStatement();
				PreparedStatement ps=con.prepareStatement(QUERY);){
			String a=null;
			String b=null;
			ps.setString(1,currentUser.getUserEmail());
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				
					a=rs.getString(1);			
				System.out.println(a);
				
						
					}rs.close(); 
				}catch(SQLException e) {
					System.out.println("user registration not successfully");
					
				}
		
	}

}
