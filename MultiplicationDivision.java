/**
* @Author: Pratik
*/
import java.util.Scanner;
	
	public class Computation {
		public static void main(String[] args) {
			
			Scanner keyboard = new Scanner(System.in);
					System.out.println("Enter the first Measured Value: - ");
					double MeasuredValue1 = keyboard.nextDouble();
					System.out.println("Error the first Error Term: - ");
					double ErrorTerm1 = keyboard.nextDouble();
					
					System.out.println("Enter the second Measured Value: - ");
					double MeasuredValue2 = keyboard.nextDouble();
					System.out.println("Error the second Error Term: - ");
					double ErrorTerm2 = keyboard.nextDouble();
					
					System.out.println("Enter Mpy or Div for the computation");
					String a = keyboard.next();
					
					
					 if(a.equals("Mpy")) {
					
					double result3 = MeasuredValue1 * MeasuredValue2;
					double resultError3 = (ErrorTerm1 / MeasuredValue1 + ErrorTerm2 / MeasuredValue2) * (MeasuredValue1 * MeasuredValue2);
					
				System.out.println("Multiplication: - " + result3 +  " ± " + resultError3 );
					}
					 System.out.println("Enter Mpy or Div for the computation");
					 String b = keyboard.next();

				 if(b.equals("Div")) {	
					double result4 = MeasuredValue1 / MeasuredValue2;
					double resultError4 = (ErrorTerm1 / MeasuredValue1 + ErrorTerm2 / MeasuredValue2) * (MeasuredValue1 / MeasuredValue2);

				System.out.println("Division: -" + result4  + " ± "  + resultError4 );
					}
     }
	
	}
