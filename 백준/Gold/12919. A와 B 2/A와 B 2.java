import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static String s;
    private static int sLength;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        s = br.readLine();
        sLength = s.length();

        String t = br.readLine();

        System.out.println(recursion(t) ? 1 : 0);
    }

    private static boolean recursion(String tmp) {
        if (tmp.length() == sLength) {
            return s.equals(tmp);
        }

        if (tmp.charAt(tmp.length() - 1) == 'A') {
            if (recursion(tmp.substring(0, tmp.length() - 1))) {
                return true;
            }
        } if (tmp.charAt(0) == 'B') {
            StringBuilder sb = new StringBuilder();
            sb.append(tmp.substring(1)).reverse();

            return recursion(sb.toString());
        }

        return false;
    }
}
