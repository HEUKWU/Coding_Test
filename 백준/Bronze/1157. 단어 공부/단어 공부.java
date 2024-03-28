import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toUpperCase();

        int[] al = new int[26];
        for (int i = 0; i < s.length(); i++) {
            al[s.charAt(i) - 65]++;
        }

        int max = 0;
        for (int i : al) {
            max = Math.max(max, i);
        }

        char answer = ' ';
        char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
                'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        int count = 0;

        for (int i = 0; i < al.length; i++) {
            if (al[i] == max) {
                count++;
                if (count == 2) {
                    answer = '?';
                    break;
                }
                answer = a[i];
            }
        }

        System.out.println(answer);
    }
}
