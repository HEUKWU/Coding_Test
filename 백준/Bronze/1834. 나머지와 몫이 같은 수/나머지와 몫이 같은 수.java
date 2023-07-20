import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());

        long sum = 0;
        for (int i = 1; i <= n - 1; i++) {
            sum += i * (n + 1);
        }

        System.out.println(sum);
    }
}