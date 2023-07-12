import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            num[i] = a;
        }

        if (Math.abs(num[0] - num[1]) == Math.abs(num[1] - num[2])) {
            System.out.println(num[n - 1] - (num[1] - num[2]));
        } else {
            System.out.println(num[n - 1] * (num[1] / num[0]));
        }
    }
}
