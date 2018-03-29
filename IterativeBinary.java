package searchExamples;

import java.util.Arrays;

public class IterativeBinarySearch {
	
	private static int data[] = {0,6,2,7,4,8,3,5,1,9};
	
	public static int iterativeBinarySearch (int d[], int g) {
		Arrays.sort(data);
		int left = 0; 
		int middle = (d.length-1)/2;
		int right = d.length-1;
		
		while (d[middle] != g && left <= right) {
			if (d[middle] > g) right = middle-1;
			else left = middle+1;
			middle = (left + right)/2;
		}
		if (d[middle] == g) return middle;
		else return -1;
	}
	
	public static void main (String [] args) {
		int goal = 9;
		int result = iterativeBinarySearch(data, goal);
		if (result < 0) System.out.println("The search could not find: " + goal);
		else System.out.println("The goal of " + goal + " was found at index: " + result);
	}

}
