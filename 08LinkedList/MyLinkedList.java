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
	if( size() == 0){
	    first = newNode;
	}
	if( size() != 0){
	    last.setNext(newNode);
	}
	last = newNode;
	size += 1;
	return true;
    }
    public Integer set( int index, Integer value){
	///ADD EXCEPTIONS
	Node cur = first;
	for( int i = 0; i < index; i++){
	    cur = cur.getNext();
	}
	Integer oldData = cur.getData();
	cur.setData( value);
	return oldData;
    }
    public void add( int index, Integer value){
	Node newNode = new Node(value);
	if( size() == 0){
	    first = newNode;
	    last = newNode;
	}
	if( index == 0){
	    //SOMETHING
	}
	    
        Node prev = getNode(index - 1);
	Node newNode = new Node(value);
	newNode.setNext(prev.getNext());
	newNode.setPrev(prev);
	prev.setNext(newNode);
	newNode.getNext().setPrev(newNode);
	size += 1;
    }
	

    
    public Integer get(int index){
	//fill in
	Node cur = first;
	for( int i = 0;  i < index; i++){
	    cur = cur.getNext();
	}
	return cur.getData();
    }
    private Node getNode( int index){
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
	l.add( 4, new Integer(5));
	System.out.println( l.toString());

	////
	///KNOWN ISSUES AS OF MOST RECENT CHANGE
	///
	//Adding to index 0 instead adds to index 1
	///
	//Adding to the last index + 1 errors
	///
	//Adding to any further position also errors but for the same reason
	//this should be a built in exception thing in the future
	///
	////
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

