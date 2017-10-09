//package connectFour.cosc405;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class User {

    private Scanner u_scan = new Scanner(System.in);
    private Random rand = new Random();
    private char board_Arr[][] = new char[6][7];
    private int displace[];
    
        public User(){
            displace = new int[]{5,5,5,5,5,5,5};

            for(int i = 0; i < 6; i++){
                for(int z = 0; z < 7; z++){
                    board_Arr[i][z] = ' ';
                }
            }
        }
        public void set_Choice(){
            System.out.print("----------------------------------\n");
            System.out.print("Who will play first? 1=User, 0=Bot:");
            
            int choice = u_scan.nextInt();
            
            this.print_Board();
            
            if(choice==8){
                this.quitPrompt();
            }
            else if(choice==1){
                this.setMove();
            }
            else
                this.set_OpponentMove();
        }
        
        public void setMove(){
            
            this.checkTopRow('X');
            System.out.print("Select your next move:");
            int move = 0;
            
            try{
                move = u_scan.nextInt();
                    if(displace[move-1] == -1){
                        this.print_colFullError(1);
                    }
                    else
                        board_Arr[displace[move-1]][move-1] = 'X';
                            --displace[move-1];
                            
            }catch(Exception e){
                if(move == 8){
                    this.quitPrompt();
                }
                
                System.out.print("\nPlease enter a value 1-7\n");
                this.setMove();
            } 
            if(this.checkWin(move-1, displace[move-1]+1, 'X')){
                this.print_Board();
                this.gameOver(1, 'X');
                return;
            }
            this.print_Board();
            this.set_OpponentMove();
        }
        
        public void set_OpponentMove(){
        	int playerHeur = 10;
        	int oppHeur = 10;
        	int playerMove = 0;
        	int oppMove = 0;
       /* 	
        	if(this.firstMove){
        		this.firstMove = false;
        		int r = rand.nextInt(7);
        		board_Arr[displace[r]][r] = 'O';
        		displace[r]--;
        		this.print_Board();
            	this.setMove();
        		return;
        	}
        	*/	
        	for (int i = 0; i <= 6; i++){
        		if (displace[i] > -1){
        			board_Arr[displace[i]][i] = 'O';
        			//check_Heur(i);	
        		
        		for (int j = 0; j <= 6; j++){
            		if (displace[j] > -1){
            			System.out.println(j);
            			int x = check_Heur(j, 'X');
            			//System.out.println("Player move: " + j);
            			//System.out.println("Player heur val: " + x);
            			if(playerHeur > x){
            				playerHeur = x;
            				playerMove = j;
            			}
            		}
        		}
    			board_Arr[displace[i]][i] = ' ';
        		int x = check_Heur(i, 'O');
        		//System.out.println("Opp move: " + i);
        		//System.out.println("Opp heur val: " + x);
        		check_Heur(i, 'O');
        		if(oppHeur > x){
        			oppHeur = x;
        			oppMove = i;
        		}
        		}     		
        	}
        	
        	if(playerHeur == 1){
        		//System.out.println(playerMove);
        		board_Arr[displace[playerMove]][playerMove] = 'O';
        		if(this.checkWin(playerMove, displace[playerMove], 'O')){
        			this.print_Board();
        			this.gameOver(1, 'O');
        			return;
        		}
        		displace[playerMove]--;
        	} else {
        		//System.out.println(oppMove);
        		board_Arr[displace[oppMove]][oppMove] = 'O';
				if(this.checkWin(oppMove, displace[oppMove], 'O')){
					this.print_Board();
					this.gameOver(1, 'O');
        			return;
        		}
        		displace[oppMove]--;
        	}
        	
        	this.print_Board();
        	this.setMove();
        }        

        
        /* 
            If your passing the users requested move remember to subtract
            one. This function needs the move and the mark of the player
            i.e 'X' for player, 'O' for oppenent.
        */
        public int check_Heur(int move, char player_Mark){
            int[] heurList = new int[4];
            int bestHeur = 0;
            
            heurList[0] = this.checkUpDo(move, player_Mark);
            heurList[1] = this.checkSides(move, player_Mark);
            heurList[2] = this.check_Ldiag(move, player_Mark);
            heurList[3] = this.check_Rdiag(move, player_Mark);
            
            bestHeur = heurList[0];
            
            for(int i = 0; i < 4; i++){
                if(heurList[i] < bestHeur){
                    bestHeur = heurList[i];
                }
            } 
      
            return bestHeur;
        }
        
        private int checkUpDo(int move, char player_Mark){
            int sign_Count = 0;  // player specific sign found
            int blank_Count = 0; //# of blanks until win
            
            //Check Down
            for(int z = displace[move]+1; z < 6; z++){
                if(board_Arr[z][move] == player_Mark){
                    sign_Count++;
                }
                else
                    break;
            }
            if(displace[move]-4 < 0){
                return 100;
            }else{
                return 4-sign_Count;
            }
            
            /*
            //Check Up
            for(int i = displace[move]; i > -1; i--){
             
                if(sign_Count + blank_Count == 3){
                    break;
                }
                else
                    if(board_Arr[i][move] == ' '){
                        blank_Count++;
                    }
                    else
                        break;
            }
            
            if(blank_Count + sign_Count < 3){
                        blank_Count = 10;
                    }
            
            return blank_Count;
            */
        }
        
        private int checkSides(int move, char player_Mark){
            int sign_Count = 0;
            int blank_Count = 0;
            int blanks2fill = 0;
            
            for(int z = move-1; z > -1; z--){
                if(sign_Count + blank_Count == 3){
                    break;
                }
                else if(board_Arr[displace[move]][z] == player_Mark){
                    sign_Count++;
                }
                else if(board_Arr[displace[move]][z] == ' '){
                    blank_Count++;
                    
                    for(int k = displace[move]+1; k < 6; k++){
                        if(board_Arr[k][move] == ' '){
                            blanks2fill++;
                        }
                    }
                }
                else
                    break;
            }
            
            //Check Right
            for(int i = move+1; i < 7; i++){
                if(sign_Count + blank_Count == 3){
                    break;
                }
                else if(board_Arr[displace[move]][i] == player_Mark){
                    sign_Count++;
                    break;
                }
                else if(board_Arr[displace[move]][i] == ' '){
                    blank_Count++;
                    
                    for(int k = displace[move]+1; k < 6; k++){
                        if(board_Arr[k][move] == ' '){
                            blanks2fill++;
                        }
                    }
                }
                else
                    break;
            }
            
            if(blank_Count + sign_Count < 3){
                        blank_Count = 10;
                    }
            
            return blank_Count + blanks2fill;
        }
        
        private int check_Ldiag(int move, char player_Mark){
            int sign_Count = 0;
            int blank_Count = 0;
            int blanks2fill = 0;
            
            // Check Down & Right
            outloop1:
            for(int i = displace[move]+1; i < 6; i++){
                for(int z = move+1; z < 7; z++){
                    if(board_Arr[i][z] == player_Mark){
                        sign_Count++;
                    }
                    else if(board_Arr[i][z] == ' '){
                        blank_Count++;
                        
                        for(int k = i; k < 6; k++){
                            if(board_Arr[k][z] == ' '){
                                blanks2fill++;
                            }
                        }
                    }
                    else
                        break outloop1;
                }
            }
            
            // Check Up and Left
            outloop2:
            for(int i = displace[move]-1; i > -1; i--){
                for(int z = move-1; z > -1; z--){
                    if(blank_Count + sign_Count == 3){
                        break outloop2;
                    }
                    if(board_Arr[i][z] == player_Mark){
                        sign_Count++;
                    }
                    else if(board_Arr[i][z] == ' '){
                        blank_Count++;
                        for(int k = i; k < 6; k++){
                            if(board_Arr[k][z] == ' '){
                                blanks2fill++;
                            }
                        }
                    }
                    else
                        break outloop2;
                }
            }
            if(blank_Count + sign_Count < 3){
                        blank_Count = 10;
                    }
           
            return blank_Count + blanks2fill;
        }
        
        private int check_Rdiag(int move, char player_Mark){
            int sign_Count = 0;
            int blank_Count = 0;
            int blanks2fill = 0;
            
            //Check Down and Left
            outloop1:
            for(int i = displace[move]+1; i > 6; i++){
                for(int z = move-1; z > -1; z--){
                    if(board_Arr[i][z] == player_Mark){
                        sign_Count++;
                    }
                    else if(board_Arr[i][z] == ' '){
                        blank_Count++;
                        for(int k = i; k < 6; k++){
                            if(board_Arr[k][z] == ' '){
                                blanks2fill++;
                            }
                        }
                    }
                    else
                        break outloop1;
                }
            }
            // Check Up and Right
            outloop2:
            for(int i = displace[move]-1; i < -1; i--){
                for(int z = move+1; z < 7; z++){
                    if(blank_Count + sign_Count == 3){
                        break outloop2;
                    }
                    else if(board_Arr[i][z] == player_Mark){
                        sign_Count++;
                    }
                    else if(board_Arr[i][z] == ' '){
                        blank_Count++;
                        for(int k = i; k < 6; k++){
                            if(board_Arr[k][z] == ' '){
                                blanks2fill++;
                            }
                        }
                    }
                    else
                        break outloop2;
                }
            }
            
            if(blank_Count + sign_Count < 3){
                        blank_Count = 10;
                    }
           
            return blank_Count + blanks2fill;
        }
        
        public void checkTopRow(char playerMark){
            int count = 0;
            
            for(int i = 0; i < 7; i++){
                if(board_Arr[0][i] == 'X' || board_Arr[0][i] == 'O'){
                    count++;
                }
            }
            if(count == 7){
                this.gameOver(0, playerMark);
            }
            else
                count = 0;
                return;
            
        }
        
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
        
        public void quitPrompt(){
        
            System.out.print("\n---------------------------------------------");
            System.out.print("\nAre you sure you want to quit? YES[1] NO[2]:");
            try{
                int b = u_scan.nextInt();
                if(b == 2){
                    this.setMove();
                }
                else
                    System.out.print("\n-----------");
                    System.out.print("\nGame Exited\n");
                    System.out.print("-----------\n");
                    System.exit(0);
            }catch(Exception e){
                System.out.print("Please enter a 1 for yes or 2 for no");
                this.quitPrompt();
            }
        }
        
        public void gameOver(int i, char playerMark){
            
            if(i == 0){
                System.out.print("\nNO WINNER!\n");
            }
            else if(i == 1){
                if(playerMark == 'X'){
                    System.out.print("------------");
                    System.out.print("\nPlayer Wins!\n");
                    System.out.print("------------");
                }
                else if(playerMark == 'O'){
                    System.out.print("------------");
                    System.out.print("\nOpponent Wins!\n");
                    System.out.print("------------");
                }
            }
            System.out.print("\nWould you like to play again? YES[1], NO[0]:");
            int v = u_scan.nextInt();
            
            if(v == 1){
                this.reset_Board();
                this.set_Choice();
            }
            else
                System.exit(0);
        }
        
        public void print_colFullError(int t){
            /*
                This needs to automated so the user can re-take their turn.
            */
            
            if(t == 1){
                System.out.print("That column is already full!\n");
                //t = u_scan.nextInt();
                this.setMove();
            }
            else
                this.set_OpponentMove();
            
        }
        
        public void print_ExitEarly(){
            System.out.print("ENTER 8 TO QUIT AT ANYTIME\n");
        try {
            // thread to sleep for 1000 milliseconds
            Thread.sleep(1000);
         } catch (Exception e){
             return;
         }
        }
        
        public void print_Board(){
            System.out.print("---------------\n");
           
            for(int i = 0; i < 6; i++){
                for(int z = 0; z < 7; z++){
                    if(z == 6){
                        System.out.print("|" + board_Arr[i][z] + "|");
                    }
                    else
                    System.out.print("|" + board_Arr[i][z]);
                }
                System.out.append("\n");
            }
            System.out.print("|1|2|3|4|5|6|7|\n");
        }
        public void reset_Board(){
            for(int i = 0; i < 6; i++){
                for(int z = 0; z < 7; z++){
                    board_Arr[i][z] = ' ';
                }
            }
            for(int z = 0; z < 6; z++){
                displace[z] = 5;
            }
        }
    
}