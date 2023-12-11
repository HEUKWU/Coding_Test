class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int r = 10;
        int l = 12;

        for (int n : numbers) {
            if (n == 1 || n == 4 | n == 7) {
                l = n;
                sb.append("L");
            } else if (n == 3 || n == 6 || n == 9) {
                r = n;
                sb.append("R");
            } else {
                if (n == 0) {
                    n = 11;
                }
                int right = (Math.abs(n - r) / 3) + (Math.abs(n - r) % 3);
                int left = (Math.abs(n - l) / 3) + (Math.abs(n - l) % 3);

                if (left < right) {
                    l = n;
                    sb.append("L");
                } else if (right < left) {
                    r = n;
                    sb.append("R");
                } else {
                    if (hand.equals("left")) {
                        l = n;
                        sb.append("L");
                    } else {
                        r = n;
                        sb.append("R");
                    }
                }
            }
        }

        return sb.toString();
    }
}