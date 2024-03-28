import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine(),".");
        int n = Integer.parseInt(str.nextToken());

        Map<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            str = new StringTokenizer(br.readLine(),".");
            str.nextToken();
            String file = str.nextToken();
            map.put(file, map.getOrDefault(file, 0) + 1);
        }

        StringBuilder file = new StringBuilder();
        for (String s : map.keySet()) {
            file.append(s + " " + map.get(s) + "\n");
        }
        System.out.println(file);
    }
}