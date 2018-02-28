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

    public boolean isBlank(){
	for(int iR = 0;  iR < board.length; iR++){
	    for(int iC = 0;  iC < board[0].length; iC++){
	        if( board[iR][iC] != 0){
		    return false;
		}
	    }
	}
	return true;
    }

    public String toString(){
	String str = "";
	boolean blankness = isBlank();
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
		if((rowSt < 0 || rowSt >= board.length) || ( colSt < 0) || (colSt >= board[0].length)){
			throw new IllegalArgumentException();
		}
		if( !isBlank()){
			throw new IllegalStateException();
		}
	    return solveH(rowSt, colSt, 1);


	}

	private boolean solveH(int row, int col, int step){
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
	
	public int countSolutions(int startingRow, int startingCol){
		if((startingRow < 0 || startingRow >= board.length) || ( startingCol < 0) || (startingCol >= board[0].length)){
			throw new IllegalArgumentException();
		}
		if( !isBlank()){
			throw new IllegalStateException();
		}
		return countSolH(startingRow, startingCol, 0, 1);
	}
	
	public int countSolH(int row, int col, int sum, int step){
		if( board[row][col] != 0){
			return 0;
	    }
		int numWorked = 0;
	    if( step  == ( board.length * board[0].length)){
			return 1;
	    }

		if( row - 2 >= 0 && col - 1 >= 0){
			board[row][col] = step;
			sum += countSolH( row - 2, col - 1, 0, step + 1);
			numWorked += 1;
			board[row][col] = 0;
		}
		if( row - 2 >= 0 && col + 1 < board[0].length){
			board[row][col] = step;
		    sum += countSolH( row - 2, col + 1, 0, step + 1);
			numWorked += 1;
			board[row][col] = 0;
		}
		if( row + 2 < board.length && col - 1 >= 0){
			board[row][col] = step;
		    sum += countSolH( row + 2, col - 1, 0, step + 1);
			numWorked += 1;
			board[row][col] = 0;
		}
		if( row + 2 < board.length && col + 1 < board[0].length){
			board[row][col] = step;
		    sum += countSolH( row + 2, col + 1, 0, step + 1);
			numWorked += 1;
			board[row][col] = 0;
		}
		if( row - 1 >= 0 && col - 2 >= 0){
			board[row][col] = step;
		    sum += countSolH( row - 1, col - 2, 0, step + 1);
			numWorked += 1;
			board[row][col] = 0;
		}
		if( row - 1 >= 0 && col + 2 < board[0].length){
			board[row][col] = step;
		    sum += countSolH( row - 1, col + 2, 0, step + 1);
			numWorked += 1;
			board[row][col] = 0;
		}
		if( row + 1 < board.length && col - 2 >= 0){
			board[row][col] = step;
		    sum += countSolH( row + 1, col - 2, 0, step + 1);
			numWorked += 1;
			board[row][col] = 0;
		}
		if( row + 1 < board.length && col + 2 < board[0].length){
			board[row][col] = step;
		    sum += countSolH( row + 1, col + 2, 0, step + 1);
			numWorked += 1;
			board[row][col] = 0;
		}
		if( numWorked == 0){
			board[row][col] = 0;
			return 0;
		}
	return sum;
		
		
	}

}
