import java.util.*;
import java.io.*;
public class Maze{


    private char[][]maze;
    private boolean animate;

    /*Constructor loads a maze text file, and sets animate to false by default.

      1. The file contains a rectangular ascii maze, made with the following 4 characters:
      '#' - Walls - locations that cannot be moved onto
      ' ' - Empty Space - locations that can be moved onto
      'E' - the location of the goal (exactly 1 per file)

      'S' - the location of the start(exactly 1 per file)

      2. The maze has a border of '#' around the edges. So you don't have to check for out of bounds!


      3. When the file is not found OR the file is invalid (not exactly 1 E and 1 S) then: 

         throw a FileNotFoundException or IllegalStateException

    */

    public Maze(String filename) throws FileNotFoundException{
        //COMPLETE CONSTRUCTOR

		File text = new File(filename);
		int numCols = 999;
		int numRows = 0;
        
		Scanner inf = new Scanner(text);

		int rowAt = 0;
		int buddy = 0;
		
		while(inf.hasNextLine()){
            String line = inf.nextLine();
			if(numCols == 999){
				numCols = line.length();
			}
			numRows += 1;
        }
		
		maze = new char[numRows][numCols];
		
		inf = new Scanner(text);
		
		while(inf.hasNextLine()){
			String line = inf.nextLine();
			for( int i = 0; i < line.length(); i++){
				maze[rowAt][i] = line.charAt(i);
			}
			rowAt++;
        }
		int countS = 0;
		int countE = 0;
		for(int sR = 0; sR < numRows; sR++){
			for(int sC = 0; sC < numCols; sC++){
				if( maze[sR][sC] == 'S'){
					countS++;
				}
				if( maze[sR][sC] == 'E'){
					countE++;
				}
			}
		}
		if( countS != 1 || countE != 1){
			throw new IllegalStateException();
		}
		

		animate = false;
    }
	
	public String toString(){
		String str = "";
		for( int sR = 0; sR < maze.length; sR++){
			for(int sC = 0; sC < maze[sR].length; sC++){
				str += maze[sR][sC];
			}
			str += "\n";
		}
		return str;
    }
    

    private void wait(int millis){
         try {
             Thread.sleep(millis);
         }
         catch (InterruptedException e) {
         }
     }


    public void setAnimate(boolean b){

        animate = b;

    }


    public void clearTerminal(){

        //erase terminal, go to top left of screen.

        //System.out.println("\033[2J\033[1;1H");
		System.out.flush();  

    }



    /*Wrapper Solve Function returns the helper function

      Note the helper function has the same name, but different parameters.
      Since the constructor exits when the file is not found or is missing an E or S, we can assume it exists.

    */
    public int solve(){
		int sR = 9999;
		int sC = 9999;
	

            //find the location of the S.
		for(int r = 0; r < maze.length; r++){
			for(int c = 0; c < maze[r].length; c++){
			if( maze[r][c] == 'S'){
				sR = r;
				sC = c;
			}
			}
		}


            //erase the S
		maze[sR][sC] = '\0';


            //and start solving at the location of the s.
		return solve(sR, sC, 0);

            //return solve(???,???);

	}

    /*
      Recursive Solve function:

      A solved maze has a path marked with '@' from S to E.

      Returns the number of @ symbols from S to E when the maze is solved,
      Returns -1 when the maze has no solution.


      Postcondition:

        The S is replaced with '@' but the 'E' is not.

        All visited spots that were not part of the solution are changed to '.'

            Note: This is not required based on the algorithm, it is just nice visually to see.
        All visited spots that are part of the solution are changed to '@'
    */
    private int solve(int r, int c, int count){ //you can add more parameters since this is private


        //automatic animation! You are welcome.
        if(animate){

            clearTerminal();
            System.out.println(this);

            wait(20);
        }

        //COMPLETE SOLVE

	int a = 88;
	int b = 88;
	int g = 88;
	int d = 88;

	if( maze[r][c] == '#' || maze[r][c] == '.'){
	    return -1;
	}

	if( maze[r][c] == 'E'){
	    return count;
	}
	//ORDER OF OPERATIONS: UP, DOWN, RIGHT, LEFT
	if( maze[r + 1][c] == ' ' || maze[r + 1][c] == 'E'){
	    maze[r][c] = '@';
	    a = solve( r + 1, c, count + 1);
		if( a == -1){
			maze[r][c] = '.';
		}else{
			return a;
		}
	}
    if( maze[r - 1][c] == ' ' || maze[r - 1][c] == 'E'){
	    maze[r][c] = '@';
	    b = solve( r - 1, c, count + 1);
		if( b == -1){
			maze[r][c] = '.';
		}else{
			return b;
		}
	}
	if( maze[r][c + 1] == ' ' || maze[r][c + 1] == 'E'){
	    maze[r][c] = '@';
	    g = solve( r, c + 1, count + 1);
		if( g == -1){
			maze[r][c] = '.';
		}else{
			return g;
		}
	}
	if( maze[r][c - 1] == ' ' || maze[r][c - 1] == 'E'){
	    maze[r][c] = '@';
	    d = solve( r, c - 1, count + 1);
		if( d == -1){
			maze[r][c] = '.';
		}else{
			return d;
		}
	}
	maze[r][c] = '.';
	return -1;
    }



    public static void main(String[] args) throws FileNotFoundException{
	        //instead of a try/catch, you can throw the FileNotFoundException.
        File text = new File("Maze.txt");// can be a path like: "/full/path/to/file.txt" 
        

        //inf stands for the input file

        Scanner inf = new Scanner(text);

        while(inf.hasNextLine()){
            String line = inf.nextLine();
            System.out.println(line);
        }
    }

}
