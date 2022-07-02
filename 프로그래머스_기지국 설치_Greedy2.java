import java.util.ArrayList;

class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int position = 1;
        int si = 0; //station index
        
        while (position <= n) {
            //기존 설치된 기지국이 있는 경우
            if(si < stations.length && stations[si] - w <= position) {
                position = stations[si] + w + 1; //범위 밖으로 이동
                si ++;
            } else { // 한칸씩 이동하면서 순회 -> 기지국 설치 -> 범위 밖으로 이동
                answer ++;
                position += w*2 + 1;
            }
        }
        
        return answer;

        
    }
}