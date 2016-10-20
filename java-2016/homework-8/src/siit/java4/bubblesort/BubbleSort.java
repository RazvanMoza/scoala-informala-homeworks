package siit.java4.bubblesort;

import java.util.Comparator;

/**
 * The Class BubbleSort.
 */
public class BubbleSort{

	/**
	 * BubbleSort implementation
	 */
	public <T extends Comparable<T>> T[] sortPrimitives(T[] unsorted) {
		boolean listCheck = true;

		for (int i = 0; i < unsorted.length - 1; i++) {

			if (unsorted[i].compareTo(unsorted[i + 1]) > 0) {
				T aux = unsorted[i];
				unsorted[i] = unsorted[i + 1];
				unsorted[i + 1] = aux;
				listCheck = false;
			}
		}
		/**
		 * checks if the list is ordered or not and if yes returns the list
		 */

		if (!listCheck) {
			sortPrimitives(unsorted);
		}

		return unsorted;
	}
	
	public <T> T[] sortObjects(T[] unsorted, Comparator<T> comparator) {
		boolean listCheck = true;

		for (int i = 0; i < unsorted.length - 1; i++) {

			if(comparator.compare(unsorted[i], unsorted[i+1])>0){
				T aux = unsorted[i];
				unsorted[i] = unsorted[i + 1];
				unsorted[i + 1] = aux;
				listCheck = false;
			}
		}
		/**
		 * checks if the list is ordered or not and if yes returns the list
		 */

		if (!listCheck) {
			sortObjects(unsorted,comparator);
		}

		return unsorted;
	}
}