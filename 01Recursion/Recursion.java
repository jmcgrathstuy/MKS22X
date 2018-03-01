public class Recursion{
	
	
	Recursion(){
	}
	
	public int fact(int n){
		if( n < 0){
			throw new IllegalArgumentException("Argument must not be negative");
		}
		//System.out.println(n);
		if(n == 0){
			return 1;
		}
		
		return n*(fact(n - 1));
	}
	
	public int fib( int n){
		if( n < 0){
			throw new IllegalArgumentException("Argument must not be negative");
		}
		if( n == 0){
			return 0;
		}
		if( n == 1){
			return 1;
		}
		
		return fib(n - 1) + fib(n - 2);
	}
	
	
	public double helper(double n, double guess){
		if(    ((n - (guess * guess) < 0.000001 ) && (n - (guess * guess) >= 0)) || (n - (guess * guess) > -0.000001 ) && (n - (guess * guess) <= 0)  ){
			return guess;
		}
		
		return helper(n, (n / guess + guess) / 2);
		
	}
	
	public double sqrt( double n){
		if( n < 0){
			throw new IllegalArgumentException("Argument must not be negative");
		}
		if( n == 0){
			return 0;
		}
		return helper(n, 1);
	}
	
	
	
	
	/*public static void main( String[] args){
		
		Recursion a = new Recursion();
		//System.out.println(fact(-1));
		System.out.println(a.fact(15));
		System.out.println(a.fact(20));
		System.out.println(a.fact(4));
		System.out.println(a.fib(15));
		System.out.println(a.fib(20));
		System.out.println(a.fib(0));
		System.out.println(a.fib(1));
		System.out.println(a.fib(2));
		System.out.println("Square Root Stuff Below:");
		System.out.println(a.sqrt(0));
		System.out.println(a.sqrt(45600));
		System.out.println(a.sqrt(1));
		System.out.println(a.sqrt(4));
		System.out.println(a.sqrt(100));
		System.out.println(a.sqrt(169));
		System.out.println(a.sqrt(5));
		System.out.println(a.sqrt(99999));
		
		
		
	}*/
	
	
	
	
	
	
}
