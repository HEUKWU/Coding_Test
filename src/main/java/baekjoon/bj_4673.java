package baekjoon;

public class bj_4673 {
    public static void main(String[] args) {
        boolean[] check = new boolean[10001];
        for (int i = 1; i < 10001; i++) {
            if (d(i) < 10001) {
                check[d(i)] = true;
            }
        }
        for (int i = 1; i < 10001; i++) {
            if (!check[i]) {
                System.out.println(i);
            }
        }
    }
    static int d(int n) {
        int sum = 0;
        sum += n;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
