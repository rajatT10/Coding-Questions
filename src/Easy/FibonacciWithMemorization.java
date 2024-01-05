package Easy;

public class FibonacciWithMemorization {
	
	public static void main(String[] args) {
		int n = 5;
		int ttl = 0;
		System.out.println(fib(n));
	}
	
	static int fib(int n) {
		if(n<=0) {
			System.out.println(0);
			return 0;
		}
		else if(n==1) {
			System.out.println(1);
			return 1;
		}
		int ttl= fib(n-2) + fib(n-1);
		System.out.println(ttl);
		return ttl;
	}
}
