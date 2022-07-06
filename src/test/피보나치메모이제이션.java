package test;

public class 피보나치메모이제이션 {

	//메모이제이션 : 동일한 계산을 반복할 때 이전에 계산한 값을 저장하여 반복 수행을 제거
	static int [] memo = new int[100];
	
	static int memoFibo(int n) {
		
		if(n<=1) {
			memo[n] = n;
			return n;
		}
		
		if(memo[n] != 0) {
			return memo[n];
		}
	
		return memo[n] = memoFibo(n-1)+memoFibo(n-2);
	}
	
	public static void main(String[] args) {
		System.out.println(memoFibo(6));
	}
}
