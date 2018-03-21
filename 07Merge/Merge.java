public class Merge{

    /*public static int[] merge( int[] a, int[] b){
        /*int[] tempA = new int[(eA - sA) + 1];
        int[] tempB = new int[(eB - sB) + 1];
        for( int j = (eA - sA +) 1, int k = (eB - sB +) 1; ; j++, k++){
            tempA[j] = data[j];
            tempB[k] = data[k];
        }
        int[] tempData = new int[(eB - sA) + 1];
        int i = 0;
        int j = 0;
        int[] dataToo = new int[a.length + b.length];
        for(int k = 0; /*i < a.length || j < b.length k < dataToo.length; k++){
            if( i == a.length){
                while( k < dataToo.length){
                    data[k] = b[j];
                    j++;
                    k++;
                }
                return dataToo;
            }else if( j == b.length){
                while( k < dataToo.length){
                data[k] = b[i];
                i++;
                k++;
                }
            return dataToo;
	    }else if(){
	    }
	}

    }*/

    public static void mergeSort(int[] data){
    }
    private static void mSort(int[] data, int[] temp, int lo, int hi){
	if( lo >= hi){
	    return;
	}
	int mid = (hi + lo) / 2;
	mSort( temp, data, lo, mid);
	mSort( temp, data, mid + 1, hi);
	merge( data, temp, lo, mid, mid + 1, hi);
    }
	




    public static void merge(int[] data, int[]temp, int  lo, int  mid, int tSt, int  hi){
	while( lo < data.length){

	}
    }
               

    public static void main(String[] args){
	System.out.println( 5/2);
    }


}
