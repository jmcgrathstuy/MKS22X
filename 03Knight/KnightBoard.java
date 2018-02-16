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
	for(int iR = 0;  iR < brd.length; iR++){
	    for(int iC = 0;  iC < brd[0].length; iC++){
	        if( brd[iR][iC] != 0){
		    return false;
		}
	    }
	}
	return true;
    }

    public String toString(){
	String str = "";
	boolean blankness = isBlank(board);
	for(int iR = 0; iR < board.length; iR++){
	    for(int iC = 0;  iC < board[iR].length; iC++){
		if(board[iR][iC] < 10){
		    str += " " + board[iR][iC] + " ";
		}
		if(blankness){
		    str += " _ ";
		else{
		    str += board[iR][iC] + " ";
		}
	    }
	    str += "\n";
	    }
	return str;
	}

	public boolean solve(int rowSt, int colSt){
	    


	}

	public boolean solveH(int row, int col, int step){
	    board[row][col] = step;
	    if( step  == ( board.length * board[0].length)){
		return true;
	    }
	    if( board[row][col] != 0){
		return false;
	    }

	    if( board.size - row > 1 && board[0].size - col > 1){
		/*if( row > 1 && col > 1){
		    if(solveH( row - 2, col, step + 1)){
			return true;
		    }
		    if(solveH( row, col - 2, step + 1)){
			return true;
		    }
		}
		if( row > 1 && col <= 1){
		    if(solveH( row - 2, col, step + 1)){
			return true;
		    }
		}
		if( row <= 1 && col > 1){
		    if(solveH( row, col - 2, step + 1)){
			return true;
		    }
		    }*/

		if( row - 2 >= 0 && col - 1 >= 0){
		    if(solveH( row - 2, col - 1, step + 1)){
			return true;
		    }
		}
		if( row - 2 >= 0 && col + 1 <= board.size){
		    if(solveH( row - 2, col + 1, step + 1)){
			return true;
		    }
		}
		if( row + 2 <= board.size && col - 1 >= 0){
		    if(solveH( row + 2, col - 1, step + 1)){
			return true;
		    }
		}
		if( row + 2 <= board.size && col + 1 <= board.size){
		    if(solveH( row + 2, col + 1, step + 1)){
			return true;
		    }
		}

		if( row - 2 >= 0 && col - 1 >= 0){
		    if(solveH( row - 2, col - 1, step + 1)){
			return true;
		    }
		}
		if( row - 2 >= 0 && col + 1 <= board.size){
		    if(solveH( row - 2, col + 1, step + 1)){
			return true;
		    }
		}
		if( row + 2 <= board.size && col - 1 >= 0){
		    if(solveH( row + 2, col - 1, step + 1)){
			return true;
		    }
		}
		if( row + 2 <= board.size && col + 1 <= board.size){
		    if(solveH( row + 2, col + 1, step + 1)){
			return true;
		    }
		}

		
		
		    
		

	    



    public static void main( String args[]){
	KnightBoard e = new KnightBoard(3, 5);
	System.out.println( e.toString());
    }









}
