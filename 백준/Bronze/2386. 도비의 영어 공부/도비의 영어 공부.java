import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;
        while (!(s = br.readLine()).equals("#")) {
            StringTokenizer st = new StringTokenizer(s);
            String i = st.nextToken();
            int count = 0;
            while (st.hasMoreTokens()) {
                String a = st.nextToken();
                for (int j = 0; j < a.length(); j++) {
                    if (i.equalsIgnoreCase(String.valueOf(a.charAt(j)))) {
                        count++;
                    }
                }
            }

            StringBuilder sb = new StringBuilder();
            sb.append(i).append(" ").append(count);

            System.out.println(sb);
        }
    }
}
