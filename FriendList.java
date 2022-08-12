package proj5sp22;
/**
 * Title: FriendList Class
 * Description: Defines properties and methods of a friendList object. 
 * @author Roni Mikhaylov
 *
 */
public class FriendList {

	private Node header;
	private int count;
	
	/**
	 * default constructor-
	 * itilizes count to zero and creates a new null node for the header
	 */
	public FriendList() {
		count = 0;
		header = new Node(null);

	}
/**
 * size method-
 * @return count (size of the friendList)
 */
	public int size() {
		return count;
	}
	
	/**
	 * isEmpty method - 
	 * 
	 * @return true if count == 0
	 */
	public boolean isEmpty() {
		return count == 0;
	}
/**
 * addToFront method - 
 * creates a new node at the front of the list and increments count
 * @param m - user to be added in the node
 */
	public void addToFront(User m) {
		Node newNode = new Node (m,header.getNext());
		header.setNext(newNode);
		count ++;
	}
/**
 * remove method - 
 * removes the user m if found, otherwise throws the exception
 * @param m - user to be removed
 * @return the User that was removed
 * @throws FriendNotFoundException if user was not found in the list
 */
	public User remove(User m) {
		Node current = header;
		Node prev = header;
		for (int i = 0; i<count; i++) {
			current = current.getNext();
			if (current.getItem().equals(m)) {
				prev.setNext(current.getNext());
				count--;
				return current.getItem();
			}
			prev = current;

		}
		throw new FriendNotFoundException(m.getName() + " was not found in your friends list");
	}

	/**
	 * search method - 
	 * 
	 * @param m - user to be searched
	 * @throws friendNotFoundException if User is not there
	 * @return true if found, throws friend not found exception if not found
	 */
	public boolean search (User m) {
		Node current = header;
		for (int i = 0; i<count; i++) {
			current = current.getNext();
			if (current.getItem().equals(m)) {
				return true;
			}

		}
		throw new FriendNotFoundException(m.getName() + " was not found in your friends list");
	}


/**
 * listOfFriends method - 
 * iterates through the list to create a String of the users friends
 * @return String 
 */
	public String listOfFriends() {

		Node current = header;
		String str = new String();
		for (int i = 0; i<count; i++) {
			current = current.getNext();
			//System.out.println(current.getItem().getName());
			str += current.getItem().getName() + " ";
		}
		return str;

	}
}

