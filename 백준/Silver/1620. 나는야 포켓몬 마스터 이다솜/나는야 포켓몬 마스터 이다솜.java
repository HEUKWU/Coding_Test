import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] num = new String[n + 1];
        Map<String, Integer> name = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String s = br.readLine();
            num[i] = s;
            name.put(s, i);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if ('0' <= s.charAt(0) && s.charAt(0) <= '9') {
                sb.append(num[Integer.parseInt(s)]);
            } else {
                sb.append(name.get(s));
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
