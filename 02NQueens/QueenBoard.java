public class QueenBoard{

    private int[][] board;
    
    public QueenBoard(int size){
	board = new int[size][size];
	for( int stepperRow = 0; stepperRow < size; stepperRow++){
	    for( int stepperCol = 0; stepperCol < size; stepperCol++){
		board[stepperRow][stepperCol] = 0;
	    }
	}
    }

    public String toString(){
	String str = "";
	for( int stepperRow = 0; stepperRow < board.length; stepperRow++){
	    for(int stepperCol = 0; stepperCol < board.length; stepperCol++){
		if( board[stepperRow][stepperCol] == -1){
		    str += "Q";
		}else{
		    str += board[stepperRow][stepperCol];
		}
	    }
	    str += "\n";
	}
	return str;
    }

    private void /*boolean*/ addQueen(int r, int c){}
    private void /*boolean*/ removeQueen(int r, int c){}



    public static void main( String[] args){
	QueenBoard fourbyfour = new QueenBoard(4);
	System.out.println(fourbyfour.toString());
    }

}
