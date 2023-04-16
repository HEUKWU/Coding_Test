package programmers.Lv_0.문제;

public class p15 {
    public static void main(String[] args) {
        System.out.println(solution(123456, 7));
    }

    public static int solution(int num, int k) {
        int length = (int) (Math.log10(num) + 1);
        int[] a = new int[length];
        for (int i = 0; i < length; i++) {
            a[length - 1 - i] = num % 10;
            num /= 10;
        }
        int answer = 0;
        for (int i = 0; i < length; i++) {
            if (k == a[i]) {
                answer = i + 1;
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
    }
}
