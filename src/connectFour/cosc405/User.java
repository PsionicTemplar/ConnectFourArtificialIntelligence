package connectFour.cosc405;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.lang.*;

/**
 *
 * @author alexw
 */
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
        
        public int check_Heur(int move){
            int heuristic = 0;
            
            
            return heuristic;
        }
        
        private int checkUpDo(int move){
            int heurSeg = 0;
            int count = 0;
            
            for(int i = displace[move]; i > -1; i--){
                count++;
             
                if(count == 5){
                    break;
                }
                else
                    if(board_Arr[i][move] != 'X'){
                        break;
                    }
                    else if(board_Arr[i][move] != 'O'){
                        heurSeg++;
                    }
                    
            }
            return heurSeg;
        }
        
        private int check
        
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
            System.out.print("Would you like to play again? YES[1], NO[0]:");
            int v = u_scan.nextInt();
            
            if(v == 1){
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
        public char[][] reset_Board(){
            for(int i = 0; i < 6; i++){
                for(int z = 0; z < 7; z++){
                    board_Arr[i][z] = ' ';
                }
            }
            return board_Arr;
        }
    
    }