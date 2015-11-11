/**
 * @author Rosauro Tuazon
 *
 */
public class Search {

	/**
	 * Returns the index of the element numToFind.
	 * -1 if element not found.
	 * pre: none
	 * post: index of numToFind has been returned. -1 has been
	 * returned if element not found.
	 * @param array
	 * @param numToFind
	 * @return
	 */
	public static int binary(int[] array, int numToFind) {
		int begIndex = 0;
		int endIndex = array.length - 1;
		int midIndex;

		do {
			
			midIndex = (begIndex + endIndex) / 2;

			if (array[midIndex] == numToFind) {
				return (midIndex);
			}
			else if (array[midIndex] > numToFind) {
				endIndex = midIndex - 1;
			}

			else { // (array[midIndex] < numToFind) {
				begIndex = midIndex + 1;

			}
		}
		while ((begIndex <= endIndex)); {

		return -1;
	}

}
	
	public static double binary(double[] array, double numToFind) {
		int begIndex = 0;
		int endIndex = array.length - 1;
		int midIndex;

		do {
		
			midIndex = (begIndex + endIndex) / 2;

			if (array[midIndex] == numToFind) {
				return (midIndex);
			}
			else if (array[midIndex] > numToFind) {
				endIndex = midIndex - 1;
			}

			else { // (array[midIndex] < numToFind) {
				begIndex = midIndex + 1;

			}
		}
		while ((begIndex <= endIndex)); {

		return -1;
	}

}
	
	public static int binary(String[] array, String numToFind) {
		int begIndex = 0;
		int endIndex = array.length -1;
		int midIndex;

		do {
		
			midIndex = (begIndex + endIndex) / 2;

			if (array[midIndex].equals(numToFind)) {
				return (midIndex);
			}
			else if (array[midIndex].compareTo(numToFind) > 0) {
				endIndex = midIndex - 1;
			}

			else { // (array[midIndex].compareTo(numTofind) < 0) 
				begIndex = midIndex + 1;

			}
		}
		while ((begIndex <= endIndex)); {

		return -1;
	}

}
	
	public static int linearSearch (int[] a, int target) {
		for (int i=0; i < a.length; i++) {
			if (a[i] == target)
				return (i);
		}
		return -1;
	}
	
	public static int linearSearch (String[] a, String target) {
		for (int i=0; i < a.length; i++) {
			if (a[i] == target)
				return (i);
		}
		return -1;
	}
	
	public static int linearSearch (double[] a, double target) {
		for (int i=0; i < a.length; i++) {
			if (a[i] == target)
				return (i);
		}
		return -1;
	}
}
	