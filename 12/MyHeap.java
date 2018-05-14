public class MyHeap{

    private int size;
    private ArrayList ary;
    private boolean maxHeap;

    public MyHeap(){
	maxHeap = true;
	ary = new ArrayList();
    }


    
    public MyHeap(boolean a){
	maxHeap = a;
	if( a){
	    MyHeap();
	}
	else{
	    //stuff here
	}
    }



    
    public void add(String s){
	ary.add(s);
	boolean notDone = true;
        for( ;notDone;){
	    if( s.compareTo(
    }

    public switchMode(){
	maxHeap = !maxHeap;
    }
    public getMode(){
	return maxHeap;
    }


    
    public String remove(){
    }


    
    public String peek(){
    }


    
    public int size(){
	return size;
    }


    


}
