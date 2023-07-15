import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] a = {'A', 'B', 'C'};
        char[] b = {'B', 'A', 'B', 'C'};
        char[] c = {'C', 'C', 'A', 'A', 'B', 'B'};

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int aC = 0;
        int bC = 0;
        int cC = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == a[i % a.length]) {
                aC++;
            }
            if (s.charAt(i) == b[i % b.length]) {
                bC++;
            }
            if (s.charAt(i) == c[i % c.length]) {
                cC++;
            }
        }

        int max = Math.max(aC, bC);
        max = Math.max(max, cC);

        String[][] name = {
                {String.valueOf(aC), "Adrian"},
                {String.valueOf(bC), "Bruno"},
                {String.valueOf(cC), "Goran"}
        };

        System.out.println(max);
        for (int i = 0; i < 3; i++) {
            if (Integer.parseInt(name[i][0]) == max) {
                System.out.println(name[i][1]);
            }
        }
    }
}
