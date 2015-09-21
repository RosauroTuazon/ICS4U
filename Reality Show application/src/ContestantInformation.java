/**
 * Date: Monday, September 21, 2015
 * @author Rosauro Tuazon
 * Description: For this program the user will be applying for a reality show.
 * They will need to answer a skill testing question correctly, and be at least 
 * 18 years of age. If they qualify you will get their address and phone number 
 * from them to send to the casting director. If they answer the skill testing
 * question wrong, or are too young, print an error message or tell them how many 
 * years they need to wait before they can apply again.
 */
public class ContestantInformation {

	private String Firstname;
	private String Lastname;
	private String Streetname;
	private String Streetnumber;
	private String City;
	private String Province;
	private String PostalCode;
	private String Phonenumber;
	private String Birthdate;
	
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
	 */
	public ContestantInformation (String f, String l, String a, String s, String c, String p, String v, String n, String b){
		this.setFirstname(f);
		this.setLastname(l);
		this.setStreetname(a);
		this.setStreetnumber(s);
		this.setCity(c);
		this.setProvince(p);
		this.setPostalCode(v);
		this.setPhonenumber(n);
		this.setBirthdate(b);
		
	}
	
	
	public void setFirstname(String firstname){
		this.Firstname = firstname;
	}
	
	public String getFirstname(){
		return Firstname;
	}
	
	public void setLastname(String lastname){
		this.Lastname = lastname;
	}
	
	public String getLastname(){
		return Lastname;
	}
	
	public void setStreetname(String streetname){
		this.Streetname = streetname;
	}
	
	public String getStreetname(){
		return Streetname;
	}
	
	public void setStreetnumber(String streetnumber){
		this.Streetnumber = streetnumber;
	}
	
	public String getStreetnumber(){
		return Streetnumber;
	}
	
	public void setCity(String city){
		this.City = city;
	}
	
	public String getCity(){
		return City;
	}
	
	public void setProvince(String province){
		this.Province = province;
	}
	
	public String getProvince(){
		return Province;
	}
	
	public void setPostalCode(String postalcode){
		this.PostalCode = postalcode;
	}
	
	public String getPostalCode(){
		return PostalCode;
	}
	
	public void setPhonenumber(String phonenumber){
		this.Phonenumber = phonenumber;
	}
	
	public String Phonenumber(){
		return Phonenumber;
	}
	
	public void setBirthdate(String birthdate){
		this.Birthdate = birthdate;
	}
	
	public String getBirthdate(){
		return Birthdate;
	}
	
	public String toString(){
		return (Firstname + " " + Lastname + " " + Streetnumber + " " + Streetname + " " + City + " " + Province + " " + PostalCode + " " + Phonenumber + " " + Birthdate + " ");
	}
}
