import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] coordinates = new int[n];
        Set<Integer> set = new TreeSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int coordinate = Integer.parseInt(st.nextToken());
            coordinates[i] = coordinate;
            set.add(coordinate);
        }

        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (Integer i : set) {
            map.put(i, index++);
        }

        for (int i = 0; i < coordinates.length; i++) {
            coordinates[i] = map.get(coordinates[i]);
        }

        StringBuilder sb = new StringBuilder();
        for (int coordinate : coordinates) {
            sb.append(coordinate).append(' ');
        }

        System.out.println(sb);
    }
}
