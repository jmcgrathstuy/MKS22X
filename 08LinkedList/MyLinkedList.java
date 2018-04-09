public class MyLinkedList{

    //CURRENT THINGS TO DO
    //
    //ADD EXCEPTIONS
    //
    //Store Integer objects instead of ints (aka get rid of the .intValue()'s and
    //redo the Node class a little bit.
    //



    

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
    //
    public boolean add( Integer value){
	Node newNode = new Node( value);
	if( size() != 0){
	    last.setNext(newNode);
	}
	last = newNode;
	return true;
    }
    public void set( int index, Integer value){
	///ADD EXCEPTIONS
	Node cur = first;
	for( int i = 0; i < index; i++){
	    cur = cur.getNext();
	}
	cur.setData( value.intValue());
    }
    public void add( int index, Integer value){
        Node prev = getNode(index - 1)
	Node newNode = new Node(value);
	newNode.setNext(prev.getNext());
	newNode.setPrev(prev);
	prev.setNext(newNode);
	newNode.getNext().setPrev(newNode);
    }
	

    
    public int get(int index){
	//fill in
	Node cur = first;
	for( int i = 0;  i < index; i++){
	    cur = cur.getNext();
	}
	return cur.getData();
    }
    private Node GetNode( int index){
	    Node cur = first;
	    for( int i = 0; i < index; i++){
	        cur = cur. getNext();
	    }
	    return cur;
    }
		

	
    public String toString(){
	String str = "[";
	Node cur = first;
	for( int i = 0; i < size(); i++){
	    str += cur.getData();
	    if( i  != size() - 1){
		str += ", ";
	    }
	    cur = cur.getNext();
	}
	str += "]";
	return str;
    }

    public static void main(String[] args){
	MyLinkedList l = new MyLinkedList();
	l.add(new Integer(89));
	l.add(new Integer(900));
	l.add(new Integer(2));
	System.out.println( l.toString());
    }
	

	    
	    



    private class Node{
	Integer data;
        Node prev;
	Node next;

	Node(Integer dataIn){
	    data = dataIn;
	}

	int getData(){
	    return data;
	}
	void setData(Integer dataIn){
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

