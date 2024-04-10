import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        boolean[] broken = new boolean[10];
        if (m != 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                broken[Integer.parseInt(st.nextToken())] = true;
            }
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
