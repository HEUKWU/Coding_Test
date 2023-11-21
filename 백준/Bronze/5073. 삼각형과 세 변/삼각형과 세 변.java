import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String s;

        while (!(s = br.readLine()).equals("0 0 0")) {

            st = new StringTokenizer(s);

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == b && b == c) {
                System.out.println("Equilateral");
                continue;
            }

            int[] n = {a, b, c};
            Arrays.sort(n);

            if (n[2] >= n[0] + n[1]) {
                System.out.println("Invalid");
                continue;
            }

            if (a == b || b == c || c == a) {
                System.out.println("Isosceles");
                continue;
            }

            System.out.println("Scalene");

        }
    }
}