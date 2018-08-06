
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
		int minValue = array[0];
		int minIndex = 0;
		System.out.print("minvalue is "+minValue+"\n");

		//iterate through and find index of minValue
		for (int i = 0; i < array.length-1; i++) {
			//store new min values
			if(array[i] < minValue){
				minIndex = i;
				minValue = array[i];
				System.out.println("new min is " + minValue);
			}

			//swap values
            for (int j = i+1; j < array.length; j++) {
                // check if we need to swap if so then swap
                if (array[j] < array[i]) {
                    Integer temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
					System.out.println("swapping "+array[i]+" and "+array[j]);

                }
            }
        }



    } // end of sort()


} // end of class SelectionSort
