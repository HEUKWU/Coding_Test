import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long sum = 0;
        int count = 0;

        for (int i = 1; true; i++) {
            if (sum > n) {
                break;
            }
            sum += i;
            count++;
        }

        System.out.println(count - 1);
    }
}
