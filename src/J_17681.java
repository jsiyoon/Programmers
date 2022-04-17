import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class J_17681 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr1 = {46,33,33,22,31,50};
		int[] arr2 = {27,56,19,14,14,10};
		
		String[] answer = new String[n];
        String[] arr = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }
       
        Arrays.fill(answer, "");
        bw.write(Arrays.toString(arr) + "\n");
        
        for(int j = 0; j < n; j++) {
        	for(int i = 0; i < arr[j].length(); i++) {
        		char c = arr[j].charAt(i);
        		if(c == '1') answer[j] += "#";
        		else answer[j] += " ";
        	}
        }
       /*for(int j = 0; j < n; j++){
            for(int i = 0; i < n; i++){
                char c = arr[j].charAt(i);
                if(c == '1') answer[j] += "#";
                else answer[j] += " ";
            }
        }*/
		
		
		bw.write(Arrays.toString(answer));
		bw.flush();
		bw.close();
		br.close();
	}
}
