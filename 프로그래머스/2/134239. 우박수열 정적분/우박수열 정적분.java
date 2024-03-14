import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
        private List<Integer> list;

    public double[] solution(int k, int[][] ranges) {
        list = collatz(k);

        double[] answer = new double[ranges.length];
        for (int i = 0; i < ranges.length; i++) {
            int start = ranges[i][0];
            int end = list.size() - 1 + ranges[i][1];

            if (start == end) {
                answer[i] = 0.0;
                continue;
            } else if (start > end) {
                answer[i] = -1.0;
                continue;
            }

            answer[i] = integral(start, end);
        }

        return answer;
    }

    private List<Integer> collatz(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(n);

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            list.add(n);
        }

        return list;
    }

    private double integral(int start, int end) {
        double sum = 0;

        for (int i = start; i < end; i++) {
            sum += (list.get(i) + list.get(i + 1)) / 2.0;
        }

        return sum;
    }
}