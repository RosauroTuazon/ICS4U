/**
 * 
 */

/**
 * @author Rosauro Tuazon
 *
 */
public class TestClass {

	/**
	 * 
	 */
	public TestClass() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] iArray = {1, 20, 31, 69, 40, 12, 30, 80, 90, 5};
		
		int place = Search.linearSearch(iArray, 1);
		if (place == -1)
		System.out.println("Not Found");
		else
			System.out.println("Found number at spot: " + place);
		
		int bplace = Search.binary(iArray, 30);
		if (bplace == -1)
		System.out.println("Not Found");
		else
			System.out.println("Found number at spot: " + bplace);

	}
	
		
		
		
}
