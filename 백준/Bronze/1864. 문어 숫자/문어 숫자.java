import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] c = {'-', '\\', '(', '@', '?', '>', '&', '%'};

        while (true) {
            String s = br.readLine();
            if (s.equals("#")) {
                break;
            }

            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < c.length; j++) {
                    double pow = Math.pow(8, s.length() - 1 - i);
                    if (s.charAt(i) == c[j]) {
                        sum += j * pow;
                        break;
                    } else if (s.charAt(i) == '/') {
                        sum -= pow;
                        break;
                    }
                }
            }

            System.out.println(sum);
        }
    }
}
