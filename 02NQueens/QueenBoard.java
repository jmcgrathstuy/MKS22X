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

    private boolean addQueen(int r, int c){
		if( board[r][c] != 0){
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

	
		if( board[r][c] != -1){
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




    public static void main( String[] args){
		QueenBoard fourbyfour = new QueenBoard(4);
		fourbyfour.addQueen(2, 3);
	    System.out.println(fourbyfour.toString());
		System.out.println(fourbyfour.addQueen(2, 1));
	    System.out.println(fourbyfour.toString());
		fourbyfour.removeQueen(2, 3);
	    System.out.println(fourbyfour.toString());
    }

}
