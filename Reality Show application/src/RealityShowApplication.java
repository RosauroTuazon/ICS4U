import java.util.Scanner;
import java.util.ArrayList;

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
		Scanner scan = new Scanner(System.in);
        ArrayList <ContestantInformation> c1 = new ArrayList <ContestantInformation>();


		// TODO Auto-generated method stub
		boolean flag = false;
		ContestantInformation contestant1 = new ContestantInformation();
		/**
		 * Gets the user's input
		 */
		do {
			flag = false;
			System.out.println("Enter your first name.");
			String Firstname = scan.nextLine();
			System.out.println("Enter your last name.");
			String Lastname = scan.nextLine();
			System.out.println("Enter your street's name.");
			String Streetname = scan.nextLine();
			System.out.println("Enter your street number.");
			String Streetnumber = scan.nextLine();
			System.out.println("Enter your city's name.");
			String City = scan.nextLine();
			System.out.println("Enter your province (ex. Ontario or ON)");
			String smith = scan.nextLine();
			System.out.println("Enter your postal code with no spaces. (ex. L1A4M3)");
			String PostalCode = scan.nextLine();
			System.out.println("Enter your phone number. (ex. 416-321-1337)");
			String Phonenumber = scan.nextLine();
			System.out.println("Enter your birthdate. (ex. 02/12/1995)");
			String Birthdate = scan.nextLine();
			try
			{
				contestant1.setfirstname(Firstname);
				contestant1.setLastname(Lastname);
				contestant1.setStreetname(Streetname);
				contestant1.setStreetnumber(Streetnumber);
				contestant1.setCity(City);

				if (smith.equalsIgnoreCase("Ontario"))
					contestant1.setProvince(Province.ON);
				else if (smith.equalsIgnoreCase("Quebec"))
					contestant1.setProvince(Province.QC);
				else if (smith.equalsIgnoreCase("Manitoba"))
					contestant1.setProvince(Province.MB);
				else if (smith.equalsIgnoreCase("Alberta"))
					contestant1.setProvince(Province.AB);
				else if (smith.equalsIgnoreCase("British Columbia"))
					contestant1.setProvince(Province.BC);
				else if (smith.equalsIgnoreCase("New Brunswick"))
					contestant1.setProvince(Province.NB);
				else if (smith.equalsIgnoreCase("Newfoundland"))
					contestant1.setProvince(Province.NL);
				else if (smith.equalsIgnoreCase("Newfoundland and Labrador"))
					contestant1.setProvince(Province.NL);
				else if (smith.equalsIgnoreCase("Nova Scotia"))
					contestant1.setProvince(Province.NS);
				else if (smith.equalsIgnoreCase("Nunavut"))
					contestant1.setProvince(Province.NU);
				else if (smith.equalsIgnoreCase("Prince Edward Island"))
					contestant1.setProvince(Province.PE);
				else if (smith.equalsIgnoreCase("Sasketchewan"))
					contestant1.setProvince(Province.SK);
				else if (smith.equalsIgnoreCase("Yukon"))
					contestant1.setProvince(Province.YT);
				else
				{
					throw new InvalidInputException("'" + smith + "' is not a correct province.");
				}

				contestant1.setPostalCode(PostalCode);
				contestant1.setPhonenumber(Phonenumber);
				contestant1.setBirthdate(Birthdate);
				c1.add(contestant1);
				Label label1 = new Label (contestant1);
				System.out.print(label1.toString());
			}
			catch (InvalidInputException e){
				System.out.println(e.getMessage() + " Start from the beginning and try again.");
				flag = true;
			}
			

		}
		while (flag == true);

		

	}
}
