import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] a = new int[9];

        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '9') {
                a[6]++;
            } else {
                a[s.charAt(i) - '0']++;
            }
        }

        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (i == 6) {
                if (a[6] % 2 == 0) {
                    a[6] /= 2;
                } else {
                    a[6] = a[6] / 2 + 1;
                }
            }
            max = Math.max(max, a[i]);
        }

        System.out.println(max);
    }
}
