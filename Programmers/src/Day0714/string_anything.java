package Day0714;
import java.util.*;
class Solution2 {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            String plus = strings[i].substring(n, n + 1);
            strings[i] = plus + strings[i];
        }

        Arrays.sort(strings);
              
        for (int i = 0; i < strings.length; i++) {
            answer[i] = strings[i].substring(1);
        }
        
        return answer;
    }
}
public class string_anything {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
