import java.io.*;
import java.util.*;
public class J_42889 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = 4;
		int[] stages = {4,4,4,4,4};
		
		int[] answer = new int[N]; //결과값 담을 공간
		double[] arr = new double[N+1]; //실패율 담을 공간.
        
        double gamer = stages.length; //gamer수 
        for(int i = 1; i < N+1; i++) {
        	int count = 0; //스테이지 개수
        	for(int j = 0; j < stages.length; j++) {
        		if(i == stages[j]) count++;
        	}
        	
        	//실패율 계산
        	if(count == 0) arr[i] = 0;
        	else {
        		arr[i] =  count / gamer;
        		gamer -= count;
        	}
        }
        
        //정답 배열에 값 넣기
        for(int i = 0; i < answer.length; i++) { //정답 담을 공간
        	double max = -1;
        	int index = 0;
        	for(int j = 1; j < arr.length; j++) {//실패율 비교위함.
        		if(max < arr[j]) {
        			max = arr[j];
        			index = j;
        		}
        	}
        	
        	answer[i] = index;
        	arr[index] = -1;
        }
        
		bw.write(Arrays.toString(answer));
		bw.flush();
		bw.close();
		br.close();
	}
}
