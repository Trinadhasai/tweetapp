package Tweet;

import java.util.Scanner;



public class Mainpage {

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1 -> Login");
		System.out.println("2 -> New user for registration");
		System.out.println("3 -> Forgotpassword");
		System.out.println("");
		System.out.println("choose an option");
		
		int option  = sc.nextInt();
		UserDetails currentUser = new UserDetails();
		switch(option)
		{
		case 1:
			
			//login.loginUser();
			 currentUser = login.loginUser();
			System.out.println("1 -> Post a tweet");
			System.out.println("2 -> View my tweets");
			System.out.println("3 -> View all tweets");
			System.out.println("4 -> View All Users");
			System.out.println("5 -> Reset Password");
			System.out.println("6 -> Logout");
			
			System.out.println("");
			System.out.println("choose an option");
			int options  = sc.nextInt();
			
				switch(options)
				{
				case 1:
					TweetPost.post(currentUser);
				
					break;	
				case 2:
					MyTweet.mytweet(currentUser);
					
					break;
				case 3:
					ViewallTweet.alltweet();
					break;
				case 4:
					ViewallUsers.allusers();
					break;
				case 5:
					ChangePassword.changePassword(currentUser);
					break;
				case 6:
					System.out.println("logout  sucessfuly");
					Logout.logout();
					
				}break;
			
			
        case 2:
			
        	Registration.registration();
        
			
			break ;
			
        case 3:
	
        	Forgotpassword.forgorpassword();
        	
	
        	break;
		}
		
		
	}
	
	}
	
