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
	    // TODO: print valid LowerCase alphabetic input
		  for(char i = 97; i <= 122; ++i) {
			  System.out.println(i);
		  }
	}
	
	public static void printUpperCase()
	{
	    // TODO: print valid UpperCase alphabetic input
		  for(char i = 65; i <= 90; ++i) {
			  System.out.println(i);
		  }
	}
	  
	public static void main(String[] args) 
	{
		  printNumbers();
		  printLowerCase();
		  printUpperCase();
		  
		  Scanner input = new Scanner(System.in);
		  
		  System.out.println("Please enter your name:");
		  String name = input.nextLine();
		  System.out.printf("Hello, %s!\n", name);
	  
	 }
}