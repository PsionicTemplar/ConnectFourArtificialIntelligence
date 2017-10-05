//package connectFour.cosc405;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		User player = new User();

		int req_Move = 0;

		player.print_Board();

		/*
		 * 
		 * Things to consider adding:
		 * 
		 * -Option to quit mid-game
		 * 
		 * -Option to choose who goes first
		 * 
		 * -Error checking i.e. input other than 1-7, and allow
		 * 
		 * user or AI to retake their turn
		 * 
		 * -A kickass GUI
		 * 
		 */

		for (int i = 0; i < 10; i++) {

			System.out.print("|1|2|3|4|5|6|7|\n");

			System.out.print("Select your next move:");

			req_Move = scan.nextInt();

			player.setMove(req_Move);

			player.print_Board();

		}

	}

}
