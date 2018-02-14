public class KnightBoard{

    public int[][] board;
    
    public KnightBoard(int startingRows, int startingCols){
	board = new int[startingRows][startingCols];
	for(int iR = 0;  iR < startingRows; iR++){
	    for(int iC = 0;  iC < startingCols; iC++){
		board[iR][iC] = 0;
	    }
	}
	
    }

    public String toString(){
	String str = "";
	for(int iR = 0; iR < board.length; iR++){
	    for(int iC = 0;  iC < board[iR].length; iC++){
		if(board[iR][iC] < 10){
		    str += " " + board[iR][iC] + " ";
		}else{
		    str += board[iR][iC] + " ";
		}
	    }
	    str += "\n";
	    }
	return str;
	}











}
