/**
 * Author; - Pratik
 */
package recursivepuzzle;

public class Sum{
	static int sum;
	public static void main(String[] args) {
		int container[] = {5,8,2,58,25,3,45,98,81,90};	
		
		System.out.println("Sum of the Given Array: - " + sum(container, container.length));
		
	}
	private static int sum(int numbers[], int size) {

		if(size-1< 0) return sum; 
		
		sum+=numbers[size-1];
					
		return sum(numbers, --size);			
	}
}

//This code is implemented by PRATIK SINGH
