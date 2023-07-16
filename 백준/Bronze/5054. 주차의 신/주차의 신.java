import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            System.out.println(cal(n, st));
        }
    }

    private static int cal(int n, StringTokenizer st) {
        int[] park = new int[n];

        for (int i = 0; i < n; i++) {
            park[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(park);

        return (park[park.length - 1] - park[0]) * 2;
    }
}