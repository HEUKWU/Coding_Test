import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> unheard = new HashSet<>();
        for (int i = 0; i < n; i++) {
            unheard.add(br.readLine());
        }

        List<String> unheardUnseen = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String person = br.readLine();
            if (unheard.contains(person)) {
                unheardUnseen.add(person);
            }
        }

        Collections.sort(unheardUnseen);

        StringBuilder sb = new StringBuilder();
        sb.append(unheardUnseen.size()).append('\n');
        for (String s : unheardUnseen) {
            sb.append(s).append('\n');
        }

        System.out.println(sb);
    }
}