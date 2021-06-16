package Day0616;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
       
        for(int i=0;i<commands.length;i++){
            int start=commands[i][0];
            int end=commands[i][1];
            int min = array[start-1];
            int k=0;
            int[] sortArr = new int[end-(start-1)];
            for(int j=start-1;j<end;j++){
                sortArr[k] = array[j];
                k++;
            }
            Arrays.sort(sortArr);
            answer[i] = sortArr[commands[i][2]-1];
        }
          
        return answer;
    }
}
public class number_Kth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
