package test;

public class 유클리드호제법 {

	//두 자연수중 작은수까지 나눠보기 : O(N)
	//유클리드 호제법 : O(logN)
		
	/* 20 6
	 * a/b=r (a>b)이라고 하면 gcd(a,b) == gcd(b,r)가 성립한다
	 * gcd(r, r1) = gcd(r1, r2) = gcd(r2, r3) .... = gcd(rn-1, rn)
	 * num1/num2가 0이 될 때까지 반복해서 나누고 이 값이 0이 될 때 num1이 최대 공약수. 
	 * */
	
	public static int gcd(int num1, int num2) {
		if(num2 == 0)
			return num1;
		
		return gcd(num2, num1%num2);
	}
	
	public static void main(String[] args) {

		// A*B = G*L
		// A = G*a
		// B = G*b
		// A * B = G * G * a * b
		// A * B = G * L
		
		System.out.println("최대 공약수 : "+gcd(36,26));
		System.out.println("최소 공배수 : "+24*16/gcd(24,16));
	}

}
