public class FrontierPriorityQueue implements Frontier{
    //min heap of Locations.
    private MyHeap<Location> data;



    public FrontierPriorityQueue(){
	data = new MyHeap( false);

    }

    public void add(Location loc){
	data.add(loc);
    }

    public Location Next(){
    }
}
