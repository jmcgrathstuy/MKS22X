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

    private void /*boolean*/ addQueen(int r, int c){
	if( board[r][c] != 0){
	    return false;
	}else{
	board[r][c] = -1;
	//Add horiz and 
	for( int iR = c, iU = r, iD = r, iL = c; /*make this work again*/; iR++, iU++, iD--, iL--){
	    if(c != iR && c != iL){
		board[iU][iR] += 1;
		board[iD][iR] += 1;
	    }
	    if(r != iD && r != iU)
		board[iR][c] += 1;
	        board[r][iC] += 1;
	    }
	}
	
	}
    
    

    
/*private void /*boolean removeQueen(int r, int c){

          board[r][c] = 0;
          for( int iC = 0,  iR = 0; iC < board.length; iC++, iR++){
             if(c != iC){
		 board[r][iC] -= 1;
             }
             if(r != iR){
                board[iR][c] -= 1;
             }
          }
	  
	   }
	   }*/




    public static void main( String[] args){
	QueenBoard fourbyfour = new QueenBoard(4);
	fourbyfour.addQueen(2, 3);
	System.out.println(fourbyfour.toString());
    }

}
