import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            boolean[] room = new boolean[n + 1];
            for (int j = 1; j <= n; j++) {
                for (int k = j; k <= n; k += j) {
                    room[k] = !room[k];
                }
            }

            int count = 0;

            for (int j = 1; j < room.length; j++) {
                if (room[j]) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}