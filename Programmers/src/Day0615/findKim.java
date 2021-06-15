package Day0615;

public class findKim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        
        for(int i=0;i<seoul.length;i++){
            if(seoul[i].equals("Kim"))
                answer="김서방은 "+i+"에 있다";
        }        
        return answer;
    }
}