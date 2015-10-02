/**
 * Date: Friday, October 2, 2015
 * @author Rosauro Tuazon
 * Description: For this program the user will be applying for a reality show.
 * They will need to answer a skill testing question correctly, and be at least 
 * 18 years of age. If they qualify you will get their address and phone number 
 * from them to send to the casting director. 
 */
public class ContestantInformation {

	private String firstname;
	private String Lastname;
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
		
	}
	
	/**
	 * 
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
	 * 
	 * @param firstname
	 */
	public void setfirstname(String firstname){
		this.firstname = firstname;
	}
	
	/**
	 * 
	 * @return firstname
	 */
	public String getFirstname(){
		return firstname;
	}
	
	/**
	 * 
	 * @param lastname
	 */
	public void setLastname(String lastname){
		this.Lastname = lastname;
	}
	
	/**
	 * 
	 * @return Lastname
	 */
	public String getLastname(){
		return Lastname;
	}
	
	/**
	 * 
	 * @param streetname
	 */
	public void setStreetname(String streetname){
		this.Streetname = streetname;
	}
	
	/**
	 * 
	 * @return Streetname
	 */
	public String getStreetname(){
		return Streetname;
	}
	
	/**
	 * 
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
	 * 
	 * @return Streetnumber
	 */
	public String getStreetnumber(){
		return Streetnumber;
	}
	
	/**
	 * 
	 * @param city
	 */
	public void setCity(String city){
		this.City = city;
	}
	
	/**
	 * 
	 * @return City
	 */
	public String getCity(){
		return City;
	}
	
	/**
	 * 
	 * @param province
	 */
	public void setProvince(Province province) {
		this.province = province;
	}
	
	/**
	 * 
	 * @return Province
	 */
	public Province getProvince(){
		return province;
	}
	
	/**
	 * 
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
	 * 
	 * @return PostalCode
	 */
	public String getPostalCode(){
		return PostalCode;
	}
	
	/**
	 * 
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
	 * 
	 * @return Phonenumber
	 */
	public String getPhonenumber(){
		return Phonenumber;
	}
	/**
	 * This sets the birthdate, please input in this format dd/mm/yyyy
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
	 * 
	 * @return Birthdate
	 */
	public String getBirthdate(){
		return Birthdate;
	}

	/**
	 * returns the variables
	 */
	public String toString(){
		return (firstname + " " + Lastname + " " + Streetnumber + " " + Streetname + " " + City + " " + province + " " + PostalCode + " " + Phonenumber + " " + Birthdate + " ");
	}
}
