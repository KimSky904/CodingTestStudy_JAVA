package Day0716;
import java.util.*;

class Solution {
    public int[] solution(int []arr) {

        ArrayList<Integer> list = new ArrayList();
        int index = 0;
        list.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                list.add(arr[i]);   
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
public class noSameNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
