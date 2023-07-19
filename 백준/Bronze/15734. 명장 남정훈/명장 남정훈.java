import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());

        while (a > 0) {
            if (l < r) {
                l++;
                a--;
            } else if (l > r) {
                r++;
                a--;
            } else {
                r++;
                a--;
            }
        }

        System.out.println(Math.min(l, r) * 2);
    }
}