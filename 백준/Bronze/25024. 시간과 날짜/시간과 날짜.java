import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            String an = "No";
            String bn = "No";

            if (0 <= a && a <= 23 && 0 <= b && b <= 59) {
                an = "Yes";
            }

            if (a == 1 || a == 3 || a == 5 || a == 7 || a == 8 || a == 10 || a == 12) {
                if (1 <= b && b <= 31) {
                    bn = "Yes";
                }
            } else if (a == 2) {
                if (1 <= b && b <= 29) {
                    bn = "Yes";
                }
            } else if (a == 4 || a == 6 || a == 9 || a == 11){
                if (1 <= b && b <= 30) {
                    bn = "Yes";
                }
            }

            System.out.println(an + " " + bn);
        }
    }
}
