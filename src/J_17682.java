import java.io.*;
import java.util.*;
public class J_17682 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String dartResult = br.readLine();
		
		int answer = 0;
		int[] arr = new int[3];
        int index = 0;
        for(int i = 0; i < dartResult.length(); i++){
            char c = dartResult.charAt(i);
            if(c == '0') arr[index] = (arr[index] == 1) ? 10 : 0;
            if(c > '0' && c <= '9') {
            	arr[index] = (int)c-48;
            	continue;
            }
            switch(c){
                case 'S' :
                    index++;
                    break;
                case 'D' :
                    arr[index] *= arr[index];
                    index++;
                    break;
                case 'T' :
                    arr[index] *= arr[index] * arr[index];
                    index++;
                    break;
                case '*' :
                    arr[index-1] *= 2;
                    if(index > 1) arr[index-2] *= 2;
                    break;
                case '#' :
                    if(index > 0) arr[index-1] = -arr[index-1];
                    break;     
            }
        }
        for(int a : arr) answer += a;
        bw.write(Arrays.toString(arr));
		
		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
		br.close();
	}
}
