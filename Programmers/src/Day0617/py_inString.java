package Day0617;
class Solution2 {
    boolean solution(String s) {
        boolean answer = false;

        int count_p=0;
        int count_y=0;
        
        for(int i=0;i<s.length();i++){
            char letter = s.charAt(i);
            // if(letter.equals('p')==true||letter.equals('P')==true) count_p++;
            // if(letter.equals('y')==true||letter.equals('Y')==true) count_y++;
            if(letter=='p'||letter=='P') count_p++;
            if(letter=='y'||letter=='Y') count_y++;
        }
        if(count_p==count_y) answer = true;
        return answer;
    }
}
public class py_inString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
