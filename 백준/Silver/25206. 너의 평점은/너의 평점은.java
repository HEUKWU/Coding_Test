import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float sum = 0;
        float asum = 0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            float a = Float.parseFloat(st.nextToken());
            String rate = st.nextToken();
            if (!rate.equals("P")) {
                float b = score(rate);
                asum += a;
                sum += a * b;
            }
        }

        System.out.println(sum / asum);
    }

    static float score(String rate) {
        switch (rate) {
            case "F":
                return 0.0f;
            case "A+":
                return 4.5f;
            case "A0":
                return 4.0f;
            case "B+":
                return 3.5f;
            case "B0":
                return 3.0f;
            case "C+":
                return 2.5f;
            case "C0":
                return 2.0f;
            case "D+":
                return 1.5f;
            default:
                return 1.0f;
        }
    }
}