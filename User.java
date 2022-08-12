package proj5sp22;
/**
 * Title: User class
 * Description: Defines properties and methods of a user object
 * @author Roni Mikhaylov
 *
 */
public class User {
	private String name; 
	private FriendList friends;

	/**
	 * parameterized constructor - 
	 * initializes users name and creates a new empt friendlist for the user
	 * @param m
	 */
	public User (String m) {
		name = m;
		friends = new FriendList();
	}

	/**
	 * accessor method - getName 
	 * @return users name
	 */
	public String getName() {
		return name;
	}

	/**
	 * addFriend method - 
	 * adds user m to the front of the users friendlist. 
	 * @param m - friend to be added
	 */
	public void addFriend(User m) {
		//System.out.println(m.getName() + " is friending " + getName());
		friends.addToFront(m);
		m.friends.addToFront(this);
		
	}
	/**
	 * unFriend method - 
	 * if m is a  friend of this, remove each from the others
	 * friendList. otherwise throw the exception
	 * @param m - friend to be removed
	 * @throws FriendNotFoundException if they are not friends
	 */
	public void unFriend(User m) {
		if (friendsWith(m)) {
			friends.remove(m);
			m.friends.remove(this);
		}
		else {
			throw new FriendNotFoundException(m.getName() + " is not a friend of " + getName() + "\n");
		}


	}
	/**
	 * friendsWith method - 
	 * @param m
	 * @return true if m is friends with this user, otherwise returns false
	 */
	public boolean friendsWith(User m) {
		try {
			friends.search(m);
		}
		catch (FriendNotFoundException ex) {
			
			return false;
		}
		return true;
	}
	/**
	 * getFriends Method - 
	 * creates a string with the users friends
	 * @return the string with the users friends
	 */
	public String getFriends() {
		String str = new String() ;
		str += name + " is friends with " +  friends.listOfFriends() + "\n";
		return str;
	}
	/**
	 * equals method - determines whether the user m and this are equal
	 * @param m
	 * @return true if they are equal, otherwise false
	 */
	public boolean equals(User m) {
		return name.equals(m.getName());

	}


}
