package Day0718;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int count1 = 0;
        int count2 = 0;
        
        for(int i=0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++) {
                //�������� �ִ� �л��� ���������� ���
                if(lost[i]==reserve[j]) {
                    reserve[j] = -1;
                    lost[i] = -1; //���� �ʿ� ����
                    count1++;
                    break;
                }
            }
        }
        
        for(int i=0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++) {
                //�������� ���� �л��� ���������� ���
                if(lost[i]==reserve[j]+1 || lost[i]==reserve[j]-1) {
                    reserve[j] = -1;
                    count2++;
                    break;
                }
            }
        }
        answer = n - lost.length + count1 + count2;
        
        return answer;
    }
}
public class SportsClothes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
