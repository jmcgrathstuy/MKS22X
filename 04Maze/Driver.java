import java.util.*;
import java.io.*;
public class Driver{

    public static void main(String[]args){
        Maze f;
        try{f = new Maze("Data4.dat");
		//f.setAnimate(true);
        System.out.println(f.solve());
        System.out.println(f.toString());
		}catch (FileNotFoundException e){
		}
    }
}