import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<String> in = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            in.add(br.readLine());
        }
        Queue<String> out = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            out.add(br.readLine());
        }

        int count = 0;
        while(!out.isEmpty()) {
            String outCar = out.poll();
            if (!in.peek().equals(outCar)) {
                count++;
                in.remove(outCar);
            } else {
                in.poll();
            }
        }

        System.out.println(count);
    }
}