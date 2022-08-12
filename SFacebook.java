package proj5sp22;
/**
 * Title: SFacebook class
 * Description: defines properties  and methods of what would be in a facebook object
 * @author Roni Mikhaylov
 *
 */
public class SFacebook {
	private User[] theMembers;
	private int count;

	/**
	 * Default Constructor - 
	 * initializes count to zero
	 * initializes the length of theMemebers to be 4
	 */
	public SFacebook() {
		count = 0;

		theMembers = new User[4];
	}

	/**
	 * addToFacebook method -
	 * creates a new user and adds it to the members array
	 * will expandCapacity if necessary 
	 * @param n - users name
	 */
	public void addToFacebook(String n) {
		User user = new User(n);
		if (count>= theMembers.length) {
			expandCapacity();
		}
		theMembers[count] = user;
		count++;

	}
	/**
	 * makeFriends method - 
	 * assigns user m to be friends with user n and vice versa
	 * @param m
	 * @param n
	 */
	public void makeFriends(String m, String n) {
		if (m.equals(n)) {
			System.out.println("You cannot friend yourself");
			return;
		}
		User mm =  findFriend(m);
		User nn = findFriend(n);
		if(mm.friendsWith(nn)) {
			System.out.println(m + " is already friends with " + n);
			return;
		}

		mm.addFriend(nn);

	}

	/**
	 * breakFriendShip method - 
	 * unfriend only if they're both not null.
	 * @param m
	 * @param n
	 * @throws FriendNotFoundException if m or n are null
	 */
	public void breakFriendShip(String m, String n) {
		User mm =  findFriend(m);
		User nn = findFriend(n);
		try {
			if ( mm!=null && nn!=null) {
				mm.unFriend(nn);
			}else {
				throw new FriendNotFoundException("");
			}
		}
		catch (FriendNotFoundException ex)
		{
			System.out.println(m + " is not friends with " + n);

		}

	}
	/**
	 * getFriends method -  
	 * @param m
	 * @return the string of the users friends
	 */
	public String getFriends(String m) {
		User mm =  findFriend(m);
		return mm.getFriends();

	}
	/**
	 * getFriendStatus method - 
	 * @param m
	 * @param n
	 * @return true if user m and n are friends, false otherwise
	 */
	public boolean getFriendStatus(String m, String n) {
		User mm =  findFriend(m);
		User nn =  findFriend(n);
		
		if (nn == null) {
			System.out.println(n + " is not a facebook user.");
		}

		return mm!=null && nn!=null && mm.friendsWith(nn); 

	}
	/**
	 * toString Method - 
	 * creates a string object with each user and their friendlist
	 * @return string object with each user and their friendlist
	 */
	public String toString() {
		String str = new String();
		for (int i = 0; i<count; i++) {
			str += theMembers[i].getFriends();

		}
		return str;
	}
	/**
	 * findFriend method -
	 * @param n
	 * @return returns a user if they exist in theMembers
	 */
	private User findFriend (String n) {
		for (int i = 0; i<count; i++) {
			if (theMembers[i].getName().equals(n)) {
				return theMembers[i];
			}

		}
		return null;
	}

	/**
	 * expandCapacity method - 
	 * doubles the size of theMembers array 
	 */
	private void expandCapacity () {
		User [] temp = new User[theMembers.length*2];
		for (int i = 0; i<count; i++) {
			temp[i] = theMembers[i];
		}
		theMembers = temp;
	}
}
