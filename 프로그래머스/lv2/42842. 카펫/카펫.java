class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int area = brown + yellow;
        for (int i = 3; i <= Math.sqrt(area); i++) {
            if (area % i == 0) {
                int width = area / i;
                int length = i;
                if ((width - 2) * (length - 2) == yellow) {
                    answer[0] = width;
                    answer[1] = length;
                    break;
                }
            }
        }

        return answer;
    }
}