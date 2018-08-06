
/**
 * Implementation of SelectionSort.
 *
 * @author jefcha
 */
public class SelectionSort extends SortAlgorithm
{

	/**
	 * Sort array.
	 *
	 * @param array Array to be sorted.
	 */


    public void sort(int[] array) {

		//init variables for storing min

		for (int i = 0; i < array.length-1; i++) {
			int minValue = Integer.MAX_VALUE;
			int minIndex = i+1;
            for (int j = i; j < array.length; j++) {
				//iterate through and find index of minValue
                if (array[j] < minValue) {
                    minIndex = j;
                    minValue = array[j];
                }
            }
			//swap values
			int temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
			}


    } // end of sort()


} // end of class SelectionSort
