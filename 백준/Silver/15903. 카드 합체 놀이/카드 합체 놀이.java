import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String s = br.readLine();
        st = new StringTokenizer(s);
        long[] cards = new long[n];
        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < m; i++) {
            Arrays.sort(cards);

            long newValue = cards[0] + cards[1];
            cards[0] = newValue;
            cards[1] = newValue;
        }

        long sum = 0;
        for (long card : cards) {
            sum += card;
        }

        System.out.println(sum);
    }
}

