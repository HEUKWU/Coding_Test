package programmers.Lv_0;

import java.util.Arrays;

public class p25 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(1, 2, 3, 4)));
    }
    public static int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];

        int n = num1 * num2; //분모
        int de = denum1 * num2 + denum2 * num1; //분자
        int max = 1;

        for (int i = 1; i <= n && i <= de; i++) {     //최대 공약수
            if (n % i == 0 && de % i == 0) {
                max = i;
            }
        }
        answer[0] = de / max; //분자
        answer[1] = n / max; //분모

        return answer;
    }
}
