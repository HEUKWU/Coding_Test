import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);

        for (int i = arr[arr.length - 1]; true; i++) {
            int answer = arr[0] * i;

            for (int j = 1; j < arr.length; j++) {
                if (answer % arr[j] != 0) {
                    break;
                }
                if (j == arr.length - 1) {
                    return answer;
                }
            }
        }
    }
}