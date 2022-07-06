package test;

public class 피보나치재귀함수 {

	
	// 0, 1, 1, 2, 3, 5 ....
	public static int fibo(int n) {
		
		if(n <= 1) {
			return n;
		}
		
		return fibo(n-1)+fibo(n-2);
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(fibo(6));

	}

}
