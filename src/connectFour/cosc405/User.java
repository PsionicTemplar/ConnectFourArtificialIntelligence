package connectFour.cosc405;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alexw
 */
public class User {
	private Scanner u_scan = new Scanner(System.in);
	private Random rand = new Random();


	public static char board_Arr[][] = new char[6][7]; // Literal copy of our board
        public static String board_Arr_Dupe[][] = new String[6][7];
	public static int displace[] = new int[7]; // Keeps track of vertical spaces
											// already taken

      
	public User() {
		

		for (int i = 0; i < 6; i++) {
			for (int z = 0; z < 7; z++) {
				board_Arr_Dupe[i][z] = " ";
                                
			}
		}
	}

	public int height(int x){
            boolean check = true;
            int n = 0;
            while(check){
                for(int h = 0; h < 6; h++)
                {
                    if(" ".equals(board_Arr_Dupe[h][x])){
                        check = false;
                        
                    }
                     else
                        n++;
                }
            }
            return n;
        }

	public void setMove(int x) {

            board_Arr_Dupe[height(x)][x - 1] = "X";                    
           	
	}

	public void set_OpponentMove(int x) {

		int r = rand.nextInt(7);

		this.checkTopRow();

		if (displace[r] <= -1) {
			
		} else
			board_Arr_Dupe[displace[r]][r] = "O";
		

		
		
	}

	public void checkTopRow() {
		int count = 0;

		for (int i = 0; i < 7; i++) {
			if (board_Arr[0][i] == 'X' || board_Arr[0][i] == 'O') {
				count++;
			}
		}
		if (count == 7) {
			this.gameOver();
		} else
			count = 0;
		return;

	}

	

	public void gameOver() {
		System.out.print("\nNO WINNER!\n");
		System.exit(0);
	}

	

	public void print_ExitEarly() {
		System.out.print("ENTER 8 TO QUIT AT ANYTIME\n");
		try {
			// thread to sleep for 1000 milliseconds
			Thread.sleep(1000);
		} catch (Exception e) {
			return;
		}
	}

	public void print_Board() {
		System.out.print("---------------\n");

		for (int i = 0; i < 6; i++) {
			for (int z = 0; z < 7; z++) {
				if (z == 6) {
					System.out.print("|" + board_Arr[i][z] + "|");
				} else
					System.out.print("|" + board_Arr[i][z]);
			}
			System.out.append("\n");
		}
		System.out.print("|1|2|3|4|5|6|7|\n");
	}

	public char[][] reset_Board() {
		for (int i = 0; i < 6; i++) {
			for (int z = 0; z < 7; z++) {
				board_Arr[i][z] = ' ';
			}
		}
		return board_Arr;
	}

	// x = 0-6 y = 0-5
	public boolean checkWin(int x, int y, char c) {
		HashMap<Integer, List<Integer>> win = new HashMap<Integer, List<Integer>>();
		char[][] arr = board_Arr.clone();
		if (arr[y][x] != c) {
			arr[y][x] = c;
		}
		for (int i = 0; i < 7; i++) {
			if (arr[y][i] != c) {
				win = new HashMap<Integer, List<Integer>>();
				continue;
			} else {
				if (win.containsKey(y)) {
					List<Integer> l = win.get(y);
					l.add(i);
					win.put(y, l);
					if (l.size() == 4) {
						return true;
					}
				} else {
					List<Integer> l = new ArrayList<Integer>();
					l.add(i);
					win.put(y, l);
				}
			}
		}

		for (int i = 5; i > -1; i--) {
			if (arr[i][x] != c) {
				win = new HashMap<Integer, List<Integer>>();
				continue;
			} else {
				if (win.containsKey(x)) {
					List<Integer> l = win.get(x);
					l.add(i);
					win.put(x, l);
					if (l.size() == 4) {
						return true;
					}
				} else {
					List<Integer> l = new ArrayList<Integer>();
					l.add(i);
					win.put(x, l);
				}
			}
		}

		boolean stopLoop = false;
		int tempX = x;
		int tempY = y;

		while (!stopLoop) {
			if (tempX == 0 || tempY == 5) {
				stopLoop = true;
				continue;
			}
			tempX--;
			tempY++;
		}
		int counter = 0;
		
		stopLoop = false;
		while (!stopLoop) {
			if (arr[tempY][tempX] != c) {
				counter = 0;
				tempY--;
				tempX++;
				if(tempY < 0){
					break;
				}
				if(tempX > 6){
					break;
				}
				continue;
			} else {
				counter++;
				if (counter == 4) {
					return true;
				}
				tempY--;
				tempX++;
				if(tempY < 0){
					break;
				}
				if(tempX > 6){
					break;
				}
			}
		}
		stopLoop = false;
		tempX = x;
		tempY = y;

		while (!stopLoop) {
			if (tempX == 6 || tempY == 5) {
				stopLoop = true;
				continue;
			}
			tempX++;
			tempY++;
		}
		stopLoop = false;
		while (!stopLoop) {
			if (arr[tempY][tempX] != c) {
				counter = 0;
				tempY--;
				tempX--;
				if(tempY < 0){
					break;
				}
				if(tempX < 0){
					break;
				}
				continue;
			} else {
				counter++;
				if (counter == 4) {
					return true;
				}
				tempY--;
				tempX--;
				if(tempY < 0){
					break;
				}
				if(tempX < 0){
					break;
				}
			}
		}

		return false;
	}

}
