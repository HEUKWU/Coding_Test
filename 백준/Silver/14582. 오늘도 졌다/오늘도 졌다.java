import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[9];
        for (int i = 0; i < 9; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int[] b = new int[9];
        for (int i = 0; i < 9; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        int aSum = 0;
        int bSum = 0;
        boolean c = false;

        for (int i = 0; i < 9; i++) {
            aSum += a[i];
            if (aSum > bSum) {
                c = true;
            }
            bSum += b[i];
        }

        if (c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
