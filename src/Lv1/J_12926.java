package Lv1;
import java.io.*;
public class J_12926 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int n = Integer.parseInt(br.readLine());
		String answer = "";
		
		String[] str = s.split("");
		for(int i = 0 ; i < str.length; i++) {
			if(str[i].equals(" ")) answer += " ";
			else {
				char sc = (char)((int)(str[i].charAt(0)) + n);
				if(sc < 'a') answer += (sc > 'Z') ? (char)((int)sc - 26) : sc;
				if(sc > 'Z') answer += (sc > 'z') ? (char)((int)sc - 26) : sc;
				
			}
		}
		bw.write(answer);
		bw.flush();
		bw.close();
		br.close();
	}
}
