package Lv1;
import java.io.*;
public class J_77884 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int left = 13;
		int right = 17;
		
		int answer = 0;
        int count = 0;
        for(int i = left;  i <= right; i++){
            for(int j = 1; j <= i; j++){
                if(i % j == 0) count ++;
            }
            if(count % 2 == 0) answer += i;
            else answer -= i;
            count = 0;
        }
		
        bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
		br.close();
	}
}
