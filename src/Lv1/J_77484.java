package Lv1;
import java.util.*;
public class J_77484 {
	public static void main(String[] args) {
		int[] lottos = {1,2,3,4,5,6};
		int[] win_nums = {7,8,9,10,11,12};
		
		int[] answer = new int[2];
        int[] ranking = {6,6,5,4,3,2,1};
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        
        int zero = 0;
        int same = 0;
        for(int i = 0; i < lottos.length; i++){
            if(lottos[i] == 0){
                zero++;
                System.out.print(zero);
                continue;
            }else{
                for(int j = 0; j < win_nums.length; j++){
                    if(lottos[i] == win_nums[j]){
                        same++;
                        System.out.print(same);
                        break;
                    }
                }
            }
        }
        
        answer[0] = ranking[same+zero];
        answer[1] = ranking[same];
        
        System.out.println(Arrays.toString(answer));
	}
}
