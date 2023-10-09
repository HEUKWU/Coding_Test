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

        int c = gdc(a, b);

        System.out.println(c);
        System.out.println(a * b / c);
    }

    //최대 공약수
    static private int gdc(int a, int b) {
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return a;
    }

    //최소 공배수
    static int lcm(int a, int b) {
        return a * b / gdc(a, b);
    }
}

