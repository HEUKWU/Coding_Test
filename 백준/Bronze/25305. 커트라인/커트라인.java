import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] i = new int[a];
        StringTokenizer s = new StringTokenizer(br.readLine());

        for (int j = 0; j < a; j++) {
            i[j] = Integer.parseInt(s.nextToken());
        }

        Arrays.sort(i);

        System.out.println(i[a - b]);
    }
}
