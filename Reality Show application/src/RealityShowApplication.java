import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
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
	 * @throws InvalidInputException 
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, InvalidInputException {
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
			else if(input == 7)
				load(contestants);
			else if(input == 8)
				Collections.sort(contestants);
		} while(input != 9);
	}
	
	/**
	 * This will print the labels of any stored contestants, however it will just leave
	 * a message if there isn't anything stored yet.
	 * @param contestants
	 */
	public static void addLabel (ArrayList<ContestantInformation> contestants) {
		if (contestants.size() == 0)
			System.out.println("There are no contestants yet.");
		else {
			for (int i=0; i < contestants.size(); i++) {
				Label label1 = new Label(contestants.get(i));
				System.out.println(label1.toString());
			}
		}
	}
	
	/**
	 * This method has the user search for a contestant by inputting their first
	 * and last name.
	 * @param contestants
	 */
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
	
	/**
	 * This method asks the user the index of the contestant they want to delete, it will
	 * then delete that contestant if it's available. Though it will go back to the
	 * menu if there isn't any contestants available.
	 * @param contestants
	 */
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
	
	/**
	 * This method allows the user to delete all Contestants if they wish to, otherwise
	 * it will go back to the menu if they choose no.
	 * @param contestants
	 */
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

	/**
	 * This method saves the current stored array list of contestants to a .txt file.
	 * @param contestants
	 * @throws IOException
	 */
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

	public static Province setProvince (String province) {
		if (province.equalsIgnoreCase("Ontario"))
			return(Province.ON);
		else if (province.equalsIgnoreCase("ON"))
			return(Province.ON);
		else if (province.equalsIgnoreCase("Quebec"))
			return(Province.QC);
		else if (province.equalsIgnoreCase("QC"))
			return(Province.QC);
		else if (province.equalsIgnoreCase("Manitoba"))
			return(Province.MB);
		else if (province.equalsIgnoreCase("MB"))
			return(Province.MB);
		else if (province.equalsIgnoreCase("Alberta"))
			return(Province.AB);
		else if (province.equalsIgnoreCase("AB"))
			return (Province.AB);
		else if (province.equalsIgnoreCase("British Columbia"))
			return (Province.BC);
		else if (province.equalsIgnoreCase("BC"))
			return (Province.BC);
		else if (province.equalsIgnoreCase("New Brunswick"))
			return (Province.NB);
		else if (province.equalsIgnoreCase("NB"))
			return (Province.NB);
		else if (province.equalsIgnoreCase("Newfoundland"))
			return (Province.NL);
		else if (province.equalsIgnoreCase("NL"))
			return (Province.NL);
		else if (province.equalsIgnoreCase("Newfoundland and Labrador"))
			return (Province.NL);
		else if (province.equalsIgnoreCase("Nova Scotia"))
			return (Province.NS);
		else if (province.equalsIgnoreCase("NS"))
			return (Province.NS);
		else if (province.equalsIgnoreCase("Nunavut"))
			return (Province.NU);
		else if (province.equalsIgnoreCase("NU"))
			return (Province.NU);
		else if (province.equalsIgnoreCase("Prince Edward Island"))
			return (Province.PE);
		else if (province.equalsIgnoreCase("PE"))
			return (Province.PE);
		else if (province.equalsIgnoreCase("Sasketchewan"))
			return (Province.SK);
		else if (province.equalsIgnoreCase("SK"))
			return (Province.SK);
		else if (province.equalsIgnoreCase("Yukon"))
			return (Province.YT);
		else if (province.equalsIgnoreCase("YT"))
			return (Province.YT);
		else
		{
			return (Province.ON);
		}
	}
	/**
	 * This method loads a stored Array List from a .txt file.
	 * @param contestants
	 * @throws IOException
	 * @throws InvalidInputException 
	 */
	@SuppressWarnings("resource")
	public static void load (ArrayList<ContestantInformation> contestants) throws IOException, InvalidInputException {
		String filename = ("contestants.txt");
		FileReader file = new FileReader(filename);
		int i;
		BufferedReader fbr = new BufferedReader(file);
	
		System.out.println("Loading from File... "); 
	
		try {
			if (!fbr.ready()) {
				throw new IOException();
			}
			int numOfContestants = Integer.parseInt(fbr.readLine());
			for (i=0; i < numOfContestants; i++) {
				String Firstname = fbr.readLine();
				String Lastname = fbr.readLine();
				String Streetname = fbr.readLine();
				String Streetnumber = fbr.readLine();
				String City = fbr.readLine();
				String province = fbr.readLine();
				String PostalCode = fbr.readLine();
				String Phonenumber = fbr.readLine();
				String Birthdate = fbr.readLine();
				
				ContestantInformation contestant1 = new ContestantInformation ();
				contestants.add(contestant1);
				contestant1.setfirstname(Firstname);
				contestant1.setLastname(Lastname);
				contestant1.setStreetname(Streetname);
				contestant1.setStreetnumber(Streetnumber);
				contestant1.setCity(City);
				contestant1.setProvince(setProvince(province));
				contestant1.setPostalCode(PostalCode);
				contestant1.setPhonenumber(Phonenumber);
				contestant1.setBirthdate(Birthdate);

				//new contestantInfo(firstName,  )
				//add to arraylist
			fbr.close(); }
			System.out.println("File loaded.");
		} catch (IOException e) {
			System.out.println(e);
		}
		
		
	}
	
	/**
	 * This method will add a contestant's information if they pass the skill testing
	 * question and their age is 18 or above.
	 * @param contestants
	 */
	public static void addContestant (ArrayList<ContestantInformation> contestants) {

		ContestantInformation contestant1 = new ContestantInformation();
		boolean flag;
		do {
			flag = false;
			System.out.println("What is 7 x 6?");
			int SkillQuestion = scan.nextInt();
			scan.nextLine();
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
			String province = scan.nextLine();
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

				if (province.equalsIgnoreCase("Ontario"))
					contestant1.setProvince(Province.ON);
				else if (province.equalsIgnoreCase("ON"))
					contestant1.setProvince(Province.ON);
				else if (province.equalsIgnoreCase("Quebec"))
					contestant1.setProvince(Province.QC);
				else if (province.equalsIgnoreCase("QC"))
					contestant1.setProvince(Province.QC);
				else if (province.equalsIgnoreCase("Manitoba"))
					contestant1.setProvince(Province.MB);
				else if (province.equalsIgnoreCase("MB"))
					contestant1.setProvince(Province.MB);
				else if (province.equalsIgnoreCase("Alberta"))
					contestant1.setProvince(Province.AB);
				else if (province.equalsIgnoreCase("AB"))
					contestant1.setProvince(Province.AB);
				else if (province.equalsIgnoreCase("British Columbia"))
					contestant1.setProvince(Province.BC);
				else if (province.equalsIgnoreCase("BC"))
					contestant1.setProvince(Province.BC);
				else if (province.equalsIgnoreCase("New Brunswick"))
					contestant1.setProvince(Province.NB);
				else if (province.equalsIgnoreCase("NB"))
					contestant1.setProvince(Province.NB);
				else if (province.equalsIgnoreCase("Newfoundland"))
					contestant1.setProvince(Province.NL);
				else if (province.equalsIgnoreCase("NL"))
					contestant1.setProvince(Province.NL);
				else if (province.equalsIgnoreCase("Newfoundland and Labrador"))
					contestant1.setProvince(Province.NL);
				else if (province.equalsIgnoreCase("Nova Scotia"))
					contestant1.setProvince(Province.NS);
				else if (province.equalsIgnoreCase("NS"))
					contestant1.setProvince(Province.NS);
				else if (province.equalsIgnoreCase("Nunavut"))
					contestant1.setProvince(Province.NU);
				else if (province.equalsIgnoreCase("NU"))
					contestant1.setProvince(Province.NU);
				else if (province.equalsIgnoreCase("Prince Edward Island"))
					contestant1.setProvince(Province.PE);
				else if (province.equalsIgnoreCase("PE"))
					contestant1.setProvince(Province.PE);
				else if (province.equalsIgnoreCase("Sasketchewan"))
					contestant1.setProvince(Province.SK);
				else if (province.equalsIgnoreCase("SK"))
					contestant1.setProvince(Province.SK);
				else if (province.equalsIgnoreCase("Yukon"))
					contestant1.setProvince(Province.YT);
				else if (province.equalsIgnoreCase("YT"))
					contestant1.setProvince(Province.YT);
				else
				{
					throw new InvalidInputException("'" + province + "' is not a correct province.");
				}

				contestant1.setPostalCode(PostalCode);
				contestant1.setPhonenumber(Phonenumber);
				contestant1.setBirthdate(Birthdate);
				
				if (SkillQuestion != 42)
					System.out.println("Sorry, you got the skill question wrong.");
				else
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
