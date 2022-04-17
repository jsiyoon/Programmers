import java.io.*;
import java.util.Arrays;
public class J_12930 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String answer = "";
		String s = br.readLine();
		
		String[] str = s.split("");
		
		int cnt = 0;
		for(int i = 0; i < str.length; i++) {
			if(str[i].equals(" ")) {
				answer += " ";
				cnt = 0;
			}else {
				answer += (cnt % 2 == 0) ? str[i].toUpperCase() : str[i].toLowerCase();
				cnt++;
			}
		}
		
		bw.write(answer);
		bw.flush();
		bw.close();
		br.close();
	}
}
