package Day3.BridgeLabz;
/*
 * This program we are going to find 2nd largest number in array using function
 */
public class SecondLargestNumber {
	
	public static int getSecondLargest(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[total-2];  
		}  

	public static void main(String[] args) {
		int a[]={3,5,7,8,2,9};  
		int b[]={34,67,54,21,7,87,89};  
		System.out.println("Second Largest: "+getSecondLargest(a,6));  
		System.out.println("Second Largest: "+getSecondLargest(b,7));  

	}

}
