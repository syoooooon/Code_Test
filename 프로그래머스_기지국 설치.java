class Solution {
    public int solution(int n, int[] stations, int w) {
        int endPoint = 0;
        int startPoint = 1;
        int stationRange = w * 2 + 1; //기지국 전파가 닿는 전체 범위

        int answer = 0;

        //전파가 닿지 않는 범위 구하기
        for (int i = 0; i < stations.length; i++) {
            endPoint = stations[i] - (w + 1);
            if (i != 0) {
                startPoint = stations[i - 1] + w + 1;
            }

            if (endPoint >= startPoint) {
                answer += getStationCount(endPoint - startPoint + 1, stationRange);
            }

        }

        //마지막 기지국의 전파범위 이후로 존재할 때
        startPoint = stations[stations.length - 1] + w + 1;
        if (startPoint <= n) {
            answer += getStationCount(n - startPoint + 1, stationRange);
        }

        return answer;
    }

    public int getStationCount(int range, int stationRange) {
        return range % stationRange == 0 ? range / stationRange : range / stationRange + 1;
    }
}