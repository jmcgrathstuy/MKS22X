public class MyLinkedList{

    int size;
    Node first;
    Node last;
    

    public MyLinkedList(){
	size = 0;
    }

    /*public void add(){
	if(size == 0);
	first == 
	}*/

    public int size(){
	return size;
    }
    public boolean add( int value){
	Node newNode = new Node( value);
	last.setNext(newNode);
	last = newNode;
    }
    public int get(int i){
	//fill in
    }
    public String printComp(int step,Node cur){
	if( step + 1 == size()){
	    return "" + cur.getData();
	}
	return cur.getData() + printComp( step + 1, cur.getNext());
    }
	
    public String toString(){
	String str = "";
	for( int i = 0; i < size(); i++){
	}
    }

	    
	    



    private class Node{
	int data;
        Node prev;
	Node next;

	Node(int dataIn){
	    data = dataIn;
	}

	int getData(){
	    return data;
	}
	void setData(int dataIn){
	    data = dataIn;
	}
	Node getNext(){
	    return next;
	}
	Node getPrev(){
	    return prev;
	}
	void setNext(Node nextIn){
	    next = nextIn;
	}
	void setPrev(Node prevIn){
	    prev = prevIn;
	}
    }
}

