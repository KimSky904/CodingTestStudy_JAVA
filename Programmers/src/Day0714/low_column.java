package Day0714;
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        for(int i=0;i<arr1.length;i++){
            answer[i][0] = arr1[i][0] + arr2[i][0];
            for(int j=0;j<arr1[0].length;j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        return answer;
    }
}
public class low_column {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
