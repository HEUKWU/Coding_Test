import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int[][] map;
    private static int a = 0;
    private static int b = 0;
    private static int c = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        map = new int[n][n];
        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        recursion(0, 0, n);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    private static void recursion(int x, int y, int size) {
        if (color(x, y, size)) {
            int color = map[x][y];
            switch (color) {
                case -1:
                    a++;
                    break;
                case 0:
                    b++;
                    break;
                case 1:
                    c++;
                    break;
            }

            return;
        }

        int newSize = size / 3;

        recursion(x, y, newSize);
        recursion(x, y + newSize, newSize);
        recursion(x, y + 2 * newSize, newSize);

        recursion(x + newSize, y, newSize);
        recursion(x + newSize, y + newSize, newSize);
        recursion(x + newSize, y + 2 * newSize, newSize);

        recursion(x + 2 * newSize, y, newSize);
        recursion(x + 2 * newSize, y + newSize, newSize);
        recursion(x + 2 * newSize, y + 2 * newSize, newSize);
    }

    private static boolean color(int x, int y, int size) {
        int color = map[x][y];

        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (color != map[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
