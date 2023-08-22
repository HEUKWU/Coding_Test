import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] num = new int[2000001];
        for (int i = 0; i < n; i++) {
            num[Integer.parseInt(br.readLine()) + 1000000]++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num.length; i++) {
            if (num[i] == 1) {
                sb.append(i - 1000000).append("\n");
            }
        }

        System.out.println(sb);
    }
}
