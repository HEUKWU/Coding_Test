import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int answer = Integer.parseInt(st.nextToken()) * i - sum;
            sum += answer;

            sb.append(answer).append(" ");
        }

        System.out.println(sb);
    }
}