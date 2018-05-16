import java.util.*;
public class FrontierQueue implements Frontier{

    private Queue<Location> q;

    public void add(Location loc){
	q.add(loc);
    }
    public boolean hasNext(){
	return q.size() != 0;
    }
    public Location next(){
	return q.remove();
    }
}
