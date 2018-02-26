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
		if(blankness){
		    str += " _ ";
		}
		else{
			if(board[iR][iC] < 10){
		    str += " " + board[iR][iC] + " ";
			}
			else{
		    str += board[iR][iC] + " ";
			}
		}
	    }
	    str += "\n";
	    }
	return str;
	}

	public boolean solve(int rowSt, int colSt){
	    return solveH(rowSt, colSt, 1);


	}

	public boolean solveH(int row, int col, int step){
		if( board[row][col] != 0){
			return false;
	    }
	    board[row][col] = step;
		int numWorked = 0;
	    if( step  == ( board.length * board[0].length)){
			return true;
	    }

		if( row - 2 >= 0 && col - 1 >= 0){
		    if(solveH( row - 2, col - 1, step + 1)){
			numWorked += 1;
			return true;
		    }
		}
		if( row - 2 >= 0 && col + 1 < board[0].length){
		    if(solveH( row - 2, col + 1, step + 1)){
			numWorked += 1;
			return true;
		    }
		}
		if( row + 2 < board.length && col - 1 >= 0){
		    if(solveH( row + 2, col - 1, step + 1)){
			numWorked += 1;
			return true;
		    }
		}
		if( row + 2 < board.length && col + 1 < board[0].length){
		    if(solveH( row + 2, col + 1, step + 1)){
			numWorked += 1;
			return true;
		    }
		}

		if( row - 1 >= 0 && col - 2 >= 0){
		    if(solveH( row - 1, col - 2, step + 1)){
			numWorked += 1;
			return true;
		    }
		}
		if( row - 1 >= 0 && col + 2 < board[0].length){
		    if(solveH( row - 1, col + 2, step + 1)){
			numWorked += 1;
			return true;
		    }
		}
		if( row + 1 < board.length && col - 2 >= 0){
		    if(solveH( row + 1, col - 2, step + 1)){
			numWorked += 1;
			return true;
		    }
		}
		if( row + 1 < board.length && col + 2 < board[0].length){
		    if(solveH( row + 1, col + 2, step + 1)){
			numWorked += 1;
			return true;
		    }
		}
		if( numWorked == 0){
			board[row][col] = 0;
			return false;
		}
	return false;
	}
	
	/*public int countSolutions(int startingRow, int startingCol){
		return countSolH(startingRow, startingCol, 0);
	}
	
	public int countSolutions(int row, int col, int sum){
		if( board[row][col] != 0){
			return 0
	    }
	    board[row][col] = step;
		int numWorked = 0;
	    if( step  == ( board.length * board[0].length)){
			return true;
	    }

		if( row - 2 >= 0 && col - 1 >= 0){
		    if(solveH( row - 2, col - 1, step + 1)){
			numWorked += 1;
			sum += 
		    }
		}
		if( row - 2 >= 0 && col + 1 < board[0].length){
		    if(solveH( row - 2, col + 1, step + 1)){
			numWorked += 1;
			return true;
		    }
		}
		if( row + 2 < board.length && col - 1 >= 0){
		    if(solveH( row + 2, col - 1, step + 1)){
			numWorked += 1;
			return true;
		    }
		}
		if( row + 2 < board.length && col + 1 < board[0].length){
		    if(solveH( row + 2, col + 1, step + 1)){
			numWorked += 1;
			return true;
		    }
		}

		if( row - 1 >= 0 && col - 2 >= 0){
		    if(solveH( row - 1, col - 2, step + 1)){
			numWorked += 1;
			return true;
		    }
		}
		if( row - 1 >= 0 && col + 2 < board[0].length){
		    if(solveH( row - 1, col + 2, step + 1)){
			numWorked += 1;
			return true;
		    }
		}
		if( row + 1 < board.length && col - 2 >= 0){
		    if(solveH( row + 1, col - 2, step + 1)){
			numWorked += 1;
			return true;
		    }
		}
		if( row + 1 < board.length && col + 2 < board[0].length){
		    if(solveH( row + 1, col + 2, step + 1)){
			numWorked += 1;
			return true;
		    }
		}
		if( numWorked == 0){
			board[row][col] = 0;
			return 0;
		}
	return false;
		
		
	}*/

		
		
		    
		

	    



    public static void main( String args[]){
	KnightBoard e = new KnightBoard(5, 5);
	System.out.println( e.toString());
	System.out.println( e.solve(3, 4));
	System.out.println( e.toString());
    }









}
