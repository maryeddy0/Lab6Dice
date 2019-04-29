import java.util.Random;
import java.util.Scanner;

public class Lab6Dice {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String roll = null;

		System.out.println("WELCOME TO GRAND CIRCUS CASINO \n");

		do {
			System.out.println("how many sides should each die have?");
			int nSided = scan.nextInt();
	
//			int end = 100;
//			for (int i = 1; i < end; i++) 

				System.out.println("Roll " + 1);
				System.out.println(generateRandomDieRoll(nSided));
				System.out.println(generateRandomDieRoll(nSided));

				System.out.println("Roll again? y/n");
				roll = scan.next();
			
		} while (roll.equalsIgnoreCase("y"));
		System.out.print("goodbye.");

	}

	public static int generateRandomDieRoll(int max) {
		Random r = new Random();
		return r.nextInt((max - 1) + 1) + 1;

	}
//
//	public static int roll (int num) {
//		int i;	
//		for (i = 0; i < num; i++) {
//			}
//			return num + i;

}
