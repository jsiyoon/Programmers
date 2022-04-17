import java.io.*;
import java.util.*;
public class J_68935 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int answer = 0;
		
		Stack<Integer> st = new Stack<>();
		while(num > 0) {
			st.add(num % 3);
			num /= 3;
		}
		
		int count = 1;
		while(!st.isEmpty()) {
			answer += st.pop() * count;
			count *= 3;
		}
		
		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
		br.close();
	}
}
