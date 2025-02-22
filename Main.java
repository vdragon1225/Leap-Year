import java.util.Scanner; // import Scanner

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); // Declare Scanner
      int inputYear; // holds the year the user inputs
      boolean isLeapYear; // holds whether the input year is leap or not
      
      isLeapYear = false; // set default to not a leap year

      // Prompt user to enter a year
      System.out.print("Enter a year: ");
      inputYear = scnr.nextInt(); // set inputYear equal to user's input
      
      // Check if inputYear's last two digits are equal to 0. 
      // Check for century years. For example "1700" or "1800."
      if (inputYear % 100 == 0) {
          
        // Check if inputYear is divisble by 400. Century years must
        // be divisible by 400 to be a leap year
        if (inputYear % 400 == 0) {
            System.out.println(inputYear + " - leap year"); // Output that it is a leap year
        }
        else {
            System.out.println(inputYear + " - not a leap year"); 
        }
      }
      // If it isn't a century year, check if inputYear is divisble by 4
      else if (inputYear % 4 == 0) {
        System.out.println(inputYear + " - leap year"); // Output that it is a leap year
      }
      else {
        System.out.println(inputYear + " - not a leap year"); // Output that it is not a leap year
      }

      // Close Scanner
      scnr.close();
   }
}
