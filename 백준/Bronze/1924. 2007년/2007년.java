import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] b = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int sum = day;
        for (int i = 0; i < month - 1; i++) {
            sum += a[i];
        }

        System.out.println(b[sum % 7]);
    }
}