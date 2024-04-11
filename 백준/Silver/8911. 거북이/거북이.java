import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            String s = br.readLine();

            sb.append(move(s)).append('\n');
        }

        System.out.println(sb);
    }

    private static final int[] dx = {0, -1, 0, 1};
    private static final int[] dy = {1, 0, -1, 0};

    private static int move(String s) {
        int d = 0;
        int x = 0;
        int y = 0;
        int maxX = 0;
        int maxY = 0;
        int minX = 0;
        int minY = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            switch (c) {
                case 'F':
                    x += dx[d];
                    y += dy[d];

                    maxX = Math.max(maxX, x);
                    maxY = Math.max(maxY, y);
                    minX = Math.min(minX, x);
                    minY = Math.min(minY, y);
                    break;
                case 'B':
                    x -= dx[d];
                    y -= dy[d];

                    maxX = Math.max(maxX, x);
                    maxY = Math.max(maxY, y);
                    minX = Math.min(minX, x);
                    minY = Math.min(minY, y);
                    break;
                case 'L':
                    d++;
                    if (d == 4) {
                        d = 0;
                    }
                    break;
                case 'R':
                    d--;
                    if (d == -1) {
                        d = 3;
                    }
                    break;
            }
        }

        return (maxX - minX) * (maxY - minY);
    }
}
