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
		Scanner scan = new Scanner(System.in);
		
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
		System.out.println("Enter your province");
		String smith = scan.nextLine();
		System.out.println("Enter your postal code.");
		String PostalCode = scan.nextLine();
		System.out.println("Enter your phone number. (ex. 416-321-1337)");
		String Phonenumber = scan.nextLine();
		System.out.println("Enter your birthdate. (ex. 02/12/1995)");
		String Birthdate = scan.nextLine();
		
		// TODO Auto-generated method stub
		boolean flag = false;
		ContestantInformation contestant1 = new ContestantInformation();
		do {
				flag = false;
			try
			{
				contestant1.setfirstname(Firstname);
				contestant1.setLastname(Lastname);
				contestant1.setStreetname(Streetname);
				contestant1.setStreetnumber(Streetnumber);
				contestant1.setCity(City);
				
				if (smith.equalsIgnoreCase("Ontario"))
				contestant1.setProvince(Province.ON);
				if (smith.equalsIgnoreCase("Quebec"))
					contestant1.setProvince(Province.QC);
				if (smith.equalsIgnoreCase("Manitoba"))
					contestant1.setProvince(Province.MB);
				if (smith.equalsIgnoreCase("Alberta"))
					contestant1.setProvince(Province.AB);
				if (smith.equalsIgnoreCase("British Columbia"))
					contestant1.setProvince(Province.BC);
				if (smith.equalsIgnoreCase("New Brunswick"))
					contestant1.setProvince(Province.NB);
				if (smith.equalsIgnoreCase("Newfoundland"))
					contestant1.setProvince(Province.NL);
				if (smith.equalsIgnoreCase("Newfoundland and Labrador"))
					contestant1.setProvince(Province.NL);
				if (smith.equalsIgnoreCase("Nova Scotia"))
					contestant1.setProvince(Province.NS);
				if (smith.equalsIgnoreCase("Nunavut"))
					contestant1.setProvince(Province.NU);
				if (smith.equalsIgnoreCase("Prince Edward Island"))
					contestant1.setProvince(Province.PE);
				if (smith.equalsIgnoreCase("Sasketchewan"))
					contestant1.setProvince(Province.SK);
				if (smith.equalsIgnoreCase("Yukon"))
					contestant1.setProvince(Province.YT);
				
				contestant1.setPostalCode(PostalCode);
				contestant1.setPhonenumber(Phonenumber);
				contestant1.setBirthdate(Birthdate);
			}
			catch (InvalidInputException e){
				System.out.println(e.getMessage());
			}
		}
		while (flag);
		

}
