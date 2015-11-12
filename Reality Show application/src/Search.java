import java.util.ArrayList;

/**
 * This program searches for elements in an Array List.
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
	 * @return int
	 */
	public static int binary(int[] array, int numToFind) {
		int begIndex = 0;
		int endIndex = array.length -1;
		int midIndex;

		do {
		
			midIndex = (begIndex + endIndex) / 2;

			if (array[midIndex] == numToFind) {
				return (midIndex);
			}
			else if (array[midIndex] > numToFind) {
				endIndex = midIndex - 1;
			}

			else { // (array[midIndex] < numToFind) 
				begIndex = midIndex + 1;

			}
		}
		while ((begIndex <= endIndex) &&
				(begIndex == endIndex)); {

		return -1;
	}

}
	
	public static int binary(double[] array, double numToFind) {
		int begIndex = 0;
		int endIndex = array.length -1;
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
		while ((begIndex <= endIndex) &&
				(begIndex == endIndex)); {

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
		while ((begIndex <= endIndex) &&
				(begIndex == endIndex)); {

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
	
	public static int linearSearch (ArrayList <ContestantInformation> contestants, ContestantInformation target) {
		for (int i=0; i < contestants.size(); i++) {
			if (contestants.get(i).equals(target))
				return (i);
		}
		return -1;
	}
	
	public static int binary(ArrayList <ContestantInformation> contestants, ContestantInformation numToFind) {
		int begIndex = 0;
		int endIndex = contestants.size() -1;
		int midIndex;

		do {
		
			midIndex = (begIndex + endIndex) / 2;

			if (contestants.get(midIndex).compareTo(numToFind) == 0) {
				return (midIndex);
			}
			else if (contestants.get(midIndex).compareTo(numToFind) > 0) {
				endIndex = midIndex - 1;
			}

			else { // (array[midIndex] < numToFind) 
				begIndex = midIndex + 1;

			}
		}
		while ((begIndex <= endIndex) &&
				(begIndex == endIndex)); {

		return -1;
		}

}
	
	public int binarySearch(ArrayList<ContestantInformation> aL, String target) {
		int beg = 0;
		int end = aL.size() - 1;
		return binarySearch(aL, target, beg, end);
	}
	private int binarySearch(ArrayList<ContestantInformation> aL, String target, int begin, int end) 
	{
		if (begin > end)
			return -1;
		
		int mid = (begin + end) / 2;
		if(aL.get(mid).compareTo(target) == 0)
			return mid;
		else if(aL.get(mid).compareTo(target) < 0)
			return binarySearch(aL, target, mid + 1, end);
		else
			return binarySearch(aL, target, begin, mid-1);
	}
}





