import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        int[] sensors = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            sensors[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sensors);

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            list.add(sensors[i] - sensors[i - 1]);
        }

        Collections.sort(list);

        int sum = 0;
        for (int i = 0; i < n - k; i++) {
            sum += list.get(i);
        }

        System.out.println(sum);
    }
}
