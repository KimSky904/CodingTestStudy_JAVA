package Day0615;
class Solution2 {
    public int[] solution(int[] arr) {
        //int[] answer = new int[arr.length];
        int[] answer;
        int count=0;
        
        if(arr.length==1){
            answer = new int[1];
            answer[0] = -1;
            return answer;
        } 
        answer = new int[arr.length-1];
        int min = arr[0];
        int index = 0;
        
        //최소값찾기
        for(int i=0;i<arr.length;i++){
            if(min > arr[i]) min = arr[i];
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==min) continue;
            answer[index] = arr[i];
            index++;
        }
        
        return answer;
    }
}
public class elimate_minValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
