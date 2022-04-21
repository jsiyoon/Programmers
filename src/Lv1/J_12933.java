package Lv1;
import java.util.*;
import java.io.*;
public class J_12933 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		String num = String.valueOf(n); //값을 하나씩 비교하기 위해 문자열로 저장
		int[] arr = new int[num.length()];
		for(int i = 0; i < num.length(); i++) arr[i] = Integer.parseInt(num.substring(i,i+1)); //배열에 값 저장
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for(int a : arr) sb.append(a);
		/*String str = "";
		for(int i = num.length()-1; i >= 0; i--) str += arr[i];*/
		//비교 시작
		/*int c = 0;
		String str = ""; //결과 값 담기 위한 공간
		while(c < num.length()) {
			int max = 0; //최대값 저장
			int index = 0; //max를 담고 있는 공간 0으로 초기화하기 위해 index값 받기위함.
			for(int i = 0; i < num.length(); i++) {
				if(max < arr[i]) {
					max = arr[i];
					index = i;
				}
			}
			str += String.valueOf(max);
			arr[index] = 0;
			c++;
		}*/
		
		System.out.println(sb.reverse().toString());
	}
}
