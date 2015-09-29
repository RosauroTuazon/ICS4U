import java.util.Scanner;

/**
 * 
 */

/**
 * @author Rosauro Tuazon
 *
 */
public class RealityShowApplication {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = false;
		ContestantInformation contestant1 = new ContestantInformation();
		do {
			flag = false;
		try
		{
			contestant1.setfirstname();
			contestant1.setPostalCode();
		}
		}
	    Scanner sc = new Scanner(System.in);
	    String frame = sc.nextLine();
	    System.out.println("Hello! Please enter your first name.");
	}

}
