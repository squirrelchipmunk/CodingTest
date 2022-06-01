package programmers.level2;

public class PrimeNumber {

	public static String convertNumber(long n, int k) {
		String kNum="";
		while( n >0) {
			long remainder = n % k;
			kNum = remainder + kNum;
			n /= k;
		}
		
		return kNum;
	}
	
	public static boolean isPrime(String range) {
		long n = Long.parseLong(range);
		
		if(n<2) return false;
		else if(n==2) return true;
		else if(n%2==0) return false;
		
		for(int i=3; i<= Math.sqrt(n); i+=2) {
			if(n%i == 0)
				return false;
		}
		
		return true;
	}
	
	public static int solution(long n, int k) {
		int answer = 0;
		String kNum = convertNumber(n, k);
		
		for( int i=0; i< kNum.length(); i++ ) {
			if (kNum.charAt(i) == '0')
				continue;
			else {
				int start = i;
				while(kNum.charAt(i) != '0') {
					i++;
					if(i>= kNum.length())
						break;
				}
				String range = kNum.substring(start, i);
				
				if( isPrime(range)) {
					answer++;
				}
			}
		}
		
        return answer;
    }
	
	public static void main(String[] args) {
		long n = 437674;
		int k = 3;
		
		solution(n,k);
	}

}
