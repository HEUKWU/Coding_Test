import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            Map<String, Integer> map = new HashMap<>();

            int n = Integer.parseInt(br.readLine());
            for (int j = 0; j < n; j++) {
                String[] split = br.readLine().split(" ");
                map.put(split[1], map.getOrDefault(split[1], 0) + 1);
            }

            int count = 1;
            for (Integer value : map.values()) {
                count *= value + 1;
            }

            sb.append(count - 1).append('\n');
        }

        System.out.println(sb);
    }
}
