import java.io.*;
import java.util.*;
public class J_68644 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] answer = {};
		int[] numbers = {2,1,3,4,1};
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i = 0; i < numbers.length-1; i++) {
			for(int j = i+1; j <numbers.length; j++) {
				hs.add(numbers[i] + numbers[j]);
			}
		}
		
		Iterator<Integer> is = hs.iterator();
		int index = 0;
		answer = new int[hs.size()];
		while(is.hasNext()) {
			answer[index] = is.next();
			index++;
		}
		bw.write(Arrays.toString(answer));
		bw.flush();
		bw.close();
		br.close();
	}
}
