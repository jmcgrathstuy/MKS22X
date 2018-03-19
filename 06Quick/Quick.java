public class Quick{

    public static void quicksort(int[] ary){

	//	while( 
	
    }




    
    public static int quickSelect(int[] ary, int k){
    }

    public void partition(int[] ary, int lo, int hi){
	Random rand = new Random();
	int p = rand.nextInt(data.length);
	swap( ary, lo, p);
	int i = p + 1;
	whlie( i <= hi){
	    if( ary[i] == ary[p]){
		    i++;
		}
		if( ary[i] > ary[p]){
			swap( ary, i, hi);
			hi--;
		}else{
			swap( ary, 





    }

    public void swap(int[] ary, int a, int b){
	int at = ary[a];
	ary[a] = b;
	ary[b] = at;
    }
	
	//also later do the recursion inside of quicksort/select
	


}
