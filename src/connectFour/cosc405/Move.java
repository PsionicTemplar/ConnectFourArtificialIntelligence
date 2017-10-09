package connectFour.cosc405;


// Do we need this class?

public class Move {
    private int heurVal;
    private int bestRow;
    private int bestCol;
    
    public Move(){
        this.heurVal = 0;
        this.bestRow = 0;
        this.bestCol = 0;
    }
    
    public void set_heurVal(int h){
        heurVal = h;
    }
    
    public int get_heurVal(){
        return heurVal;
    }
    
    public void set_bestRow(int br){
        bestRow = br;
    }
    
    public int get_bestRow(){
        return bestRow;
    }
    
    public void set_bestCol(int bc){
        bestCol = bc;
    }
    
    public int get_bestCol(){
        return bestCol;
    }
}

