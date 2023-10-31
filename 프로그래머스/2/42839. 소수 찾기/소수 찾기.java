import java.util.HashSet;

class Solution {
    static HashSet<Integer> set = new HashSet<>();
    static char[] arr;
    static boolean[] visited;

    public int solution(String numbers) {
        arr = numbers.toCharArray();
        visited = new boolean[arr.length];

        recursion("", 0);

        return set.size();
    }

    private void recursion(String s, int idx) {
        if (!"".equals(s)) {
            int num = Integer.parseInt(s);
            if (isPrime(num)) {
                set.add(num);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            recursion(s + arr[i], idx + 1);
            visited[i] = false;
        }
    }

    private boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}