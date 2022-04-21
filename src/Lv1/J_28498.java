package Lv1;
import java.util.*;
import java.io.*;
public class J_28498 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = 5;
	    int[] lost = {1, 2, 4};
	    int[] reserve = {2, 3, 4, 5}; //정답 4

	    Arrays.sort(lost);
	    Arrays.sort(reserve);
	    
	    int answer = n-lost.length;
	    Queue<Integer> que = new LinkedList<Integer>();
	    
	    for(int m : lost) { //여벌의 체육복 가져온 친구 판별
	    	boolean ck = false;
	    	for(int i = 0; i < reserve.length; i++) {
	    		if(m == reserve[i]) {
	    			answer++;
	    			reserve[i] = -1;
	    			ck = true;
	    			break;
	    		}
	    	}
	    	if(!ck) {
	    		que.offer(m);
	    	}
	    	
	    }
	    
	    while(!que.isEmpty()) {
	    	int student = que.remove();
	    	for(int i = 0; i < reserve.length; i++) {
	    		if(student-1 == reserve[i] || student+1 == reserve[i]) {
	    			answer++;
	    			reserve[i] = -1;
	    			break;
	    		}
	    	}
	    }
		
		bw.write(String.valueOf(answer));
		bw.flush();
		br.close();
		bw.close();
	}
}
