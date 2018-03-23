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
        for(int k = 0; (aStart <= aEnd || bStart <= bEnd) &&  k < temp.length; k++){
            if( aStart == aEnd){
                while( k < temp.length){
                    temp[k] = data[bStart];
                    bStart++;
                    k++;
                }
                return;
	    }
            if( bStart == bEnd){
                while( k < temp.length){
                temp[k] = data[aStart];
                aStart++;
                k++;
                }
		return;
	    }
	    if(data[aStart] == data[bStart]){
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
    }
    private static void mSort(int[] data, int[] temp, int lo, int hi){
	if( lo >= hi){
	    return;
	}
	for( int i = 0; i < data.length; i++){
	    temp[i] = data[i];
	}
	int mid = (hi + lo) / 2;
	mSort( temp, data, lo, mid);
	mSort( temp, data, mid + 1, hi);
	merge( data, temp, lo, mid, mid + 1, hi);
    }
	




    /* public static void merge(int[] data, int[]temp, int  lo, int  mid, int tSt, int  hi){
	while( lo < data.length){

	}
	}*/
               

    public static void main(String[] args){
	System.out.println( 5/2);
	int[] a = {2, 5, 3, 8, 5, 6, 3};
	int[] b = {2, 5, 3, 8, 5, 6, 3};
	merge( a, b, 0, 4, 5, 6);
	for( int i = 0; i < b.length; i++){
	    
	System.out.println(b[i]);
	}
    }


}
