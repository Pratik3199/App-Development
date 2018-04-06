/**
 * Author: - Pratik
 */
package recursivepuzzle;

public class ArraySearch{


	static int search;
	
	public static void main(String[] args) {
		int container[] = {98,72,9,83,3,-8,-7,9,3,5};
		
		System.out.println("Number found at index: " + search(container,0, container.length-1, 9));
		
	}

	private static int search(int numbers[], int start, int end, int number) {
		
     int mid = (start+end)/2;   
     
     if (numbers[mid]> number)    
    	 end = mid;               
    	  
     else if(numbers[mid]<number)   
    	 start = mid;                
     
     else if(numbers[mid]==number)                          
    	 return mid;               
    	
     else
        return -1;
		return search(numbers, start, end, number);			
	}
}
//This code is implemented by PRATIK SINGH
