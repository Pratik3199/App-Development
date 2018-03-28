package position;

import java.util.Scanner;

public class Students {

	// Sring containg names of 10 students
	private static String data[] = {"Sanchit", "Pratik", "Arjun", "Sukrut", "Jaskirat", "Sumit", "Yashul", 
			                            "Prince", "Vaibhav Mehndirattta", "Viabhav Mishra","Muskan","Dolly", "Mansi"};
	
	/*************
	 * This method takes the String and the name to be serach and use the itrative method to search the name
	 * in teh data. If the name is found in the data then it returns the index of the name index in the data
	 * if isn't found then it returns -1.
	 * 
	 * @param d
	 * @param g
	 * @return
	 */
	public static int search(String d[], String g) {
		
		int ndx = 0;
		for(ndx =0;	ndx < d.length; ndx++) {
		while (d[ndx].equalsIgnoreCase(g)) {  // Here we ignore the case of the word

			return ndx;                       // If the name is found then return the index where it was found
		}
	}
		
		return -1;                            // If name is not found the return -1
	}
	
	
	public static void main (String [] args) {
		String nameToFind;
		
		Scanner temp = new Scanner(System.in);
		
		nameToFind = temp.next();                // Take input of the name to be sea
		
		int index = search(data, nameToFind);
		
		if(index<0)
			
			System.out.println("The search could not find:" + nameToFind);
		else
			System.out.println(nameToFind + " was found at index: " + index);
		    
		temp.close();
		
	}
}
