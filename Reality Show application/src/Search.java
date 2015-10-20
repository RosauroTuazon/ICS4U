import java.util.ArrayList;

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

			else if (array[midIndex] < numToFind) {
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
	
	public static int linearSearch (ArrayList <ContestantInformation> contestants, ContestantInformation target) {
		for (int i=0; i < contestants.size(); i++) {
			if (contestants.get(i).equals(target))
				return (i);
		}
		return -1;
	}
}




