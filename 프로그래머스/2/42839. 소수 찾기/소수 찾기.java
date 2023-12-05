import java.util.ArrayList;

class Solution {

    private final ArrayList<Integer> list = new ArrayList<>();
    private final boolean[] check = new boolean[7];

    public int solution(String numbers) {
        int answer = 0;

        for (int i = 0; i < numbers.length(); i++) {
            dfs(numbers, "", i + 1);
        }

        for (Integer i : list) {
            if (isPrime(i)) {
                answer++;
            }
        }
        
        return answer;
    }

    private void dfs(String s, String tmp, int n) {
        if (tmp.length() == n) {
            int number = Integer.parseInt(tmp);
            if (!list.contains(number)) {
                list.add(number);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (!check[i]) {
                check[i] = true;
                tmp += s.charAt(i);
                dfs(s, tmp, n);
                check[i] = false;
                tmp = tmp.substring(0, tmp.length() - 1);
            }
        }
    }

    private boolean isPrime(int number) {
        if (number == 0 || number == 1) {
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