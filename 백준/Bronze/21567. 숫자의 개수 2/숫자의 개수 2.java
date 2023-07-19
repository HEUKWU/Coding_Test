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
        for (String s : split) {
            num[Integer.parseInt(s)]++;
        }

        for (int i : num) {
            System.out.println(i);
        }
    }
}