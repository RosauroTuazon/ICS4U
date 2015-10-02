/**
 * This displays the information that the user has inputed.
 * @author Rosauro Tuazon
 * 
 */
public class Label {
	private ContestantInformation ci1;
	private String output;

	/**
	 * ci1 contains the Contestant Information
	 */
	public Label(ContestantInformation ci) {
		this.ci1 = ci;
		formatName();
		formatAddress();
		formatNumber();
	}
	
	/**
	 * Gets the user's last and first name
	 */
	private void formatName() {
		output = ci1.getLastname() + ", " + ci1.getFirstname() + "\n";
	}
	
	/**
	 * Gets the user's full address
	 */
	private void formatAddress() {
		output = output + ci1.getStreetnumber() + " " + ci1.getStreetname() + "\n" + ci1.getCity() + ", " + ci1.getProvince() + "\n" + ci1.getPostalCode() + "\n";
	}
    /**
     * Gets the user's phone number
     */
	private void formatNumber() {
		output = output + ci1.getPhonenumber();
	}
	
	/**
	 * Returns the output
	 */
	public String toString(){
		return (output);
	}
}
