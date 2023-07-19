import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> list = new ArrayList<>();

        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        List<Integer> clone = new ArrayList<>(list);
        Collections.sort(clone);

        String answer = "Good";

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != clone.get(i)) {
                answer = "Bad";
                break;
            }
        }

        System.out.println(answer);
    }
}