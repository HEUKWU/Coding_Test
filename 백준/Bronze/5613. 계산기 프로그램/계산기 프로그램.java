import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = Integer.parseInt(br.readLine());

        while (true) {
            String s = br.readLine();
            if (s.equals("=")) {
                break;
            }
            int n = Integer.parseInt(br.readLine());
            if (s.equals("+")) {
                result += n;
            } else if (s.equals("-")) {
                result -= n;
            } else if (s.equals("*")) {
                result *= n;
            } else {
                result /= n;
            }
        }
        System.out.println(result);
    }
}