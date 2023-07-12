import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int second = 0;
        int k = 1;

        while (n != 0) {
            n -= k;
            second++;
            k++;
            if (n < k) {
                k = 1;
            }
        }

        System.out.println(second);
    }
}
