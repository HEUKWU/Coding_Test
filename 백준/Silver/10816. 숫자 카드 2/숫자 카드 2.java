import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] a = new int[20_000_001];
        for (int i = 0; i < n; i++) {
            a[Integer.parseInt(st.nextToken()) + 10_000_000]++;
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            sb.append(a[Integer.parseInt(st.nextToken()) + 10_000_000]).append(" ");
        }

        System.out.println(sb);
    }
}