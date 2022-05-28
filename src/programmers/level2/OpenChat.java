package programmers.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://programmers.co.kr/learn/courses/30/lessons/42888?language=java

public class OpenChat {

	public static String[] solution(String[] record) {
		
		Map <String, String> chatUser = new HashMap<>();
		for(String r : record) {
			if(r.split(" ")[0].equals("Enter") || r.split(" ")[0].equals("Change") ) {
				chatUser.put( r.split(" ")[1], r.split(" ")[2]);
			}
		}
		
		List<String> result = new ArrayList<>();
		for(String r : record) {
			if(r.split(" ")[0].equals("Enter")) {
				result.add( chatUser.get(r.split(" ")[1])+"님이 들어왔습니다.");
			}
			else if(r.split(" ")[0].equals("Leave")) {
				result.add( chatUser.get(r.split(" ")[1])+"님이 나갔습니다.");
			}
		}
		
		String[] answer = result.toArray(new String[result.size()]);
		return answer;

	}

}
