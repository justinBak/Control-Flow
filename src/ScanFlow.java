import java.util.Random;
import java.util.Scanner;
public class ScanFlow {
	
	public static int clampNumber(int value, int start, int end) {
		int range=end-start+1;
		while(value>end) {
			value -= range;
		}
		while(value<start) {
			value+=range;
		}
		return value;
	}
	
	public static void main(String[] args) {
		
		  Scanner input = new Scanner(System.in);
		  int magicBall;
		  
		  Random generator = new Random();
		  
		  int randomNumber1 = generator.nextInt(65)+1;
		  int randomNumber2 = generator.nextInt(65)+1;
		  int randomNumber3 = generator.nextInt(65)+1;
		  final int MAX_NORMAL_BALL = 65;
		  final int MAX_MAGIC_BALL = 75;
		  
		  for (;;) {
			  System.out.println("\nWould you like to continue to the interactive portion of this survey?");
			  String response = input.nextLine();
			  
			  if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
		
				  if (!response.equals(null)) {
					  
					  System.out.println("What is the name of your favorite pet?");
					  String favPet = input.nextLine();
					  
					  System.out.println("What is the age of your favorite pet?");
					  String petAge = input.nextLine();
					  
					  System.out.println("What is your lucky number?");
					  int luckyNum = Integer.parseInt(input.nextLine());
					  magicBall = luckyNum * randomNumber1;
					  
					  System.out.println("Do you have a favorite quarterback? (yes/no)");
					  String favQtr = input.nextLine();
		
					  if (favQtr.equals("yes")) {
						  System.out.println("What is your favorite jersey number? ");
						  Integer jerNumber = Integer.parseInt(input.nextLine());
						  magicBall = jerNumber * randomNumber1;
					  }
				
					  System.out.println("What is the two-digit model year of your car?");
					  int modelYear = Integer.parseInt(input.nextLine());
					  int index2 = modelYear + luckyNum;
					  
					  System.out.println("What is the first name of your favorite actor or actress?");
					  String favAct = input.nextLine();
					  
					  System.out.println("Enter a random number between 1 and 50.");
					  int randNum = Integer.parseInt(input.nextLine());
					  int index3 = randomNumber2 - randNum;
							  
					  magicBall = clampNumber(magicBall, 1, 75);
					  System.out.printf("Your MagicBall number is %s.", magicBall);
					  
					 /* int [] balls = {0,0,0,0,0};
					  balls[0] = favPet.charAt(3);
					  balls[0] = clampNumber(balls[0], 1, 65);
					  balls[1] = index2;
					  balls[1] = clampNumber(balls[0], 1, 65);
					  balls[2] = index3;
					  balls[2] = clampNumber(balls[0], 1, 65);
					  System.out.println(balls);*/
				  }
		
			  }
			  else {
				  System.out.println("Please return later to complete the survey");
				  break;
			  }
		  }
	}
}
