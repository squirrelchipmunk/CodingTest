package test;

public class 피보나치반복문 {

	public static void main(String[] args) {

		int n = 6;
		int fibo = 0;

		int n1 = 0;
		int n2 = 1;

		for (int i = 2; i <= n; i++) {
			fibo = n1 + n2;
			n1 = n2;
			n2 = fibo;
		}

		System.out.println(fibo);
	}
}
