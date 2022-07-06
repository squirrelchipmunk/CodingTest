package test;

public class 팩토리얼0개수 {
	
	private static int countFactZero(int n) {
		int count = 0;
		while(n>=5) {
			count+= n/5;
			n /= 5;
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		System.out.println(countFactZero(125));
		
	}

}
