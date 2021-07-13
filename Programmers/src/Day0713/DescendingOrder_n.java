package Day0713;
import java.util.*;
class Solution {
    public long solution(long n) {
        char[] input = Long.toString(n).toCharArray();
        Arrays.sort(input);
        long answer = 0;
        for(int i = input.length-1; i>=0 ; i--){
            answer += Character.getNumericValue(input[i]);
            answer*=10;
            if(i==0) answer/=10;
        }
        return answer;
    }
}