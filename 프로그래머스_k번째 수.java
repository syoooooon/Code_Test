import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            
            // 배열 자르는 범위 설정
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                list.add(array[j]); //범위 내의 요소를 list에 넣기
            }
            Collections.sort(list); //리스트 정렬
            answer[i] = list.get(commands[i][2] - 1);
        }
        return answer;
        
    }
}