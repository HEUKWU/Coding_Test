import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long[] roads = new long[n - 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n - 1; i++) {
            roads[i] = Long.parseLong(st.nextToken());
        }

        long[] cities = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            cities[i] = Long.parseLong(st.nextToken());
        }

        long sum = 0;
        long min = cities[0];
        for (int i = 0; i < n - 1; i++) {
            long road = roads[i];
            long cost = cities[i];

            min = Math.min(min, cost);

            sum += road * min;
        }

        System.out.println(sum);
    }
}
