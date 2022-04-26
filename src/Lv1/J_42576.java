package Lv1;

import java.io.*;
import java.util.*;

public class J_42576 {
	public static void main(String[] args) throws Exception{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int answer = 0;
		int[] nums = {1,2,7,6,4};
		
		boolean[] arr = new boolean[3000];
		Arrays.fill(arr, false);
		for(int i = 2; i < 3000; i++){
            for(int j = i*2; j < 3000; j+=i){
                if(arr[j] == true) continue;
                arr[j] = true; //소수가 아니면 true, 소수이면 false
            }
        }
        
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length-2; i++){
            for(int j = i+1; j < nums.length-1; j++){
                for(int k = j+1; k < nums.length; k++){
                    int num = nums[i] + nums[j] + nums[k];
                    if(!arr[num]) answer++;
                }
            }
        }
		
		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
	}
}
