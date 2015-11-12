/**
 * For this program the user will be applying for a reality show.
 * They will need to answer a skill testing question correctly, and be at least 
 * 18 years of age. If they qualify you will get their address and phone number 
 * from them to send to the casting director. 
 * Date: Friday, October 2, 2015
 * @author Rosauro Tuazon
 */
@SuppressWarnings("rawtypes")
public class ContestantInformation implements Comparable{

	private String firstname;
	private String lastname;
	private String Streetname;
	private String Streetnumber;
	private String City;
	private Province province;
	private String PostalCode;
	private String Phonenumber;
	private String Birthdate;
	
	/**
	 * default constructor
	 */
	public ContestantInformation(){
		firstname = "";
		lastname = "";
		Streetname = "";
		Streetnumber = "";
		City = "";
		province = Province.ON;
		PostalCode = "";
		Phonenumber = "";
		Birthdate = "";
	}
	
	/**
	 * Receives input from the user.
	 * @param Firstname
	 * @param Lastname
	 * @param Streetname
	 * @param Streetnumber
	 * @param City
	 * @param Province
	 * @param PostalCode
	 * @param Phonenumber
	 * @param Birthdate
	 * @throws InvalidInputException 
	 */
	public ContestantInformation (String Firstname, String Lastname, String Streetname, String Streetnumber, String City, Province Province, String PostalCode, String Phonenumber, String Birthdate) throws InvalidInputException{
		this.setfirstname(Firstname);
		this.setLastname(Lastname);
		this.setStreetname(Streetname);
		this.setStreetnumber(Streetnumber);
		this.setCity(City);
		this.setProvince(Province);
		this.setPostalCode(PostalCode);
		this.setPhonenumber(Phonenumber);
		this.setBirthdate(Birthdate);
		
	}
	
	/**
	 * Sets the first name of the user.
	 * @param firstname
	 */
	public void setfirstname(String firstname){
		this.firstname = firstname;
	}
	
	/**
	 * Gets the first name from the stored list of contestants.
	 * @return firstname
	 */
	public String getFirstname(){
		return firstname;
	}
	
	/**
	 * Sets the last name of the user.
	 * @param lastname
	 */
	public void setLastname(String lastname){
		this.lastname = lastname;
	}
	
	/**
	 * Gets the last name from the stored list of contestants.
	 * @return Lastname
	 */
	public String getLastname(){
		return lastname;
	}
	
	/**
	 * Sets the street name of the user.
	 * @param streetname
	 */
	public void setStreetname(String streetname){
		this.Streetname = streetname;
	}
	
	/**
	 * Gets the street name from the stored list of contestants.
	 * @return Streetname
	 */
	public String getStreetname(){
		return Streetname;
	}
	
	/**
	 * Sets the Streetnumber of the contestant. If the user inserts an incorrect
	 * number like a letter or character, it will throw an InvalidInputException
	 * and then the user will have to start again.
	 * @param streetnumber
	 */
	public void setStreetnumber(String streetnumber) throws InvalidInputException {
		if (!Character.isDigit(streetnumber.charAt(0)))
		{
			throw new InvalidInputException("'" + streetnumber.charAt(0) + "' This needs to be a digit, not a character. (Error at Street Number)");
		}
		else if (!Character.isDigit(streetnumber.charAt(1)))
		{
			throw new InvalidInputException("'" + streetnumber.charAt(1) + "' This needs to be a digit, not a character. (Error at Street Number)");
		}
		else if (!Character.isDigit(streetnumber.charAt(2)))
		{
			throw new InvalidInputException("'" + streetnumber.charAt(2) + "' This needs to be a digit, not a character. (Error at Street Number)");
		}
		else
		{
			
		}
		this.Streetnumber = streetnumber;
			
	}
	
	/**
	 * This gets the Streetnumber from the stored list of contestants.
	 * @return Streetnumber
	 */
	public String getStreetnumber(){
		return Streetnumber;
	}
	
	/**
	 * This sets the city of the contestant.
	 * @param city
	 */
	public void setCity(String city){
		this.City = city;
	}
	
	/**
	 * This gets the city from the stored list of contestants.
	 * @return City
	 */
	public String getCity(){
		return City;
	}
	
	/**
	 * Sets the province from the user.
	 * @param province
	 */
	public void setProvince(Province province) {
		this.province = province;
	}
	
