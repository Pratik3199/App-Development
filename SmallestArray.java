/**
 * Author: - Pratik
 */

package recursivepuzzle;
public class Smallestelement{
     static int arr[] = {10, 24, 45, 90, -8};
      
     static int smallest()
     {
         int i;
          
         int min = arr[0];
       
         for (i = 1; i < arr.length; i++)
             if (arr[i] < min)
                 min = arr[i];
       
         return min;
     }
      
 
     public static void main(String[] args) 
     {
         System.out.println("Smallest array is " + smallest());
        }
 }
//This code is computed by PRATIK SINGH
