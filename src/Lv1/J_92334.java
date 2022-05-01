package Lv1;

import java.util.*;

public class J_92334 {
	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;		
		
		int[] answer = new int[id_list.length];
		
		HashMap<String, Set<String>> singo = new HashMap<>(); //각 유저 당 신고한 유저저장
		HashMap<String, Integer> count = new HashMap<>();//각 유저 신고당한 횟수 저장 Map
		
		//각각의 Map초기화
		for(String id : id_list) {
			singo.put(id, new HashSet<String>());
			count.put(id,0);
		}
		
		//신고당한 횟수 Map에 저장.
		for(String r : report) {
			StringTokenizer st = new StringTokenizer(r);
			String s1 = st.nextToken();
			String s2 = st.nextToken();
			
			//만약 중복방지하는 Set에 들어간다면 신고횟수 up(Set에는 같은 값 들어갈 수 없음. -> 이미 신고했음을 파악)
			if(singo.get(s1).add(s2)) {
				count.put(s2, count.get(s2) + 1);
			}
		}
		
		//singo map에서 k번 미만으로 신고된 유저 삭제
		for(String r : report) {
			StringTokenizer st = new StringTokenizer(r);
			String s1 = st.nextToken();
			String s2 = st.nextToken();
			
			if(count.get(s2) < k) {
				singo.get(s1).remove(s2);
			}
		}
		
		for(int i = 0; i < id_list.length; i++) {
			answer[i] = singo.get(id_list[i]).size();
		}
		
		System.out.println(Arrays.toString(answer));
	}
}
