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
				str += "Q ";
			}else{
				str += "_ ";
			}
			}
	    str += "\n";
	}
	return str;
    }

    private boolean addQueen(int r, int c){
		if(((r < 0) || (r >= board.length)) || ((c < 0) || (c >= board.length)) || board[r][c] != 0){
			return false;
		}
		
		board[r][c] = -1;
		

		for( int i = 0; i < board.length; i++){
			if( i != r){
				board[i][c] += 1;
			}
			if( i != c){
				board[r][i] += 1;
			}
		}
		
		for( int iU = r - 1, iR = c + 1; iU >= 0 && iR < board.length; iU--, iR++){
			board[iU][iR] += 1;
		}
		for( int iU = r - 1, iL = c - 1; iU >= 0 && iL >= 0; iU--, iL--){
			board[iU][iL] += 1;
		}
		for( int iD = r + 1, iL = c - 1; iL >= 0 && iD < board.length; iD++, iL--){
			board[iD][iL] += 1;
		}
		for( int iD = r + 1, iR = c + 1; iR < board.length && iD < board.length; iD++, iR++){
			board[iD][iR] += 1;
		}
		
		return true;

	}
    
    

    
	private boolean removeQueen(int r, int c){

	
		if(((r < 0) || (r >= board.length)) || ((c < 0) || (c >= board.length)) || board[r][c] != -1){
			return false;
		}
		
		board[r][c] = 0;
		

		for( int i = 0; i < board.length; i++){
			if( i != r){
				board[i][c] -= 1;
			}
			if( i != c){
				board[r][i] -= 1;
			}
		}
		
		for( int iU = r - 1, iR = c + 1; iU >= 0 && iR < board.length; iU--, iR++){
			board[iU][iR] -= 1;
		}
		for( int iU = r - 1, iL = c - 1; iU >= 0 && iL >= 0; iU--, iL--){
			board[iU][iL] -= 1;
		}
		for( int iD = r + 1, iL = c - 1; iL >= 0 && iD < board.length; iD++, iL--){
			board[iD][iL] -= 1;
		}
		for( int iD = r + 1, iR = c + 1; iR < board.length && iD < board.length; iD++, iR++){
			board[iD][iR] -= 1;
		}
		
		return true;
	
	
	}
	
	public boolean solveH( int col){
		if( col == board.length){
			return true;
		}
		
		for( int row = 0; row < board.length; row++){
			if( addQueen( row, col)){
				if( solveH( col + 1)){
					return true;
				}
				removeQueen( row, col);
			}
		}
		return false;
	
	}
	
	
	
	public boolean solve(){
		for( int iR = 0; iR < board.length; iR++){
			for( int iC = 0; iC < board.length; iC++){
				if( board[iR][iC] != 0){
					throw new IllegalStateException();
				}
			}
		}
		
		boolean worked = solveH(0);
		
		if(!worked){
			for( int iR = 0; iR < board.length; iR++){
				for( int iC = 0; iC < board.length; iC++){
				board[iR][iC] = 0;
				}
			}
		}
		return worked;
		
	}
	
	public int countSolH( int col, int sum){
		if( col == board.length){
			return 1;
		}
		
		for( int row = 0; row < board.length; row++){
			if( addQueen( row, col)){
				sum += countSolH(col + 1, 0);
				removeQueen( row, col);
			}
		}
		return sum;
	}
	
	public int countSolutions(){
		for( int iR = 0; iR < board.length; iR++){
			for( int iC = 0; iC < board.length; iC++){
				if( board[iR][iC] != 0){
					throw new IllegalStateException();
				}
			}
		}
		return countSolH( 0, 0);
	}




    public static void main( String[] args){
		QueenBoard fourbyfour = new QueenBoard(4);
		//fourbyfour.addQueen(9, 3);
	    //System.out.println(fourbyfour.toString());
		//System.out.println(fourbyfour.addQueen(2, 1));
	    //System.out.println(fourbyfour.toString());
		//fourbyfour.removeQueen(2, 3);
	    System.out.println(fourbyfour.toString());
		System.out.println(fourbyfour.solve());
		System.out.println(fourbyfour.toString());
    }
	

}
