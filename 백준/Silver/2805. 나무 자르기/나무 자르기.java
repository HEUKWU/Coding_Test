import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int start = 0;
        int end = 0;
        int[] trees = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int tree = Integer.parseInt(st.nextToken());
            trees[i] = tree;

            end = Math.max(end, tree);
        }

        int answer = 0;
        while (start <= end) {
            int mid = (start + end) / 2;

            long sum = 0;
            for (int tree : trees) {
                if (tree > mid) {
                    sum += (tree - mid);
                }
            }

            if (sum < m) {
                end = mid - 1;
            } else {
                start = mid + 1;
                answer = mid;
            }
        }

        System.out.println(answer);
    }
}
