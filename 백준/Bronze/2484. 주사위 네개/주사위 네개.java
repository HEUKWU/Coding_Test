import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int score = 0;

        for (int i = 0; i < n; i++) {
            score = Math.max(score, score(br.readLine()));
        }

        System.out.println(score);
    }

    private static int score(String s) {
        StringTokenizer st = new StringTokenizer(s);
        int[] dice = new int[7];

        for (int i = 0; i < 4; i++) {
            dice[Integer.parseInt(st.nextToken())]++;
        }

        int price = 0;

        for (int i = 0; i < 7; i++) {
            if (dice[i] == 4) {
                price = 50000 + i * 5000;
                break;
            } else if (dice[i] == 3) {
                price = 10000 + i * 1000;
                break;
            } else if (dice[i] == 2) {
                price = 1000 + i * 100;
                for (int j = i + 1; j < 7; j++) {
                    if (dice[j] == 2) {
                        price = 2000 + i * 500 + j * 500;
                        break;
                    }
                }
                break;
            } else if (dice[i] == 1){
                price = i * 100;
            }
        }

        return price;
    }
}
