import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[1000];

        int a = 0;
        int b = 1;
        while (a < 1000) {
            for (int j = 0; j < b; j++) {
                arr[a++] = b;
                if (a > 999) {
                    break;
                }
            }
            b++;
        }
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int sum = 0;
        for (int i = A - 1; i < B; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
