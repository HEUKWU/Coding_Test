import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String[] split = String.valueOf((long) a * b * c).split("");

        int[] num = new int[10];
        for (int i = 0; i < 10; i++) {
            for (String s : split) {
                if (Integer.parseInt(s) == i) {
                    num[i]++;
                }
            }
        }

        for (int i : num) {
            System.out.println(i);
        }
    }
}