import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int[] alphabets = new int[26];

        while ((s = br.readLine()) != null) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != ' ') {
                    alphabets[s.charAt(i) - 97]++;
                }
            }
        }

        int max = 0;
        for (int alphabet : alphabets) {
            max = Math.max(max, alphabet);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < alphabets.length; i++) {
            if (alphabets[i] == max) {
                sb.append((char) (i + 97));
            }
        }

        System.out.println(sb.toString());
    }
}
