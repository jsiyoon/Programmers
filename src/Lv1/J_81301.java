package Lv1;

public class J_81301 {
	public static void main(String[] args) {
		String s = "2three45sixseven";
		
		int answer = 0;
        String result = "";
        String str = "";
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i < arr.length; i++){
            str = String.valueOf(i);
            s = s.replaceAll(arr[i], str);
        }
        /*for(int i = 0;  i < s.length(); i++){
            char c = s.charAt(i);
            if('0' <= c && c <= '9'){
                result += c;
            }else{
                str += c;
            }
            if(!str.equals("")){
                for(int j = 0; j < arr.length; j++){
                    if(str.equals(arr[j])){
                        result += String.valueOf(j);
                        str = "";
                    }
                }
            }
        }*/
        answer = Integer.parseInt(s);
        System.out.println(answer);
	}
}
