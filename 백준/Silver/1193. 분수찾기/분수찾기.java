import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int count = 0;
        int i = 1;

        while (count < x) {
            count += i;
            i++;
        }

        int b = 0;
        int a = 0;

        if ((i - 1) % 2 == 0) {
            b = 1 + (count - x);
            a = (i - 1) - (count - x);
        } else {
            b = (i - 1) - (count - x);
            a = 1 + (count - x);
        }

        System.out.println(a + "/" + b);
    }
}