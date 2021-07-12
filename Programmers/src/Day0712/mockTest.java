package Day0712;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] cnt = new int[3];
        int[] value = new int[3];
        int cnt_a=0,cnt_b=0,cnt_c=0;

        int index= 0;
        int max = 0;

        for(int i=0;i<answers.length;i++,index++){
            if(answers[i]==a[index%5]) cnt[0]++;
            if(answers[i]==b[index%8]) cnt[1]++;
            if(answers[i]==c[index%10]) cnt[2]++;
        }

        int answer_index=0;
        max = Math.max(cnt[0],cnt[1]);
        max = Math.max(max,cnt[2]);
        
        if(max==cnt[0]){
            value[answer_index] = 1;
            answer_index++;
        } 
        if(max==cnt[1]){
            value[answer_index] = 2;
            answer_index++; 
        }
        if(max==cnt[2]){
            value[answer_index] = 3;
            answer_index++; 
        }
        
        answer = new int[answer_index];
        
        for(int i=0;i<answer.length;i++){
            if(value[i]!=0){
               answer[i] = value[i];
            }    
        }
        
        return answer;
    }
}
public class mockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
