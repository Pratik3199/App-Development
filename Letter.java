/**
 * author: - Pratik
 */
package RecurionPuzzlesTemplets;

import java.util.Scanner;

public class Letter {
	
		static String result = "";
		public static void main(String[] args) {
			char nth_char;
			Scanner keyboard = new Scanner(System.in);
			//Enter the character for which you want implementation
			System.out.print("Enter any character : - ");
			nth_char = keyboard.next().charAt(0);
			
			System.out.println("");		
			System.out.println("String :" + letter(nth_char));
			
			keyboard.close();	
		}
		private static String letter(char ch) {
			
			result= ch + result;
			if (ch == 'a') return result;
			
			return letter(--ch);
		    
		}

	}
//This code is contributed by Pratik Singh//
