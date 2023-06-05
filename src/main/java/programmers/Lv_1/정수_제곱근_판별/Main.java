package programmers.Lv_1.정수_제곱근_판별;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(121));
        System.out.println(s.solution(3));
    }
}

class Solution {
    public long solution(long n) {
        return Math.pow((long) Math.sqrt(n), 2) == n ? (long) Math.pow((Math.sqrt(n) + 1), 2) : -1;
    }
}