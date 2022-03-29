import java.util.Random;
import java.util.Scanner;
public class AsciiChars {
	
	public static void printNumbers()  
	{
	    // TODO: print valid numeric input
		  for(char i = 48; i <= 57; ++i) {
			  System.out.println(i);
		  }
	}
	public static void printLowerCase()
	{
	    // TODO: print valid lowercase alphabetic input
		  for(char i = 97; i <= 122; ++i) {
			  System.out.println(i);
		  }
	}
	
	public static void printUpperCase()
	{
	    // TODO: print valid uppercase alphabetic input
		  for(char i = 65; i <= 90; ++i) {
			  System.out.println(i);
		  }
	}
	  
	public static void main(String[] args) 
	{
			Random random = new Random(); 
		  printNumbers();
		  printLowerCase();
		  printUpperCase();
		  
		  Scanner input = new Scanner(System.in);
		  
		  System.out.println("Please enter your name:");
		  String name = input.nextLine();
		  System.out.printf("Hello, %s!\n", name);
		  
		  System.out.println("Would you like to continue to the interactive portion of this survey?");
		  String response = input.nextLine();
	  
		  while (!response.equals(null)) {
			  if(response.equals("yes") || response.equals("y")) {
				  System.out.println("What is the name of your favorite pet?");
				  String favPet = input.nextLine();
				  System.out.println("What is the age of your favorite pet?");
				  String petAge = input.nextLine();
				  System.out.println("What is your lucky number?");
				  int luckyNum = Integer.parseInt(input.nextLine());
				  System.out.println("Do you have a favorite quarterback? (yes/no)");
				  String favQtr = input.nextLine();
				  if (favQtr.equals("yes")) {
					  System.out.println("What is your favorite jersey number? ");
				  }
				  Integer jerNum = Integer.parseInt(input.nextLine());
				  System.out.println("What is the two-digit model year of your car?");
				  int modelYear = Integer.parseInt(input.nextLine());
				  System.out.println("What is the first name of your favorite actor or actress?");
				  String favAct = input.nextLine();
				  System.out.println("Enter a random number between 1 and 50.");
				  int randNum = Integer.parseInt(input.nextLine());
				  
				  int generatedNum = random.nextInt(75);
				  System.out.println("Here is your magic ball number:");
				  if (jerNum != null) {
					  int magicBall = 
				  }
			  } else {
				  System.out.println("Please return later to complete the survey");
					  break;
				}
		  }
	 }
}