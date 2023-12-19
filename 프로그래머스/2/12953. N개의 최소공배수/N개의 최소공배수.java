import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);

        for (int i = 2; true; i++) {
            int a = arr[0] * i;
            boolean b = false;
            if (a < arr[arr.length - 1]) {
                continue;
            }
            for (int j = 1; j < arr.length; j++) {
                if (a % arr[j] != 0) {
                    b = false;
                    break;
                } else {
                    b = true;
                }
            }
            if (b) {
                return a;
            }
        }
    }
}