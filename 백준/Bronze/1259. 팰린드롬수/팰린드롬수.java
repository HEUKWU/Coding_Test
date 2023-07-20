import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;
        while (!(s = br.readLine()).equals("0")) {
            String answer = "yes";
            for (int i = 0; i <= s.length() / 2 - 1; i++) {
                if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                    answer = "no";
                    break;
                }
            }
            
            System.out.println(answer);
        }
    }
}