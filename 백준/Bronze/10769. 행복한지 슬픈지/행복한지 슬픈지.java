import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine().replaceAll(":-\\)", "1").replaceAll(":-\\(", "0");

        int hCount = 0;
        int sCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                hCount++;
            } else if (s.charAt(i) == '0'){
                sCount++;
            }
        }

        if (hCount > sCount) {
            System.out.println("happy");
        } else if (hCount < sCount) {
            System.out.println("sad");
        } else if (hCount == 0){
            System.out.println("none");
        } else {
            System.out.println("unsure");
        }

    }
}
