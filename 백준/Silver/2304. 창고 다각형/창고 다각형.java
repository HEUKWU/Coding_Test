import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Bar> bars = new ArrayList<>();

        int highestBar = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int index = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());

            highestBar = Math.max(highestBar, height);

            bars.add(new Bar(index, height));
        }

        bars.sort(Comparator.comparingInt(a -> a.index));

        int highestBarIndex = 0;
        for (int i = 0; i < n; i++) {
            if (bars.get(i).height == highestBar) {
                highestBarIndex = i;
            }
        }

        int area = 0;
        for (int i = 0; i < highestBarIndex; i++) {
            for (int j = i + 1; j <= highestBarIndex; j++) {
                Bar leftBar = bars.get(i);
                Bar rightBar = bars.get(j);

                if (leftBar.height <= rightBar.height) {
                    area += (rightBar.index - leftBar.index) * leftBar.height;
                    i = j;
                }
            }
        }

        for (int i = n - 1; i > highestBarIndex; i--) {
            for (int j = i - 1; j >= highestBarIndex; j--) {
                Bar rightBar = bars.get(i);
                Bar leftBar = bars.get(j);

                if (rightBar.height <= leftBar.height) {
                    area += (rightBar.index - leftBar.index) * rightBar.height;
                    i = j;
                }
            }
        }

        System.out.println(area + highestBar);
    }

    static class Bar {
        private final int index;
        private final int height;

        public Bar(int index, int height) {
            this.index = index;
            this.height = height;
        }
    }
}
