import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        
        int zero = 0;
        int one = 0;

        if (number.charAt(0) == '1') {
            zero++;
        } else {
            one++;
        }

        for (int i = 1; i < number.length(); i++) {
            char prev = number.charAt(i - 1);
            char now = number.charAt(i);

            if (prev != now) {
                if (now == '1') {
                    zero++;
                } else {
                    one++;
                } 
            }
        }

        System.out.println(Math.min(zero, one));
    }
}