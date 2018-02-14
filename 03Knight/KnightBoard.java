public class KnightBoard{

    public int[][] board;
    
    public KnightBoard(int startingRows, int startingCols){
	board = new int[startingRows][startingCols];
	for(int iR = 0; int iR < startingRows; iR++){
	    for(int iC = 0; int iC < startingCols; iC++){
		board[iR][iC] = 0;
	    }
	}
	
    }











}
