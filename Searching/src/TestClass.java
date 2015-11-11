import java.text.DecimalFormat;

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
		int[] iArray = {1, 5, 12, 20, 30, 31, 40, 69, 80, 90};
		double[] dArray = {1, 5, 12, 20, 30, 31, 40, 69, 80, 90};
		String[] sArray = {"Bob", "John", "Emily", "Lee", "Anthony"};
			
		int bplace1 = Search.binary(iArray, 5);
		int bplace2 = Search.binary(iArray, 32);
		print(bplace1);
		print(bplace2);
		
		
		double bplace3 = Search.binary(dArray, 80);
		double bplace4 = Search.binary(dArray, 4);
		printd(bplace3);
		printd(bplace4);
		
		int bplace5 = Search.binary(sArray, "Bob");
		int bplace6 = Search.binary(sArray, "Jones");
		print(bplace5);
		print(bplace6);

		int place1 = Search.linearSearch(iArray, 20);
		int place2 = Search.linearSearch(iArray, 0);
		print(place1);
		print(place2);
		
		double place3 = Search.linearSearch(dArray, 69);
		double place4 = Search.linearSearch(dArray, 0);
		printd(place3);
		printd(place4);
		
		int place5 = Search.linearSearch(sArray, "John");
		int place6 = Search.linearSearch(sArray, "Smith");
		print(place5);
		print(place6);
		
	}
	
	public static void print (int place) {
		if (place == -1)
			System.out.println("Not Found");	
		else
			System.out.println("Found number at spot: " + (place + 1));
	}
	
	public static void printd (double place) {
		DecimalFormat df = new DecimalFormat("#");
		if (place == -1)
			System.out.println("Not Found");	
		else
			System.out.println("Found number at spot: " + df.format(place + 1));
	}
		
		
}
