import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        boolean[] broken = new boolean[10];
        for (int i = 0; i < m; i++) {
            broken[sc.nextInt()] = true;
        }

        if (n == 100) {
            System.out.println(0);
            return;
        }

        int count = Math.abs(n - 100);

        for (int i = 0; i <= 999999; i++) {
            String s = String.valueOf(i);

            boolean isBroken = false;
            for (int j = 0; j < s.length(); j++) {
                if (broken[s.charAt(j) - '0']) {
                    isBroken = true;
                    break;
                }
            }

            if (isBroken) {
                continue;
            }

            count = Math.min(count, Math.abs(n - i) + s.length());
        }

        System.out.println(count);
    }
}
