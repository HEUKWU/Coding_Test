package BOJ.B3.n10810;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] n = new int[a];

        for (int i = 0; i < b; i++) {
            StringTokenizer s = new StringTokenizer(br.readLine());

            int fs = Integer.parseInt(s.nextToken());
            int sc = Integer.parseInt(s.nextToken());
            int td = Integer.parseInt(s.nextToken());

            for (int j = fs - 1; j < sc; j++) {
                n[j] = td;
            }
        }

        for (int i : n) {
            System.out.print(i + " ");
        }

    }
}
