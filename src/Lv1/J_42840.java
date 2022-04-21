package Lv1;
import java.util.*;
import java.io.*;
public class J_42840 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] answers = {1,3,2,4,2};
		
		int[] answer = {};
        int[] n1 = new int[answers.length];
        int[] n2 = new int[answers.length];
        int[] n3 = new int[answers.length];
        
        int count = 0;
        for(int i = 0; i < answers.length; i++){//1~3번 수포자가 입력한 문제의 답
            if(i % 5 == 0) count = 1;
            n1[i] = count;
            count++;
        }
        
        count = 1;
        for(int i = 0; i < answers.length; i++){//1~3번 수포자가 입력한 문제의 답
            if(i % 2 == 0) count = 2;
            else {
            	if(i > 1) {
            		switch(n2[i-2]) {
	            		case 1 :
	            			count = 3;
	            			break;
	            		case 3 :
	            			count = 4;
	            			break;
	            		case 4 :
	            			count = 5;
	            			break;
	            		case 5 :
	            			count = 1;
	            			break;
            		}
            	}else {
            		count = 1;
            	}
            }
            n2[i] = count;
        }
        
        count = 3;
        for(int i = 0; i < answers.length; i++){//1~3번 수포자가 입력한 문제의 답
            if(i > 1) {
            	switch(n3[i-2]) {
            		case 3 :
            			count = 1;
            			break;
            		case 2 :
            			count = 4;
            			break;
            		case 5 :
            			count = 3;
            			break;
            		case 1 :
            			count = 2;
            			break;
            		case 4 :
            			count = 5;
            			break;
            	}
            	
            }
            n3[i] = count;
        }
        
        int[] num = new int[3];
        for(int i = 0; i < answers.length; i++) {
        	if(n1[i] == answers[i]) num[0]++;
        	if(n2[i] == answers[i]) num[1]++;
        	if(n3[i] == answers[i]) num[2]++;
        }
        
        int max = 0;
        String str = "";
        for(int i = 0; i < 3; i++) max = Math.max(max, num[i]);
        for(int i = 0; i < 3 ; i++) {
        	if(max == num[i]) str += i+1;
        }
        
        answer = new int[str.length()];
        for(int i = 0; i < str.length(); i++) {
        	answer[i] = Integer.parseInt(str.substring(i,i+1));
        }
        Arrays.sort(answer);
        bw.write(Arrays.toString(answer));
		bw.flush();
		bw.close();
		br.close();
	}
}
