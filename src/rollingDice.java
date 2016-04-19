import java.util.Random;
import java.util.Scanner;

public class rollingDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean userDice = true;
		String userAnswer;

		Scanner scanner = new Scanner(System.in);
 
		//Begin app. Ask if user would like to roll the dice.
 		System.out.println("Welcome on the Grand Circus Casino! Roll the dice? (Y/N): ");
 		String userAnswer1 = scanner.next();

 	
 		//allow user to answer y or n
 		if (userAnswer1.equals("Y")) 
 			{userDice = true;}
 	
 		if (userAnswer1.equals("N")) 
 			{userDice = false;}
  
 		while (userDice){

 			//allow user to enter number of face on dice
 			System.out.println("Please enter the number of faces on your dice:");
 			int diceFaces = scanner.nextInt();
		
 			int roll = diceRoll(diceFaces);
 			int roll2 = diceRoll(diceFaces);
 			//randomly give numbers	& roll method
 			System.out.println("Roll 1:");
 			System.out.println();

 			//numbers that were generated
 			System.out.println(roll);
 			System.out.println(roll2);
	
 			//ask user if they want to repeat game		
 			System.out.println("Roll again? (Y/N):");
 			String userAnswer2 = scanner.next();
	
 			if (userAnswer2.equalsIgnoreCase("Y"))
 			{userDice = true;}
	
 			if (userAnswer2.equalsIgnoreCase("N"))
 			{userDice = false;}
	}
	}
	public static int diceRoll(int faces){
		Random rand = new Random();
		//get random number between 1 + faces
		int roll = rand.nextInt(faces) + 1;
		//return number
		return roll;
	}

}

	
