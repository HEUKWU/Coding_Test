import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();

        int[] alphabet = new int[26];
        for (int i = 0; i < name.length(); i++) {
            alphabet[name.charAt(i) - 'A']++;
        }

        int odd = 0;
        char mid = ' ';
        StringBuilder front = new StringBuilder();
        StringBuilder end = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (alphabet[i] % 2 == 1) {
                if (odd != 0) {
                    System.out.println("I'm Sorry Hansoo");
                    return;
                }
                odd++;
                mid = (char) (i + 'A');
            }
            for (int j = 0; j < alphabet[i] / 2; j++) {
                front.append((char) (i + 'A'));
                end.insert(0, (char) (i + 'A'));
            }
        }

        if (mid == ' ') {
            front.append(end);
        } else {
            front.append(mid).append(end);
        }

        System.out.println(front);
    }
}