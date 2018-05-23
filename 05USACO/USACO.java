import java.util.*;
import java.io.*;

public class USACO{

    


    public static int bronze() throws FileNotFoundException{
	ArrayList<String> list = new ArrayList<String>();
	String[][] fieldS;
	int[][] field;

	File f = new File("field.txt");
	Scanner inf = new Scanner(f);
	int r;
	int c;
	int e;
	int n;
	while(inf.hasNextLine()){
	    list.add( inf.nextLine());
	}
	String r1 = list.get(0);
	String[] b = r1.split(" ");
	/*for( int i = 0; i < 4; i++){
	    System.out.println( b[i]);
	    }*/
	r = Integer.parseInt(b[0]);
	c = Integer.parseInt(b[1]);
	e = Integer.parseInt(b[2]);
	n = Integer.parseInt(b[3]);
	field = new int[r][c];
	fieldS = new String[r][c];
	list.remove(0);

	for( int i = 0; i < r; i++){
	    fieldS[i] = list.get( i).split(" ");
	}
	for( int i = 0; i < r; i++){
	    for( int j = 0; j < c; j++){
		field[i][j] = Integer.parseInt(fieldS[i][j]);
	    }
	}

	for( int i = r; i < list.size(); i++){
	    

	

	
		
		








	    //String line = inf.nextLine();
	    //r = int( line.substring(0, 1));
	    //c = int( line.substring( 2, 3));
	

	return 1;

    }
    public static void main( String[] args)throws FileNotFoundException{
	bronze();
    }
    //public static

    
}
	/*
	String[] b = new String[4];
	String r1 = list.get(0);
	for( int i = 0; i < 4; i++){
	    System.out.println( r1);
	    if( i < 3){
		b[i] = ( r1.substring(0, r1.indexOf(" ")));
	    }
	    r1 = r1.substring( r1.indexOf(" ") + 1);
	    System.out.println( r1);
	}
	for( int i = 0; i < 4; i++){
	System.out.println( b[i])*/
