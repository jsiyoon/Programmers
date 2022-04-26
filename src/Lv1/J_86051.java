package Lv1;
import java.util.*;
public class J_86051 {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,6,7,8,0};
		int answer = 0;
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        
        /*int index = 0;
        for(int i = 0; i < 10; i++){
            if(i != numbers[index]) answer += i;
            else index++;
            if(index > numbers.length-1) {
            	for(int j = i+1; j < 10; j++) {
            		answer += j;
            	}
            	break;
            }
        }*/
        int num = 0;
        for(int i = 0; i < numbers.length; i++) {
        	if(numbers[i] != num) {
        		answer += num;
        		i--;
        	}
        	System.out.println(answer);
        	num++;
        }
        if(num < 10) {
        	while(num < 10) {
        		answer += num;
        		num++;
        	}
        }
		System.out.println(answer);
	}
}
