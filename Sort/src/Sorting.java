/**
 * 
 * @author Rosauro
 *
 */
public class Sorting {
	
	private static void quickSort(int left, int right) {
		// If both cursor scanned the complete array quicksort exits
		if(left >= right)
			return;
	}
	
	private static void merge(int[] items, int start, int mid, int end) {
		int[] temp = new int[items.length];
		int pos1 = start;
		int pos2 = mid + 1;
		int spot = start;
		
		while (!(pos1 > mid && pos2 > end)) {
			if ((pos1 > mid) || ((pos2 <= end) && (items[pos2] < items[pos1]))) {
				temp[spot] = items[pos2];
				pos2 += 1;
			} else {
				temp[spot] = items[pos1];
				pos1 += 1;
			}
			spot += 1;
		}
		for (int i = start; i <= end; i++) {
			items[i] = temp[i];
		}
	}
	
	/**
	 * 
	 * @param array
	 */
	public static void displayArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
		System.out.print("\n");
	}
	
	/**
	 * 
	 * @param items
	 * @param start
	 * @param end
	 */
	
	public static void mergesort(int[] items, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergesort(items, start, mid);
			mergesort(items, mid + 1, end);
			merge(items, start, mid, end);
			displayArray(items);
		}
	}
	
	/**
	 * 
	 * @param items
	 */
	public static void selectionSort(int[] items) {

		for (int index = 0; index < items.length; index++)	 {
		 for (int subIndex = index; subIndex < items.length; subIndex++) {
			if (items[subIndex] < items[index]) {
				int temp = items[index];
				items[index] = items[subIndex];
				items[subIndex] = temp;
				displayArray(items);
				}
			}
		 }
		}

	/**
	 * 
	 * @param items
	 */
		public static void insertionSort(int[] items) {
			int temp, previousIndex;
			
			for (int index = 1; index < items.length; index++) {
				temp = items[index];
				previousIndex = index - 1;
				while ((items[previousIndex] > temp) && (previousIndex > 0)) {
					items[previousIndex + 1] = items[previousIndex]; //decrease index to compare current
					previousIndex -= 1;								 //item with next previous item
				}
				if (items[previousIndex] > temp) {
					/* shift item in first element up into next element */
					items[previousIndex + 1] = items[previousIndex];
					/* place current item at index 0 (first element) */
					items[previousIndex] = temp;

				} else {
					/* place current item at index ahead of previous item */
					items[previousIndex + 1] = temp;
				}
				displayArray(items);
			}
		}
		
		
		/**
		 * 
		 * @param args
		 */
		public static void main(String[] args) {
		int[] slist = {4, 6, 2, 10, 9};
		int[] ilist = {4, 6, 2, 10, 9};
		int[] mlist = {4, 6, 2, 10, 9};
		int[] qlist = {4, 6, 2, 10, 9};
		System.out.println("Selection Sort:");
		Sorting.selectionSort(slist);
		
		System.out.println("Insertion Sort:");
		Sorting.insertionSort(ilist);
		
		System.out.println("Merge Sort:");
		Sorting.mergesort(mlist, 0, mlist.length -1);
		
		
		}
	}
