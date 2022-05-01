package Lv1;

public class J_72410 {
	public static void main(String[] args) {
		String new_id = "z-+.^.";
		
		String answer = "";
		
		// 1단계 : 모든 대문자 -> 소문자 치환
		new_id = new_id.toLowerCase();
		
		String str = "";
		//2단계 : 알파벳 소문자, 숫자, 빼기, 밑줄, 마침표 제외한 모든 문자 제거
		for(int i = 0; i < new_id.length(); i++) {
			char c = new_id.charAt(i);
			if((c >= 'a' && c <= 'z') || ( c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.') {
				str += c;
			}
		}
		new_id = str;
		
		//3단계 : 마침표(.)가 2번 이상 연속된 부분 하나의 마침표로 치환
		while(new_id.contains("..")) {
			new_id = new_id.replace("..", ".");
		}
		
		/*while(new_id.indexOf("..") > -1) {			
			new_id = new_id.replace("..", ".");
		}*/
		
		/*//4단계 : 마침표(.)처음이나 끝에 위치한다면 제거.
		if(new_id.length() > 0 && (new_id.charAt(0) == '.' || new_id.charAt(new_id.length()-1) == '.')) {
			if(new_id.charAt(0) != '.') new_id = new_id.substring(0, new_id.length()-1);
			else if(new_id.charAt(new_id.length()-1) != '.') new_id = new_id.substring(1, new_id.length());
			else if(new_id.length() > 1) new_id = new_id.substring(1, new_id.length()-1);
			else new_id = "";
		}
			
		//5단계 : 빈문자열이라면, new_id에 "a"대입
		if(new_id.equals("")) new_id = "a";
		
		//6단계 : 길이 16이상이라면 첫 15문자 제외한 나머지 모두제거, 만약 제거 후 마침표(.)가 끝에 위치한다면 제거
		if(new_id.length() > 15) {
			new_id = new_id.substring(0,15);
			if(new_id.charAt(new_id.length()-1) == '.') new_id = new_id.substring(0,14);
		}
		
		//7단계 : 길이가 2 이하라면, 마지막 문자를 길이가 3이 될때까지 추가
		if(new_id.length() < 3) {
			char c = new_id.charAt(new_id.length()-1);
			while(new_id.length() < 3) new_id += c;
		}
        */
        answer = new_id;
        
		System.out.println(answer);
	}
}
