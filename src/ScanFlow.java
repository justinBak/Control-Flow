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
		
		  System.out.println("Please enter your name:");
		  String name = input.nextLine();
		  System.out.printf("Hello, %s!\n", name);
		
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
					  int petAge = Integer.parseInt(input.nextLine());
					  
					  System.out.println("What is your lucky number?");
					  int luckyNum = Integer.parseInt(input.nextLine());
					  magicBall = luckyNum * randomNumber1;
					  
					  System.out.println("Do you have a favorite quarterback? (yes/no)");
					  String favQtr = input.nextLine();
		
					  if (favQtr.equalsIgnoreCase("yes")) {
						  System.out.println("What is your favorite jersey number? ");
						  Integer jerNumber = Integer.parseInt(input.nextLine());
						  magicBall = jerNumber * randomNumber1;
					  }
				
					  System.out.println("What is the two-digit model year of your car?");
					  int modelYear = Integer.parseInt(input.nextLine());
					  int index1 = modelYear + luckyNum;
					  
					  System.out.println("What is the first name of your favorite actor or actress?");
					  String favAct = input.nextLine();
					  
					  System.out.println("Enter a random number between 1 and 50.");
					  int randNum = Integer.parseInt(input.nextLine());
					  int index2 = randomNumber2 - randNum;
							  
					  magicBall = clampNumber(magicBall, 1, 75);
					  
					  //char value = favPet.charAt(2);
					  //value += 1;
					  //int number = value;
					  int [] balls = new int[5];
					  balls[0] = clampNumber(favPet.charAt(2), 1, 65);
					  balls[1] = clampNumber(index1, 1, 65);
					  balls[2] = clampNumber(index2, 1, 65);
					  balls[3] = clampNumber(favAct.charAt(0), 1, 65);
					  balls[4] = clampNumber(favAct.length()-1, 1, 65);	  
					  System.out.printf("Lottery numbers: %d, %d, %d, %d, %d Magic ball: %d", balls[0], balls[1], balls[2], balls[3], balls[4], magicBall);
				  }
		
			  }
			  else {
				  System.out.println("Please return later to complete the survey");
				  break;
			  }
		  }
	}
}
