import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String[] n = new String[numbers.length];
        int zero = 0;
        for (int i = 0; i < n.length; i++) {
            if (numbers[i] == 0) {
                zero++;
                if (zero == numbers.length) {
                    return "0";
                }
            }
            n[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(n, (a, b) -> (b + a).compareTo(a + b));

        StringBuilder sb = new StringBuilder();
        for (String s : n) {
            sb.append(s);
        }

        return sb.toString();
    }
}