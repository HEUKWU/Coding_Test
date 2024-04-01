import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private static int n;
    private static int m;
    private static int r;
    private static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split(" ");
            arr[i] = Arrays.stream(split).map(Integer::parseInt).mapToInt(Integer::intValue).toArray();
        }

        String[] operations = br.readLine().split(" ");
        for (String operation: operations) {
            switch (Integer.parseInt(operation)) {
                case 1:
                    one();
                    break;
                case 2:
                    two();
                    break;
                case 3:
                    three();
                    break;
                case 4:
                    four();
                    break;
                case 5:
                    five();
                    break;
                default:
                    six();
                    break;
            }
        }


        StringBuilder sb = new StringBuilder();
        for (int[] i : arr) {
            for (int a : i) {
                sb.append(a).append(' ');
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }

    private static void one() {
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < m; j++) {
                int tmp = arr[i][j];
                arr[i][j] = arr[n - i - 1][j];
                arr[n - i - 1][j] = tmp;
            }
        }
    }
    private static void two() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m / 2; j++) {
                int tmp = arr[i][j];
                arr[i][j] = arr[i][m - j - 1];
                arr[i][m - j - 1] = tmp;
            }
        }
    }
    private static void three() {
        int[][] nArr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                nArr[i][j] = arr[n - 1 - j][i];
            }
        }

        int tmp = n;
        n = m;
        m = tmp;
        arr = nArr;
    }
    private static void four() {
        int[][] nArr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                nArr[i][j] = arr[j][m - 1 - i];
            }
        }

        int tmp = n;
        n = m;
        m = tmp;
        arr = nArr;
    }
    private static void five() {
        int[][] nArr = new int[n][m];

        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < m / 2; j++) {
                nArr[i][m / 2 + j] = arr[i][j];
            }
        }

        for (int i = 0; i < n / 2; i++) {
            for (int j = m / 2; j < m; j++) {
                nArr[n / 2 + i][j] = arr[i][j];
            }
        }

        for (int i = n / 2; i < n; i++) {
            for (int j = m / 2; j < m; j++) {
                nArr[i][j - m / 2] = arr[i][j];
            }
        }

        for (int i = n / 2; i < n; i++) {
            for (int j = 0; j < m / 2; j++) {
                nArr[i - n / 2][j] = arr[i][j];
            }
        }

        arr = nArr;
    }
    private static void six() {
        int[][] nArr = new int[n][m];

        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < m / 2; j++) {
                nArr[n / 2 + i][j] = arr[i][j];
            }
        }

        for (int i = n / 2; i < n; i++) {
            for (int j = 0; j < m / 2; j++) {
                nArr[i][j + m / 2] = arr[i][j];
            }
        }

        for (int i = n / 2; i < n; i++) {
            for (int j = m / 2; j < m; j++) {
                nArr[i - n / 2][j] = arr[i][j];
            }
        }

        for (int i = 0; i < n / 2; i++) {
            for (int j = m / 2; j < m; j++) {
                nArr[i][j - m / 2] = arr[i][j];
            }
        }
        
        arr = nArr;
    }
}
