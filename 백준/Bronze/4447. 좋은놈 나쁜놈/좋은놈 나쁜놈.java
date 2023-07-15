import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int g = 0;
            int b = 0;
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'G' || s.charAt(j) == 'g') {
                    g++;
                } else if (s.charAt(j) == 'B' || s.charAt(j) == 'b') {
                    b++;
                }
            }

            StringBuilder sb = new StringBuilder();
            sb.append(s).append(" ");
            if (g > b) {
                sb.append("is").append(" GOOD");
            } else if (g < b) {
                sb.append("is").append(" A BADDY");
            } else {
                sb.append("is").append(" NEUTRAL");
            }

            System.out.println(sb);
        }
    }
}