	/**
	 * Gets the province from the stored list of contestants.
	 * @return Province
	 */
	public Province getProvince(){
		return province;
	}
	
	/**
	 * Sets the user's postal code and it will throw an InvalidInputException
	 * if the user inserts an incorrect postal code like 7A1P3D or a postal code
	 * with a space.
	 * @param postalcode
	 * @throws InvalidInputException
	 */
	public void setPostalCode(String postalcode) throws InvalidInputException {
		if(postalcode.length() > 6)
		{
			throw new InvalidInputException("Postal Code must be 6 digits only");
		}
		else if (postalcode.length() < 6)
		{
			throw new InvalidInputException("Postal Code is too short. Please enter 6 digit postal code.");
		}
		else if (!Character.isLetter(postalcode.charAt(0)))
		{
			throw new InvalidInputException("'" + postalcode.charAt(0) + "' This needs to be a character, not digit. (Error at Postal Code)");
		}
		else if (!Character.isLetter(postalcode.charAt(2)))
		{
			throw new InvalidInputException("'" + postalcode.charAt(2) + "' This needs to be a character, not digit. (Error at Postal Code)");
		}
		else if (!Character.isLetter(postalcode.charAt(4)))
		{
			throw new InvalidInputException("'" + postalcode.charAt(4) + "' This needs to be a character, not digit. (Error at Postal Code)");
		}
		else if (!Character.isDigit(postalcode.charAt(1)))
		{
			throw new InvalidInputException("'" + postalcode.charAt(1) + "' This needs to be a digit, not a character. (Error at Postal Code)");
		}
		else if (!Character.isDigit(postalcode.charAt(3)))
		{
			throw new InvalidInputException("'" + postalcode.charAt(3) + "' This needs to be a digit, not a character. (Error at Postal Code)");
		}
		else if (!Character.isDigit(postalcode.charAt(5)))
		{
			throw new InvalidInputException("'" + postalcode.charAt(5) + "' This needs to be a digit, not a character. (Error at Postal Code)");
		}
		else
		{
			
		}
		this.PostalCode = postalcode;
	}
	
	/**
	 * Gets the postal code from the stored list of contestants.
	 * @return PostalCode
	 */
	public String getPostalCode(){
		return PostalCode;
	}
	
	/**
	 * Sets the user's Phone number and it will throw an InvalidInputException if
	 * the user doesn't go by the specific phone number format or they use something
	 * that doesn't exist in a phone number like a character.
	 * @param phonenumber
	 * @throws InvalidInputException
	 */
	public void setPhonenumber(String phonenumber) throws InvalidInputException {
		if(phonenumber.length() > 12)
		{
			throw new InvalidInputException("Phone number must be 12 digits only");
		}
		else if (phonenumber.length() < 12)
		{
			throw new InvalidInputException("Phone number is too short. Please enter 12 digit postal code.");
		}
		else if (phonenumber.charAt(3)!='-')
		{
			throw new InvalidInputException("'" + phonenumber.charAt(3) + "' This needs to be a '-'. (Error at Phone number)");
		}
		else if (phonenumber.charAt(7)!='-')
		{
			throw new InvalidInputException("'" + phonenumber.charAt(7) + "' This needs to be a '-'. (Error at Phone number)");
		}
		else if (!Character.isDigit(phonenumber.charAt(0)))
		{
			throw new InvalidInputException("'" + phonenumber.charAt(0) + "' This needs to be a digit, not a character. (Error at Phone number)");
		}
		else if (!Character.isDigit(phonenumber.charAt(1)))
		{
			throw new InvalidInputException("'" + phonenumber.charAt(1) + "' This needs to be a digit, not a character. (Error at Phone number)");
		}
		else if (!Character.isDigit(phonenumber.charAt(2)))
		{
			throw new InvalidInputException("'" + phonenumber.charAt(2) + "' This needs to be a digit, not a character. (Error at Phone number)");
		}
		else if (!Character.isDigit(phonenumber.charAt(4)))
		{
			throw new InvalidInputException("'" + phonenumber.charAt(4) + "' This needs to be a digit, not a character. (Error at Phone number)");
		}
		else if (!Character.isDigit(phonenumber.charAt(5)))
		{
			throw new InvalidInputException("'" + phonenumber.charAt(5) + "' This needs to be a digit, not a character. (Error at Phone number)");
		}
		else if (!Character.isDigit(phonenumber.charAt(6)))
		{
			throw new InvalidInputException("'" + phonenumber.charAt(6) + "' This needs to be a digit, not a character. (Error at Phone number)");
		}
		else if (!Character.isDigit(phonenumber.charAt(8)))
		{
			throw new InvalidInputException("'" + phonenumber.charAt(8) + "' This needs to be a digit, not a character. (Error at Phone number)");
		}
		else if (!Character.isDigit(phonenumber.charAt(9)))
		{
			throw new InvalidInputException("'" + phonenumber.charAt(9) + "' This needs to be a digit, not a character. (Error at Phone number)");
		}
		else if (!Character.isDigit(phonenumber.charAt(10)))
		{
			throw new InvalidInputException("'" + phonenumber.charAt(10) + "' This needs to be a digit, not a character. (Error at Phone number)");
		}
		else if (!Character.isDigit(phonenumber.charAt(11)))
		{
			throw new InvalidInputException("'" + phonenumber.charAt(11) + "' This needs to be a digit, not a character. (Error at Phone number)");
		}
		else
		{
			
		}
		this.Phonenumber = phonenumber;
	}
	
