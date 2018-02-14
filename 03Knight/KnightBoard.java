public class KnightBoard{

    public int[][] board;
    
    public KnightBoard(int startingRows, int startingCols){
	if(startingRows < 0 || startingCols < 0){
	    throw new IllegalArgumentException();
	}
	board = new int[startingRows][startingCols];
	for(int iR = 0;  iR < startingRows; iR++){
	    for(int iC = 0;  iC < startingCols; iC++){
		board[iR][iC] = 0;
	    }
	}
	
    }

    public boolean isBlank( int[][] brd){
	for(int iR = 0;  iR < startingRows; iR++){
	    for(int iC = 0;  iC < startingCols; iC++){
	        if( brd[iR][iC] != 0){
		    return false;
		}
	    }
	}
	return true;
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



    public static void main( String args[]){
	KnightBoard e = new KnightBoard(1, 5);
	System.out.println( e.toString());
    }









}
