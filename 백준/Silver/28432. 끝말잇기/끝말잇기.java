import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<String> words = new ArrayList<>();
        int unknownIndex = 0;
        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (word.equals("?")) {
                unknownIndex = i;
            }
            words.add(word);
        }

        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            String candidate = br.readLine();

            // ?만 주어졌을 때
            if (n == 1) {
                System.out.println(candidate);
                break;
            }

            // 후보 단어가 기존 단어들과 중복될 때
            if (words.contains(candidate)) {
                continue;
            }

            // ?가 처음 주어졌을 때
            if (unknownIndex == 0) {
                String next = words.get(unknownIndex + 1);
                // ?의 마지막 문자 = 그 다음 단어의 첫번째 문자
                char lastChar = next.charAt(0);

                // 마지막 문자가 ?의 마지막 문자와 같을 때
                if (candidate.charAt(candidate.length() - 1) == lastChar) {
                    System.out.println(candidate);
                    break;
                }
            } // ?가 마지막에 주어졌을 때
            else if (unknownIndex == n - 1) {
                String prev = words.get(unknownIndex - 1);
                // ?의 첫번째 문자 = 그 전 단어의 마지막 문자
                char firstChar = prev.charAt(prev.length() - 1);

                // 첫번째 문자가 ?의 첫번째 문자와 같을 때
                if (candidate.charAt(0) == firstChar) {
                    System.out.println(candidate);
                    break;
                }
            } else {
                String prev = words.get(unknownIndex - 1);
                String next = words.get(unknownIndex + 1);
                char firstChar = prev.charAt(prev.length() - 1);
                char lastChar = next.charAt(0);

                if (candidate.charAt(0) == firstChar && candidate.charAt(candidate.length() - 1) == lastChar) {
                    System.out.println(candidate);
                    break;
                }
            }
        }
    }
}