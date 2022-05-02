package Lv2;

import java.util.*;
public class J_12953 {
	public static void main(String[] args) {
		int[] arr = {3, 26};
		int answer = 0;
		Arrays.toString(arr);
		
		//소수 판별
        boolean[] ck = new boolean[101];
        for(int i = 2; i < ck.length; i++){
            for(int j = i*2; j < ck.length; j+=i){
                if(ck[j] == true) continue;
                ck[j] = true;
            }
        }
		
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i < arr.length; i++) {
        	for(int l : list) {
    			if(arr[i] % l == 0) arr[i] /= l;
    		}
        	
        	if(ck[arr[i]] == false) {
        		list.add(arr[i]);
        	}else {
        		while(arr[i] > 1) {
        			System.out.println(arr[i]);
        			if(arr[i] % 2 == 0) {
        				list.add(2);
        				arr[i] /= 2;
        			}else if(arr[i] % 3 == 0){
        				list.add(3);
        				arr[i] /= 3;
        			}else if(arr[i] % 5 == 0) {
        				list.add(5);
        				arr[i] /= 5;
        			}else if(arr[i] % 7 == 0) {
        				list.add(7);
        				arr[i] /= 7;
        			}else {
        				list.add(arr[i]);
        				arr[i] /= arr[i];
        			}
        		}
        	}
        }
        
        for(int l : list) {
        	if(answer == 0) answer += l;
        	else answer *=l;
        }
		System.out.println(answer);
	}
}
