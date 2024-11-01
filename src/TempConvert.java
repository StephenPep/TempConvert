import java.util.Scanner;
/* This java utility imported will 
 * help take input from the user
 */

public class TempConvert {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// This indicates that there will be an input by the user
	 	System.out.println("What is your temperature(C)? ");
	 	// Asking for the prompt from the user
	 	double temp = input.nextDouble();
	 	
	 	/* To convert from Celcius to degree, we must first multiply
	 	 * the value in Celcius by 1.8. 
	 	 * And finally add 32 to the figure gotten.
	 	 */
	 	double convert_temp1 = temp * 1.8;
	 	double convert_temp_final = convert_temp1 + 32;
	 	
	 	
	 	/* Finally to be able to round if off, we must first import the math round method,
	 	 *  multiply the figure by 100 and subsequently divide the gotten figure by 100.
	 	 */
	 	double convert_temp_final1 = Math.round(convert_temp_final* 100.0)/100.0;
	 	
	 	
	 	System.out.println("Your temperature in Fahrenheit is " + convert_temp_final1);
	 	// Printing out the temperature of the user in Fahrenheit.
	 	
	 	
	 	System.out.println("Go Hatters!!");
	 	System.out.println("Program by: Stephen Peprah Wereko");
	 	
	 	
	 	}

}
