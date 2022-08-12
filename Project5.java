package proj5sp22;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
/**
 * Title: Facebook Project Application Class
 * Description: this class reads data from a text file. Based on that textfile, it creates 
 * user objects, a friend object a facebook object and makes friends lists for 
 * facebook users that can be used in many different ways. 
 * @author Roni Mikhaylov
 *
 */
public class Project5  {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(new File("fbData.txt"));
		SFacebook fb = new SFacebook();
		String code = "";
		String user = "";
		String friend = "";
		while(sc.hasNext()) {
			code = sc.next();
			user = sc.next();
			if (code.equals("F") || code.equals("U") || code.equals("Q")) {
				friend = sc.next();

			}
			if (code.equals("A")) {
				System.out.println("Adding " + user);
				fb.addToFacebook(user);
				System.out.println(fb.toString());

			}
			else if (code.equals("F")) {
				System.out.println(user + " friending " + friend);
				fb.makeFriends(user, friend);
				System.out.println(fb.toString());

			}
			else if (code.equals("U")) {
				System.out.println(user + " unfriending " + friend);
				fb.breakFriendShip(user, friend);
				System.out.println(fb.toString());

			}
			else if (code.equals("L")) {
				System.out.println("Listing " + user + " friends");
				System.out.println(fb.getFriends(user));
				//System.out.println(fb.toString());
			}
			else if( code.equals("Q")) {

				if(fb.getFriendStatus(user, friend)) {
					System.out.println(user + " and " + friend + " are friends ");
				}else {
					System.out.println(user + " and " + friend + " are not friends ");

				}
			}

		}
	}

}
