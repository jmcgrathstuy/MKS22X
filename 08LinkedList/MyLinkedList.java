public class MyLinkedList{

    //CURRENT THINGS TO DO
    //
    //all good


    

    int size;
    Node first;
    Node last;
    

    public MyLinkedList(){
	size = 0;
    }

    public int size(){
	return size;
    }

    public void clear(){
	first = null;
	last = null;
	size = 0;
    }

    public boolean add( Integer value){
	Node newNode = new Node( value);
	if( size() == 0){
	    first = newNode;
	    last = newNode;
	    first.setNext(last);
	    last.setPrev(first);
	}
	if( size() != 0){
	    last.setNext(newNode);
	    newNode.setPrev(last);
	}
	last = newNode;
	size += 1;
	return true;
    }

    public Integer set( int index, Integer value){
	///ADD EXCEPTIONS
        if( index < 0 || index >= size){
	    throw new IllegalArgumentException("No less than 0, no greater than size - 1 please");
	}
	Node cur = first;
	for( int i = 0; i < index; i++){
	    cur = cur.getNext();
	}
	Integer oldData = cur.getData();
	cur.setData( value);
	return oldData;
    }

    public void add( int index, Integer value){
        if( index < 0 || index > size){
	    throw new IllegalArgumentException("No less than 0, no greater than size please");
	}
	Node newNode = new Node(value);
	if( size() == 0){
	    first = newNode;
	    last = newNode;
	    first.setNext(last);
	    last.setPrev(first);
	    size++;
	}else if( index == 0){
	    newNode.setNext(first);
	    first.setPrev(newNode);
	    first = newNode;
	    size++;
	}else if(index == size){
	    newNode.setPrev(last);
	    last.setNext(newNode);
	    last = newNode;
	    size++;
	}else{
            Node prev = getNode(index - 1);
	    newNode.setNext(prev.getNext());
	    newNode.setPrev(prev);
	    prev.setNext(newNode);
	    newNode.getNext().setPrev(newNode);
	    size++;
	}
    }
	

    
    public Integer get(int index){
	//fill in
        if( index < 0 || index >= size){
	    throw new IllegalArgumentException("No less than 0, no greater than size - 1 please");
	}
	Node cur = first;
	for( int i = 0;  i < index; i++){
	    cur = cur.getNext();
	}
	return cur.getData();
    }

    private Node getNode( int index){
        if( index < 0 || index >= size){
	    throw new IllegalArgumentException("No less than 0, no greater than size - 1 please");
	}
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

    public int indexOf(Integer value){
	Node cur = first;
	for( int i = 0; i < size(); i++){
	    if( cur.getData() == value){
		return i;
	    }
	    cur = cur.getNext();
	}
	return -1;
    }

    public boolean remove(Integer value){
	int spot = indexOf(value);
	if( spot != -1){
	    remove(spot);
	    return true;
	}
	return false;

    }

    public Integer remove(int index){
	if( index < 0 || index >= size){
	    throw new IllegalArgumentException("No less than 0, no greater than size - 1 please");
	}
	Node cur = getNode(index);
	if( index == 0){
	    cur.getNext().setPrev(null);
	    first = cur.getNext();
	    size--;
	    return cur.getData();
	}
	else if( index == size - 1){
	    cur.getPrev().setNext(null);
	    last = cur.getPrev();
	    size--;
	    return cur.getData();
	}
	else{
	    cur.getPrev().setNext(cur.getNext());
	    cur.getNext().setPrev(cur.getPrev());
	    size--;
	    return cur.getData();
	}
    }



    public static void main(String[] args){
	MyLinkedList l = new MyLinkedList();
	l.add(new Integer(89));
	l.add(new Integer(89));
	l.add(new Integer(2));
	l.add( 1, new Integer(5));
	l.add(new Integer(34));
	System.out.println( l.toString());
	System.out.println(l.indexOf(new Integer(89)));
        System.out.println( l.toString());
        System.out.println( l.indexOf(new Integer(5)));
	l.remove(new Integer (5));
	System.out.println( l.toString());

	////
	///KNOWN ISSUES AS OF MOST RECENT CHANGE
	///
	//nothing to report
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

	String print(){
	    return "" + data.intValue();
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

