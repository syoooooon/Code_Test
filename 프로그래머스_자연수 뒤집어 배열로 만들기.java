class Solution {
    public int[] solution(long n) {

        String str = String.valueOf(n);
        char[] ch = str.toCharArray();
        int[] answer = new int[ch.length];
        
        for (int i = 0; i < ch.length; i++) {
            answer[i] = ch[ch.length - (i+1)] - '0';
        }   
        
        return answer;
    }
}