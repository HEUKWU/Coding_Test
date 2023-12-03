import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] a = new int[s.length()];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.charAt(i) - '0';
        }

        int zero = 0;
        int one = 0;

        if (a[0] == 0) {
            one++;
        } else {
            zero++;
        }

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                if (a[i + 1] == 0) {
                    one++;
                } else {
                    zero++;
                }
            }
        }

        System.out.println(Math.min(zero, one));
    }
}