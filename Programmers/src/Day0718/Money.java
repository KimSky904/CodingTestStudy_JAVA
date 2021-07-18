package Day0718;
import java.util.*;
class Solution2 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        
        Arrays.sort(d);
        
        for(int i=0;i<d.length;i++){
            sum+=d[i];
            if(sum>budget){
                System.out.println(sum);
                System.out.println(i);
                answer = i;
                break;
            }     
        }
        
        if(sum<=budget) answer = d.length;
        
        return answer;
    }
}
public class Money {

}
