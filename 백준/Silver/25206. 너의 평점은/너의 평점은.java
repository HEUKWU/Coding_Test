import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        float sSum = 0;
        float sum = 0;

        for (int i = 0; i < 20; i++) {
            String[] split = br.readLine().split(" ");
            float score = Float.parseFloat(split[1]);
            String rate = split[2];

            if (!rate.equals("P")) {
                float converted = convert(rate);
                sSum += score;
                sum += score * converted;
            }
        }

        System.out.println(sum / sSum);
    }

    private static float convert(String rate) {
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