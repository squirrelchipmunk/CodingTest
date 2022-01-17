package programmers.level1;

public class Lotto {

	public int[] solution(int[] lottos, int[] win_nums) {
        
        int matchCount = 0;
        int unknownCount = 0;
        
        for(int l : lottos) {
        	if(l == 0) {
        		unknownCount++;
        	}
        	for(int w : win_nums) {
        		if(l == w) {
        			matchCount++;
        		}
        	}
        }
        
        int max = 7 - (matchCount+unknownCount);
        int min = 7 - matchCount;
        
        if(max>6)
        	max = 6;
        if(min>6)
        	min = 6;
        int[] answer= {max, min};

        return answer;
    }

}
