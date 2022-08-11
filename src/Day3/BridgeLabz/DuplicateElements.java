package Day3.BridgeLabz;
/*
 * This program prints the duplicate array elements 
 */

public class DuplicateElements {

	public static void main(String[] args) {
		/*
		 * Initialize array   
		 */
        int [] arr = new int [] {3, 6, 2, 8, 2, 3, 5, 8, 9};   
          
        System.out.println("Duplicate elements in given array: ");  
        /*
         * Searches for duplicate element  
         */
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  

	}

}
