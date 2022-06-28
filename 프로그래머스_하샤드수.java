class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        
        //정수 x -> 문자열 바꾸기
        String str = Integer.toString(x);
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); //문자열 인덱싱
            int num = ch - '0'; //문자 -> 정수
            sum += num;   
        }
        
        if (x % sum == 0) {
            return answer;
        } else {
            answer = false;
            return answer;
        }
        
    }
}