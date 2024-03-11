class Solution {
    public int solution(int n, int k) {
        String number = Integer.toString(n, k);

        int count = 0;
        String[] split = number.split("0");
        for (String s : split) {
            if (!s.isEmpty()) {
                if (isPrime(s)) {
                    count++;
                }
            }
        }

        return count;
    }

    boolean isPrime(String s) {
        long number = Long.parseLong(s);
        if (number == 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}