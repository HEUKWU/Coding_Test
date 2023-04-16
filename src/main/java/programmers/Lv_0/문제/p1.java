package programmers.Lv_0.문제;

public class p1 {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(100));
    }
}
//순서쌍의 개수
class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                answer++;
            }
        }
        return answer + 1;
    }
}