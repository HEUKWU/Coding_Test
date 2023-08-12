import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int result = 0;

        for (int i = n, j = 0; i >= 1; i--) {
            if (n % i == 0) {
                if (++j == k) {
                    result = n / i;
                }
            }
        }

        System.out.println(result);
    }
}
