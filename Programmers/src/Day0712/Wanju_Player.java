package Day0712;
import java.util.HashMap;
class Solution2 { 
	public String solution(String[] participant, String[] completion) {
    	String answer ="";
        HashMap<String, Integer> hm = new HashMap<>();
        for(String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for(String player : completion) hm.put(player, hm.get(player) -1);
        for(String key : hm.keySet()) {
          if(hm.get(key) != 0) {
              answer = key; 
              System.out.println(answer);
              break; 
          } 
        }
        return answer;
    }
}
public class Wanju_Player {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
