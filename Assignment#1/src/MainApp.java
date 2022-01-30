/* Student Name: Jennifer Tran
 * Lab Professor: Mohammed Patoary
 * Due Date: October 8,2021
 * Description: Create a program calculating 2 things
 			1) the amount of weather-stripping needed for a door in cm
 			2) the amount of packages needed
 */

import java.util.Scanner; // Scanner class for inputs

public class MainApp { // This program will allow the user to input data to get the calculation of weather strip needed and packages needed

	public static void main (String[]args) { //start of program
	
	Scanner keyboard = new Scanner(System.in); // new scanner for inputs
		
	Door Door = new Door(); // Create or instantiate a Door object called Door
	StaffMember StaffMember = new StaffMember(); // Create or instantiate a StaffMember object called StaffMember
	double height, width, length, weatherStripTotal,packageTotal; // declared variables 
	

	System.out.print("Enter door height (cm): "); // programs output
	height = keyboard.nextDouble(); // users height input
	keyboard.nextLine(); // To remove the new line character from the input
	
	System.out.print("Enter door width (cm): "); // programs output
	width = keyboard.nextDouble(); // users width input
	keyboard.nextLine(); // To remove the new line character from the input
	
	System.out.print("Enter packages stripping length (cm) "); //programs output
	length = keyboard.nextDouble(); // users length input
	

	// declaring variables from Door class & StaffMember class
	Door.setHeight(height);
	Door.setLength(length);
	Door.setWidth(width);
	weatherStripTotal = Door.weatherStripTotal(); // without arguements
	packageTotal = StaffMember.calculateTotalPackages(weatherStripTotal, length); // with arguements
	
	System.out.println("Weather Stripping needed "+weatherStripTotal+" cm"); // outputs string along with the weather strip total

	System.out.println("Packages needed "+packageTotal+" ");// output string along with the total of packages
	
 
	System.out.println("Program by Jennifer Tran"); // output of programmer


	}// end of main
}// end of class