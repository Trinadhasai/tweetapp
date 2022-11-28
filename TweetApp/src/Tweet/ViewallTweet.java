package Tweet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ViewallTweet {
	static final String URL="jdbc:mysql://localhost:3306/tweetapp";
	static final String USER="root";
	static final String PASSWORD="root";
	static final String QUERY="SELECT post FROM posttwet; ";

	public static void alltweet() {
		// TODO Auto-generated method stub
		try(Connection con=DriverManager.getConnection(URL,USER,PASSWORD);	
				Statement stmt= con.createStatement();
				PreparedStatement ps=con.prepareStatement(QUERY);){
			
			String b=null;
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				
					b=rs.getString(1);			
				System.out.println(b);
				
						
					}rs.close(); 
		}catch(SQLException e) {
			System.out.println("user registration not successfully");
			
		}
	}

}
