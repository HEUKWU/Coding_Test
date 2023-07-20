import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int[] num = new int[9];

        for (int i = 0; i < 9; i++) {
            int a = Integer.parseInt(br.readLine());

            sum += a;
            num[i] = a;
        }

        ArrayList<Integer> list = new ArrayList<>();

        int a = 0;
        int b = 0;

        for (Integer i : num) {
            for (Integer j : num) {
                if (i + j == sum - 100) {
                    a = i;
                    b = j;
                }
            }
        }

        for (int i : num) {
            if (i != a && i != b) {
                list.add(i);
            }
        }

        Collections.sort(list);

        for (Integer i : list) {
            System.out.println(i);
        }
    }
}