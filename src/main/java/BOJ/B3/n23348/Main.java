package BOJ.B3.n23348;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int[] num = new int[3];
        for (int i = 0; i < 3; i++) {
            num[i] = Integer.parseInt(s[i]);
        }

        int n = Integer.parseInt(br.readLine());
        int max = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                String[] x = br.readLine().split(" ");
                for (int k = 0; k < 3; k++) {
                    sum += Integer.parseInt(x[k]) * num[k];
                }
            }
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}
