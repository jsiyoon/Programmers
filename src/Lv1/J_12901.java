package Lv1;
import java.io.*;
import java.util.*;
public class J_12901 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		String answer = "";
        int days = 0;
        int[] day = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        for(int i = 1; i < a; i++) days += day[i];
        answer = week[(days+b)%7];
        
		bw.write(answer);
		bw.flush();
		bw.close();
		br.close();
	}
}
