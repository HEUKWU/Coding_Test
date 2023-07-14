import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] a = "CAMBRIDGE".split("");

        for (int i = 0; i < a.length; i++) {
            s = s.replace(a[i], "");
        }

        System.out.println(s);
    }
}
