import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] point = new int[8];

        for (int i = 0; i < 8; i++) {
            point[i] = Integer.parseInt(br.readLine());
        }

        int[] clone = point.clone();
        Arrays.sort(point);

        int sum = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            int a = clone[i];
            for (int j = 0; j < 5; j++) {
                if (a == point[7 - j]) {
                    sb.append(i + 1).append(" ");
                    sum += point[7 - j];
                    break;
                }
            }
        }

        System.out.println(sum);
        System.out.println(sb);
    }
}
