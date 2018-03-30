package ArrayList_Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class doubleSort {
	static ArrayList<Double> doubleArray = new ArrayList<Double>();
	
	public static void main(String[] args) {
		int count = 0;
		double values = 0d;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the number of numbers in the list");
		count = (keyboard.nextInt());
		
		System.out.println("");
		
		System.out.println("Enter the number of numbers in the list");	
		for(int ndx = 0; ndx < count ; ndx++) {
			
			values = keyboard.nextDouble();
			
			doubleArray.add(values);
			
		}
		
		// Sorting array in ascending order.
		Collections.sort(doubleArray);
		
		System.out.println("List in ascending sort order is:");
		System.out.println(doubleArray);
		
		System.out.println("");
	
		Collections.sort(doubleArray, Collections.reverseOrder());
			
		System.out.println("List in descending sort order is:");
		System.out.println(doubleArray);
		
	keyboard.close();
		
	}
	
}
