/**
 * Author: - Pratik
 */
package RecurionPuzzlesTemplets;

import java.util.Scanner;

public class Letter {
	
		static String result = "";
		public static void main(String[] args) {
			long start = System.nanoTime();
	    	 long stop = System.nanoTime();
			char nth_char;
			Scanner keyboard = new Scanner(System.in);
			//Enter the character for which you want implementation
			System.out.print("Enter any character : - ");
			nth_char = keyboard.next().charAt(0);
			
			System.out.println("");		
			System.out.println("String :" + letter(nth_char));
			  long duration = stop - start;
			    System.out.println("It took " + duration/1000000 + " milliseconds to compute this last value.");
			
			keyboard.close();	
		}
		private static String letter(char ch) {
			
			result= ch + result;
			if (ch == 'a') return result;
			
			return letter(--ch);
		    
		}

	}
//This code is contributed by Pratik Singh//
