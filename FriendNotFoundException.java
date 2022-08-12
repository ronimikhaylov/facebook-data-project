package proj5sp22;
/**
 * Title:  FriendNotFoundException Class
 * Description: This class consists of a constructor which is used when an  FriendNotFoundException 
 * is thrown. It extends Runtime Exception and therefore is unchecked
 * @author Roni Mikhaylov
 *
 */
@SuppressWarnings("serial")
public class FriendNotFoundException extends RuntimeException {

	public FriendNotFoundException(String m)
		{
			super(m);
		}
	

}

