import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String k = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            if ('0' <= s.charAt(i) && s.charAt(i) <= '9') {
                s = s.replace(s.charAt(i), '0');
            }
        }

        s = s.replaceAll("0", "");
        
        if (s.contains(k)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}