import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        int count = 0;
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int ac = Integer.parseInt(st.nextToken());
            if (t < sum + ac) {
                System.out.println(count);
                return;
            }
            sum += ac;
            count++;
        }
        System.out.println(count);
    }
}