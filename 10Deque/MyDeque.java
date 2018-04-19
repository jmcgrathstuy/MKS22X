import java.util.*;
public class MyDeque{ //implements Deque<String>{
    public /*private?*/ String[] data;
    private int size;
    private int front;
    private int back;

    public MyDeque(){
	size = 10;
	data = new String[size];
	front = 5;
	back = 4;
    }

    public MyDeque(int initialCapacity){
	size = initialCapacity;
	data = new String[size];
	if( size != 0){
	    
	    if( size == 1){
		front = 0;
		back = 0;
	    }
	    if( size == 2){
		front = 1;
		back = 0;
	    }

	    else{
		back = size / 2;
		front = (size / 2) - 1;
	    }
	}
    }

    
    private void resize(int newSize){
	String[] newData = new String[size * 2];
	
    }

    
    public int size(){
	return size;
    }

    public int getFront(){
	return front;
    }
    public int getBack(){
	return back;
    }




    public void addFirst(String str){
        int before = front - 1;
	if( before == -1){
	    
	    
    }

    
    public void addLast(String str){
    }
    public String removeFirst(){
	return "";
    }
    public String removeLast(){
	return "";
    }
    


    public static void main(String[] args){
	MyDeque a = new MyDeque(9);
	System.out.println("" +  a.getFront() + a.getBack());
	System.out.println(a.data[2]);
    }




}
