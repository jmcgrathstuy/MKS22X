import java.util.*;
public class FrontierStack implements Frontier{

    private Stack<Location> s;

    public void add( Location loc){
	s.add(loc);
    }
    public boolean hasNext(){
	return s.size() != 0;
    }
    public Location next(){
	return s.pop();
    }
}
