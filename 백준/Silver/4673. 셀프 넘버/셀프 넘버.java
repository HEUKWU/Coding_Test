public class Main {
    public static void main(String[] args) {
        boolean[] a = new boolean[10001];
        for (int i = 1; i < 10001; i++) {
            int n = sum(i);
            if (n < 10001) {
                a[n] = true;
            }
        }
        for (int i = 1; i < 10001; i++) {
            if (!a[i]) {
                System.out.println(i);
            }
        }
    }

    public static int sum(int a) {
        int sum = a;
        while (a != 0) {
            sum += a % 10;
            a = a / 10;
        }
        return sum;
    }
}