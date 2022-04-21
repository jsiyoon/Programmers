package Lv1;
import java.util.*;
public class J_12932 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		String num = String.valueOf(n);
		int[] answer = new int[num.length()];
		for(int i = 0; i < num.length(); i++) answer[i] = Integer.parseInt(num.substring(num.length()-i-1, num.length()-i));
		
		System.out.println(Arrays.toString(answer));
	}
}
