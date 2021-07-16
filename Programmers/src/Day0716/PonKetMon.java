package Day0716;
import java.util.ArrayList;

class Solution2 {
    public int solution(int[] nums) {
        int answer = 0;
     
        ArrayList<Integer> list = new ArrayList();
        for(int i=0;i<nums.length;i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        //list값 확인용 출력문
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        answer = list.size();
        if(answer>nums.length/2) answer = nums.length/2;
        
        return answer;
    }
}
public class PonKetMon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
