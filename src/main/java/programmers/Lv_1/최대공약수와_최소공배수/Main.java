package programmers.Lv_1.최대공약수와_최소공배수;

public class Main {
    public static void main(String[] args) {

    }
    public static int[] solution(int n, int m) {
        int max = 0;

        for (int i = 1; i <= n && i <= m; i++) {
            if (n % i == 0 && m % i == 0) {
                max = i;
            }
        }

        int min = (n * m) / max; //최소 공배수

        System.out.println("최대 공약수 : " + max);
        System.out.println("최소 공배수 : " + min);
        return new int[]{max, min};
    }
}
