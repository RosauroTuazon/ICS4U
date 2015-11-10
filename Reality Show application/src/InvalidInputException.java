/**
 * InvalidInputException extends Exception for invalid entries such
 * as adding more than 6 characters in the postal code, adding less than 6
 * characters, or using placing digits and characters at incorrect areas.
 * @author Rosauro Tuazon
 *
 */
@SuppressWarnings("serial")
public class InvalidInputException extends Exception {

	/**
	 * 
	 */
	public InvalidInputException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 */
	public InvalidInputException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 */
	public InvalidInputException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public InvalidInputException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public InvalidInputException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

}
