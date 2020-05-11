/****************************************************************************
 *
 * Created by: Chris Asante
 * Date : April 2020
 * Created for : ICS4U
 * This program is a game of guessing numbers through 1-6
 * 
 ****************************************************************************/

import java.util.Random;
import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		int tries = 1;
		
		System.out.println("This is a game about guessing numbers.");
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		
		int random = new Random().nextInt(6) + 1;
		System.out.println("Pick a random number between 1 and 6.");
		
		do{
			int user = scanner.nextInt();
			if(random == user) {
				System.out.println("You guessed the right number!");
				System.out.println("You took " + tries + " tries. ");
				break;
			}
			else if(user > 6) {
				System.out.println("You can only input numbers between 1-6 !");
			}
			else{
				System.out.println("Keep Trying");
				tries++;
			}
			
		}while(true);
		
		scanner.close();

	}

}