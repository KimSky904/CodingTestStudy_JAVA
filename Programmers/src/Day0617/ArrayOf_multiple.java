package Day0617;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {

        int count=0;
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0) count++;
        }
        if(count==0){
            int[] answer = new int[1];
            answer[0]=-1;
            return answer;
        } 
        int[] answer = new int[count];
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0) answer[index++]=arr[i];
        }
        Arrays.sort(answer);
        
        return answer;
    }
}
public class ArrayOf_multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
