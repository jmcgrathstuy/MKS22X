public class Merge{

    public static void merge( int[] data, int[] temp, int aStart, int aEnd, int bStart, int bEnd){
        /*for( int j = (eA - sA +) 1, int k = (eB - sB +) 1; ; j++, k++){
            tempA[j] = data[j];
            tempB[k] = data[k];
	    }*/
        //int[] tempData = new int[(eB - sA) + 1];
        //int i = 0;  replace i with aStart
        //int j = 0;  replace j with bStart
        //int[] dataToo = new int[a.length + b.length];
        for(int k = aStart; (aStart <= aEnd || bStart <= bEnd) &&  k < bEnd;){
	    //System.out.println( "k = " + k + "\naStart = " + aStart + "\nbStart = " + bStart);
            if( aStart == aEnd){
		//System.out.println(" if #1");
		temp[k] = data[aStart];
		aStart++;
		k++;
                while( k < temp.length){
                    temp[k] = data[bStart];
                    bStart++;
                    k++;
                }
                return;
	    }
            if( bStart == bEnd){
		//System.out.println(" if #2");
		temp[k] = data[bStart];
		bStart++;
		k++;
                while( k < temp.length){
		    temp[k] = data[aStart];
		    aStart++;
		    k++;
                }
		return;
	    }
	    if(data[aStart] == data[bStart]){
		//System.out.println(" if #3");
		temp[k] = data[aStart];
		temp[k + 1] = data[bStart];
		aStart++;
		bStart++;
		k+= 2;
	    }
	    if(data[aStart] < data[bStart]){
		temp[k] = data[aStart];
		aStart++;
		k++;
	    }
	    if(data[aStart] > data[bStart]){
		temp[k] = data[bStart];
		bStart++;
		k++;
		}
	    
	}
    }

    public static void mergeSort(int[] data){
	int[] temp = new int[data.length];
	for( int i = 0; i < data.length; i++){
	    temp[i] = data[i];
	}
	mSort(data, temp, 0, data.length - 1);
    }
    private static void mSort(int[] data, int[] temp, int lo, int hi){
	if( lo >= hi){
	    return;
	}
	//for( int i = 0; i < data.length; i++){
	//    temp[i] = data[i];
	//}
	int mid = (hi + lo) / 2;
	mSort( temp, data, lo, mid);
	mSort( temp, data, mid + 1, hi);
	merge( temp, data, lo, mid, mid + 1, hi);
    }
	




    /* public static void merge(int[] data, int[]temp, int  lo, int  mid, int tSt, int  hi){
	while( lo < data.length){

	}
	}*/
               

    public static void main(String[] args){
	//System.out.println( 5/2);
	int[] a = {5, 7, 9, 837, 1, 6, 14, 999};
    int[] b = {5, 7, 9, 837, 1, 6, 14, 999};
	merge( a, b, 0, 3, 4, 7);
	for( int i = 0; i < b.length; i++){
	    
	//System.out.println(b[i]);
	}

	int[] c = {1, 1, 1, 1, 2, 1, 1, 1, 1, 1};
	mergeSort(c);
	for( int i = 0; i < b.length; i++){
	    
	System.out.println(c[i]);
	}
	
    }


}
