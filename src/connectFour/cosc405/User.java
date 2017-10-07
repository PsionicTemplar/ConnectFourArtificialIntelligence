//package connectFour.cosc405;

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
    private char board_Arr[][] = new char[6][7]; // Literal copy of our board
    private int displace[];       // Keeps track of vertical spaces already taken
    
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
            
            if(choice==1){
                this.setMove();
            }
            else
                this.set_OpponentMove();
        }
        
        public void setMove(){
            
            this.checkTopRow();
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
            
            this.print_Board();
            this.set_OpponentMove();
        }
        
        public void set_OpponentMove(){
        	int playerHeur = 10;
        	int oppHeur = 10;
        	int playerMove = 0;
        	int oppMove = 0;
        	
        	for (int i = 0; i <= 6; i++){
        		if (displace[i] != 0){
        			board_Arr[displace[i]][i] = 'O';
        			--displace[i];
        			//check_Heur(i);
        		
        		
        		for (int j = 0; j <= 6; j++){
            		if (displace[j] != 0){
            			int x = check_Heur(j);
            			if(playerHeur > x){
            				playerHeur = x;
            				playerMove = j;
            			}
            		}
        		}
        		int x = check_Heur(i);
        		check_Heur(i);
        		if(oppHeur > x){
        			oppHeur = x;
        			oppMove = i;
        		}
        		}
        		
    			board_Arr[displace[i]][i] = ' ';
    			++displace[i];
        		
        	}
        	
        	if(playerHeur == 1){
        		//block player
        		board_Arr[playerMove][playerMove] = 'O';
        	} else {
        		board_Arr[oppMove][oppMove] = 'O';
        		//make good move
        	}
        	
        	this.print_Board();
        	this.setMove();
        }
        	
        	
    /*
     * old opponent move        
            int r = rand.nextInt(7);
            
            this.checkTopRow();
            
            if(displace[r] <= -1){
                this.print_colFullError(0);
            }
            else
                board_Arr[displace[r]][r] = 'O';
                    --displace[r];
                    
           this.print_Board();
           this.setMove();
           }
	*/
        
        public int check_Heur(int move){
        	//To be filled Check
        	return 0;
        }
        
        public void checkTopRow(){
            int count = 0;
            
            for(int i = 0; i < 7; i++){
                if(board_Arr[0][i] == 'X' || board_Arr[0][i] == 'O'){
                    count++;
                }
            }
            if(count == 7){
                this.gameOver();
            }
            else
                count = 0;
                return;
            
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
        
        public void gameOver(){
            System.out.print("\nNO WINNER!\n");
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
        public char[][] reset_Board(){
            for(int i = 0; i < 6; i++){
                for(int z = 0; z < 7; z++){
                    board_Arr[i][z] = ' ';
                }
            }
            return board_Arr;
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
    
}