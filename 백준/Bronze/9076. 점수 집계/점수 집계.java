import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] score = new int[5];
            for (int j = 0; j < 5; j++) {
                score[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(score);

            if (score[3] - score[1] >= 4) {
                sb.append("KIN").append('\n');
            } else {
                sb.append(score[1] + score[2] + score[3]).append('\n');
            }
        }

        System.out.println(sb);
    }
}