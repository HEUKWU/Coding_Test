import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int n;
    private static int[] numbers;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numbers);

        System.out.println(mean());
        System.out.println(mid());
        System.out.println(mode());
        System.out.println(range());
    }

    private static int mean() {
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return (int) Math.round(sum / n);
    }

    private static int mid() {
        return numbers[n / 2];
    }

    private static int mode() {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int number : numbers) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        int max = 0;
        for (Integer number : map.keySet()) {
            max = Math.max(max, map.get(number));
        }

        List<Integer> means = new ArrayList<>();
        for (Integer numbers : map.keySet()) {
            if (map.get(numbers) == max) {
                means.add(numbers);
            }
        }

        if (means.size() >= 2) {
            return means.get(1);
        }

        return means.get(0);
    }

    private static int range() {
        return numbers[n - 1] - numbers[0];
    }
}
