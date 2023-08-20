import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            List<Character> list = new ArrayList<>();
            char prev = ' ';

            for (char c : s.toCharArray()) {
                if (c != prev && list.contains(c)) {
                    break;
                } else {
                    list.add(c);
                    prev = c;
                }
            }

            if (list.size() == s.length()) {
                count++;
            }

        }
        System.out.println(count);
    }
}