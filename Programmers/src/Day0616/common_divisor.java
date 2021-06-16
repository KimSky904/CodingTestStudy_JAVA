package Day0616;
class Solution2 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        for(int i=1;i<=m;i++){
            if(n%i==0&&m%i==0){
                answer[0]=i;
                answer[1]=n*m/i;
            } 
        }
      
        
        return answer;
    }
}
public class common_divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