	/**
	 * Gets the phone number from the stored list of contestants.
	 * @return Phonenumber
	 */
	public String getPhonenumber(){
		return Phonenumber;
	}
	/**
	 * This sets the birthdate, please input in this format dd/mm/yyyy or else
	 * it will give an error.
	 * @param birthdate
	 * @throws InvalidInputException
	 */
	public void setBirthdate(String birthdate) throws InvalidInputException {
		String dayS = birthdate.substring(0, 1);
		int day = Integer.parseInt(dayS);
		String monthS = birthdate.substring(3, 4);
		int month = Integer.parseInt(monthS);
		String yearS = birthdate.substring(6, 9);
		int year = Integer.parseInt(yearS);
		if (day > 31)
		{
			throw new InvalidInputException("This is an invalid day.");
		}
		else if (month > 12)
		{
			throw new InvalidInputException("This is an invalid month.");
		}
		else if (year > 2016)
		{
			throw new InvalidInputException("This is an invalid year.");
	    }
		else if (birthdate.charAt(2)!='/')
		{
			throw new InvalidInputException("'" + birthdate.charAt(2) + "' This needs to be a '/'. (Error at Birthday)");
		}
		else if (birthdate.charAt(5)!='/')
		{
			throw new InvalidInputException("'" + birthdate.charAt(5) + "' This needs to be a '/'. (Error at Birthday)");
		}
		else
		{
			
		}
		this.Birthdate = birthdate;
	}
	
	/**
	 * Gets the Birthdate from the stored list of contestants.
	 * @return Birthdate
	 */
	public String getBirthdate(){
		return Birthdate;
	}

	/**
	 * returns the variables
	 */
	
	/**
	 * Checks if the first and last name of the inputted name and the stored names are
	 * the same, returns true if they're the same or false if they are not.
	 * @param target
	 * @return
	 */
	public boolean equals(ContestantInformation target) {
		target.getFirstname() .equalsIgnoreCase (this.firstname);
		if (target.getFirstname() == firstname && target.getLastname() == lastname) {
			return true;
		}
		else 
		{
		return false;
		}
	}
	
	/**
	 * This method compares the first and last name of the user inputted info with
	 * the first and last name of the stored contestants.
	 */
	public int compareTo(Object args) {
		ContestantInformation object = (ContestantInformation)args;
		String fname = this.firstname;
		String fname2 = object.getFirstname();
		String lname = this.lastname;
		String lname2 = object.getLastname();
		if (lname2.compareTo(lname) == 0) {
			if (fname2.compareTo(fname) == 0) {
				return 0;
			}
			else if (fname2.compareTo(fname) > 0) {
				return 1;
			}
			else
			{
			return -1;
			}
		}
		else if (lname2.compareTo(lname) > 0) {
			return 1;
		}
		else
		{
		return -1;
		
		}
	}
	
	/**
	 * Displays all of the information from the contestant.
	 */
	public String toString(){
		return (firstname + " " + lastname + " " + Streetnumber + " " + Streetname + " " + City + " " + province + " " + PostalCode + " " + Phonenumber + " " + Birthdate + " ");
	}
}
