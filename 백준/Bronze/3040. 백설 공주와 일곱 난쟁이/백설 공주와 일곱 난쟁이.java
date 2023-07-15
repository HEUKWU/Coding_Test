import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            int a = Integer.parseInt(br.readLine());
            sum += a;
            list.add(a);
        }

        int a = 0;
        int b = 0;

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == sum - 100) {
                    a = list.get(i);
                    b = list.get(j);
                }
            }
        }

        for (Integer i : list) {
            if (i != a && i != b) {
                System.out.println(i);
            }
        }
    }
}
