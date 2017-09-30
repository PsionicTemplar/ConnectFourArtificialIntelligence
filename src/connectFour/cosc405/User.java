package connectFour.cosc405;

import java.util.Random;

import java.util.Scanner;

public class User {

	private Scanner u_scan = new Scanner(System.in);

	private Random rand = new Random();

	private char board_Arr[][] = new char[6][7]; // Literal copy of our board

	private int displace[] = new int[7]; // Keeps track of vertical spaces
											// already taken

	public User() {

		for (int z = 0; z < 7; z++) {

			displace[z] = 5;

		} // This is stupid but it doesnt initialize properly below!

		for (int i = 0; i < 6; i++) {

			for (int z = 0; z < 7; z++) {

				board_Arr[i][z] = ' ';

				// displace[i] = 5;

			}

		}

	}

	public void setMove(int move) {

		if (displace[move - 1] == -1) {

			this.print_colFullError();

		}

		else if (move == 7) {

			board_Arr[displace[move - 1]][move - 1] = 'X';

			--displace[move - 1];

		}

		else if (move != 7) {

			board_Arr[displace[move - 1]][move - 1] = 'X';

			--displace[move - 1];

		}

		this.set_OpponentMove();

	}

	public void set_OpponentMove() {

		/*
		 * This guy is dumb as hell but he works for testing!
		 * 
		 * To do:
		 * 
		 * -Add a brain, I was thinking of making 3 arrays that keep
		 * 
		 * track of up-down, side-side, diagonal but thats up for debat
		 * 
		 * obviously.
		 * 
		 * -What our Heuristic?
		 * 
		 */

		int c = rand.nextInt(6);

		board_Arr[displace[c]][c] = 'O';

		--displace[c];

	}

	public int print_colFullError() {

		/*
		 * 
		 * This needs to automated so the user can re-take their turn.
		 * 
		 */

		System.out.print("That column is already full!\n");

		return 6;

	}

	public void print_Board() {

		for (int i = 0; i < 6; i++) {

			for (int z = 0; z < 7; z++) {

				if (z == 6) {

					System.out.print("|" + board_Arr[i][z] + "|");

				}

				else

					System.out.print("|" + board_Arr[i][z]);

			}

			System.out.append("\n");

		}

	}

	public char[][] reset_Board() {

		for (int i = 0; i < 6; i++) {

			for (int z = 0; z < 7; z++) {

				board_Arr[i][z] = ' ';

			}

		}

		return board_Arr;

	}

}
