import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        String[] split = br.readLine().split(" ");

        while (true) {
            boolean a = true;
            for (int i = 0; i < split.length; i++) {
                if (Integer.parseInt(split[i]) <= l && !split[i].equals("0")) {
                    split[i] = "0";
                    l++;
                    a = false;
                }
            }
            if (a) {
                break;
            }
        }

        System.out.println(l);
    }
}
