package ArrayList_Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/******************
 * This program demostarte the sorting of Array List using the collections.sort() method
 * User enters the list and then it is displays the ascending and in descending order also.   
 * 
 * @author Sumit Singh
 *
 */
public class floatSort {
	static ArrayList<Float> floatArray= new ArrayList<Float>();
	
	public static void main(String[] args) {
		int count = 0;
		float values = 0f;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the number of numbers in the list");
		count = (keyboard.nextInt());
		
		System.out.println("");
		
		System.out.println("Enter the number of numbers in the list");	
		for(int ndx = 0; ndx < count ; ndx++) {
			
			values = keyboard.nextFloat();
			
			floatArray.add(values);
			
		}
		
		Collections.sort(floatArray);
		
		System.out.println("List in ascending sort order is:");
		System.out.println(floatArray);
		
		System.out.println("");
		
		Collections.sort(floatArray, Collections.reverseOrder());
			
		System.out.println("List in descending sort order is:");
		System.out.println(floatArray);
	
	keyboard.close();
		
	}
	
}
