package Lv1;

import java.io.*;
import java.util.Stack;

public class J_64061 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
	        
	    for(int i = 0; i < moves.length; i++){
	    	int index = moves[i]-1;
	        for(int j = 0; j < board.length; j++){
	            int num = board[j][index];
	            if(num != 0) {
	                if(stack.size() > 0 && stack.peek() == num){
	                    stack.pop();
	                    answer += 2;
	                }else{
	                    stack.push(num);
	                }
	                board[j][index] = 0;
	                break;
	            }
	        }
	    }
	        
	    bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
		br.close();
	}
}
