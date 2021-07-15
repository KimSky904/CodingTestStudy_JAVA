package Day0715;
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0;i<s.length();i++){
            char check = s.charAt(i);
            char add = (char)(check+n);
            if(check==' '){
                answer+=' ';
                continue;
            } 
            if(Character.isLowerCase(check)){
                if(Character.isLowerCase(check+n)) answer+=add;
                else answer+=(char)(add-26);
            }
            else if(Character.isUpperCase(check)){
                if(Character.isUpperCase(check+n)) answer+=add;
                else answer+=(char)(add-26);
            }
        }
        return answer;
    }
}
public class Caesar_Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
