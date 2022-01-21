package programmers.level3;
import java.util.HashMap;

// https://programmers.co.kr/learn/courses/30/lessons/77486
public class Toothbrush {

	public static int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
		final int PRICE = 100;
		int [] answer = new int[enroll.length];
		
		HashMap<String, Integer> numberMap = new HashMap<>();
		HashMap<String, String> relationMap = new HashMap<>();
		
		for(int i=0; i<enroll.length;i++) {
			numberMap.put(enroll[i], i);
			relationMap.put(enroll[i], referral[i]);
		}
		
		for(int i=0 ; i<seller.length ; i++) { 
			//실적 있는 판매원
			int num = numberMap.get(seller[i]);			// 판매원의 인덱스 (answer에 더할 위치)
			String ref = relationMap.get(seller[i]);	// 판매원의 추천자
			int profit = amount[i]*PRICE;				// 판매원의 수익
			while(true) {
				if(profit < 1)				
					break;
				if("-".equals(ref)) {
					answer[num] += profit - (profit/10);
					break;
				}
				else {
					answer[num] += profit - (profit/10);
					num = numberMap.get(ref);
					ref = relationMap.get(enroll[num]);
					profit /= 10;
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		String []enroll = 	{"john"	, "mary", "edward"	, "sam"		, "emily"	, "jaimie"	, "tod"		, "young"	}; // 판매원 목록
		String []referral = {"-"	, "-"	, "mary"	, "edward"	, "mary"	, "mary"	, "jaimie"	, "edward"	}; //각 판매원의 추천인
		String []seller = 	{"young", "john", "tod"		, "emily"	, "mary" 	}; // 실적 있는 판매원
		int	   []amount =  	{12		, 4		, 2			, 5			, 10		};	// 각 판매원의 판매 수량

		int[] result = solution(enroll, referral, seller, amount);
		for(int i=0;i<result.length;i++) {
			System.out.println(enroll[i]+" : "+result[i]);
		}
	}

}
