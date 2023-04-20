package BOJ.B3.n11586;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String[][] arr = new String[a][a];
        for (int i = 0; i < a; i++) {
            String s = br.readLine();
            for (int j = 0; j < a; j++) {
                arr[i][j] = String.valueOf(s.charAt(j));
            }
        }
        int n = Integer.parseInt(br.readLine());
        if (n == 1) {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        } else if (n == 2) {
            for (int i = 0; i < a; i++) {
                for (int j = a - 1; j >= 0; j--) {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        } else {
            for (int i = a - 1; i >= 0; i--) {
                for (int j = 0; j < a; j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
    }
}
