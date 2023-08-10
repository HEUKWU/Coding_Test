import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);

        int x = Integer.parseInt(br.readLine());
        int count = 0;
        int start = 0;
        int end = n - 1;
        int sum = 0;

        while (start < end) {
            sum = a[start] + a[end];
            if (sum == x) {
                count++;
            }

            if (sum <= x) {
                start++;
            } else {
                end--;
            }
        }

        System.out.println(count);
    }
}
