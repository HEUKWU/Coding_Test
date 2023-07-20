import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] road = new int[n];
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            road[i] = a;
        }


        int answer = 0;
        int a = 0;

        for (int i = 1; i < n; i++) {
            if (road[i - 1] < road[i]) {
                a += (road[i] - road[i - 1]);
            } else {
                a = 0;
            }
            answer = Math.max(a, answer);
        }

        System.out.println(answer);
    }
}