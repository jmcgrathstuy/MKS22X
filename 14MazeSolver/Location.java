public class Location implements Comparable<Location>{
    private int x,y;
    private Location previous;
    private double distance;
    

    public Location(int nx, int ny, Location prev){
	x = nx;
	y = ny;
	previous = prev;
    }
    public Location(int nx, int ny, Location prev, double dist){
	x = nx;
	y = ny;
	previous = prev;
	distance = dist;
    }
    public int compareTo(Location loc){
	if( distance < loc.getDistance()){
	    return -1;
	}
	if( distance == loc.getDistance()){
	    return 0;
	}
	else{
	    return 1;
	}
    }
    public double getDistance(){
	return distance;
    }
    public Location getPrevious(){
	return previous;
    }
}

