package programmers.Lv_0;

public class p23 {
    public static void main(String[] args) {
        System.out.println(solution(3, 10, 2));
    }

    public static int solution(int i, int j, int k) {
        int a = 0;
        int b = 0;
        int count = 0;
        for (int l = i; l <= j; l++) {
            a = l;
            while (a > 0) {
                b = a % 10;
                a /= 10;
                if (b == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
