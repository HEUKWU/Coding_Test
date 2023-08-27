import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());

        int[] cards = new int[20000001];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            cards[Integer.parseInt(st.nextToken()) + 10000000]++;
        }

        int a = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a; i++) {
            sb.append(cards[Integer.parseInt(st.nextToken()) + 10000000]).append(" ");
        }

        System.out.println(sb);
    }
}
