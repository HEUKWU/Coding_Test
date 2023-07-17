import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;
        while (!(s = br.readLine()).equals("*")) {
            boolean[] alphabets = new boolean[26];
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != ' ') {
                    alphabets[s.charAt(i) - 'a'] = true;
                }
            }
            String answer = "Y";

            for (boolean a : alphabets) {
                if (!a) {
                    answer = "N";
                    break;
                }
            }

            System.out.println(answer);
        }
    }
}