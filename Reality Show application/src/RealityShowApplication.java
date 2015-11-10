import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 */

/**
 * This is the main part of the program
 * @author Rosauro Tuazon
 *
 */
public class RealityShowApplication {
	static Scanner scan = new Scanner(System.in);
	/**
	 * @param args
	 * @throws IOException 
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		ArrayList <ContestantInformation> contestants = new ArrayList <ContestantInformation>();
		
		int input;
		/**
		 * Gets the user's input
		 */
		do {
			System.out.println("Please choose one of the following:");
			System.out.println("1. Add new contestant");
			System.out.println("2. Print labels");
			System.out.println("3. Search");
			System.out.println("4. Delete Contestant");
			System.out.println("5. Clear All Contestants");
			System.out.println("6. Save Contestants");
			System.out.println("7. Load Contestants");
			System.out.println("8. Sort Contestants");
			System.out.println("9. Exit program");
			input = scan.nextInt();
			scan.nextLine();

			if(input == 1)
				addContestant(contestants);
			else if(input == 2)
				addLabel(contestants);
			else if(input == 4)
				removeLabel(contestants);
			else if(input == 5)
				removeallLabel(contestants);
			else if(input == 6)
				save(contestants);
			else if(input == 8)
				Collections.sort(contestants);
		} while(input != 9);
	}
	
	public static void addLabel (ArrayList<ContestantInformation> contestants) {
		if (contestants.size() == 0)
			System.out.println("There are no contestants yet.");
		else {
			for (int i=0; i < contestants.size(); i++) {
				Label label1 = new Label(contestants.get(i));
				System.out.print(label1.toString());
			}
		}
	}
	
	public static void searchInfo (ArrayList<ContestantInformation> contestants) {
		scan.nextLine();
		System.out.println("Enter the first name of the contestant you want to search:");
		String first = scan.nextLine();
		System.out.println("Enter the last name of the contestant you want to search:");
		String last = scan.nextLine();
		
		ContestantInformation temporary = new ContestantInformation();
		temporary.setfirstname(first);
		temporary.setLastname(last);
		
		Search.linearSearch(contestants, temporary);
	}
	
	public static void removeLabel (ArrayList<ContestantInformation> contestants) {
		if (contestants.size() == 0)
			System.out.println("There are no contestants yet.");
		else {
			for (int i=0; i < contestants.size(); i++) {
				System.out.println("Enter the index of the contestant you want to delete: ");
				int input = scan.nextInt();
				i = input;
				contestants.remove(i);
				System.out.println("Contestant successfully removed.");
			}
		}
	}
	
	public static void removeallLabel (ArrayList<ContestantInformation> contestants) {
		System.out.println("Are you sure you want to delete everything?");
		String Confirmation = scan.nextLine();
		if (Confirmation.equalsIgnoreCase("Yes")) {
			contestants.removeAll(contestants);
			System.out.println("All contestants successfully deleted.");
		}
		else //If the user picks No
		{
			System.out.println("Action cancelled.");
			}
	}

	public static void save (ArrayList<ContestantInformation> contestants) throws IOException {
		try {
		File file = new File("contestants.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		PrintStream fps = new PrintStream(fileOutputStream);
		System.out.println("Sending to File: "); 
		System.out.print(file);
		
		
		fps.println(contestants.size());
		for(int i=0; i < contestants.size(); i++)
		{
			fps.println(contestants.get(i).getFirstname());
			fps.println(contestants.get(i).getLastname());
			fps.println(contestants.get(i).getStreetname());
			fps.println(contestants.get(i).getStreetnumber());
			fps.println(contestants.get(i).getCity());
			fps.println(contestants.get(i).getProvince());
			fps.println(contestants.get(i).getPostalCode());
			fps.println(contestants.get(i).getPhonenumber());
			fps.println(contestants.get(i).getBirthdate());
		}
		
		
		fileOutputStream.close();
		} catch (IOException ex) {
		      System.out.println("There was a problem writing to the file");
		      ex.printStackTrace();
		}
		
	}
	

	public static void addContestant (ArrayList<ContestantInformation> contestants) {

		ContestantInformation contestant1 = new ContestantInformation();
		boolean flag;
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
				else if (smith.equalsIgnoreCase("ON"))
					contestant1.setProvince(Province.ON);
				else if (smith.equalsIgnoreCase("Quebec"))
					contestant1.setProvince(Province.QC);
				else if (smith.equalsIgnoreCase("QC"))
					contestant1.setProvince(Province.QC);
				else if (smith.equalsIgnoreCase("Manitoba"))
					contestant1.setProvince(Province.MB);
				else if (smith.equalsIgnoreCase("MB"))
					contestant1.setProvince(Province.MB);
				else if (smith.equalsIgnoreCase("Alberta"))
					contestant1.setProvince(Province.AB);
				else if (smith.equalsIgnoreCase("AB"))
					contestant1.setProvince(Province.AB);
				else if (smith.equalsIgnoreCase("British Columbia"))
					contestant1.setProvince(Province.BC);
				else if (smith.equalsIgnoreCase("BC"))
					contestant1.setProvince(Province.BC);
				else if (smith.equalsIgnoreCase("New Brunswick"))
					contestant1.setProvince(Province.NB);
				else if (smith.equalsIgnoreCase("NB"))
					contestant1.setProvince(Province.NB);
				else if (smith.equalsIgnoreCase("Newfoundland"))
					contestant1.setProvince(Province.NL);
				else if (smith.equalsIgnoreCase("NL"))
					contestant1.setProvince(Province.NL);
				else if (smith.equalsIgnoreCase("Newfoundland and Labrador"))
					contestant1.setProvince(Province.NL);
				else if (smith.equalsIgnoreCase("Nova Scotia"))
					contestant1.setProvince(Province.NS);
				else if (smith.equalsIgnoreCase("NS"))
					contestant1.setProvince(Province.NS);
				else if (smith.equalsIgnoreCase("Nunavut"))
					contestant1.setProvince(Province.NU);
				else if (smith.equalsIgnoreCase("NU"))
					contestant1.setProvince(Province.NU);
				else if (smith.equalsIgnoreCase("Prince Edward Island"))
					contestant1.setProvince(Province.PE);
				else if (smith.equalsIgnoreCase("PE"))
					contestant1.setProvince(Province.PE);
				else if (smith.equalsIgnoreCase("Sasketchewan"))
					contestant1.setProvince(Province.SK);
				else if (smith.equalsIgnoreCase("SK"))
					contestant1.setProvince(Province.SK);
				else if (smith.equalsIgnoreCase("Yukon"))
					contestant1.setProvince(Province.YT);
				else if (smith.equalsIgnoreCase("YT"))
					contestant1.setProvince(Province.YT);
				else
				{
					throw new InvalidInputException("'" + smith + "' is not a correct province.");
				}

				contestant1.setPostalCode(PostalCode);
				contestant1.setPhonenumber(Phonenumber);
				contestant1.setBirthdate(Birthdate);
				contestants.add(contestant1);
				Label label1 = new Label (contestant1);
				System.out.print(label1.toString());
			}
			/**
			 * Catches invalid inputs
			 */
			catch (InvalidInputException e){
				System.out.println(e.getMessage() + " Start from the beginning and try again.");
				flag = true;
			}


		}

		/**
		 * It will keep looping if the flag is true
		 */
		while (flag == true);



	}
}
