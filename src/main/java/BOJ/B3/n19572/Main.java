package BOJ.B3.n19572;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);
        int z = Integer.parseInt(s[2]);

        double a = (x - z + y) / 2d;
        double b = (z - y + x) / 2d;
        double c = (y - x + z) / 2d;

        StringBuilder sb = new StringBuilder();
        if (a <= 0 || b <= 0 || c <= 0) {
            sb.append(-1);
        } else {
            sb.append(1).append("\n")
                    .append(a).append(" ")
                    .append(b).append(" ")
                    .append(c);
        }
        System.out.println(sb);
    }
}
