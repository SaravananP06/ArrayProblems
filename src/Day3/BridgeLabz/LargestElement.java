package Day3.BridgeLabz;

/*
 * This program to find the largest element from array
 */

public class LargestElement {

	public static void main(String[] args) {
		 /*
		  * Initialize array  
		  */
		int[] arr = new int[] {42,6,73,99,10};
		/*
		 * Initialize max with first element of array.  
		 */
		int max = arr[0];
		/*
		 * Loop through the array  
		 */
		for (int i =0;i<arr.length;i++) {
			 /*
			  * Compare elements of array with max  
			  */
			if(arr[i]> max) {
				max = arr[i];
			}
			  
		}
		System.out.println("Largest element present in given array: " + max);

	}

}
