import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int switchCount;
    private static int[] switches;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        switchCount = Integer.parseInt(br.readLine());

        switches = new int[switchCount];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < switchCount; i++) {
            switches[i] = Integer.parseInt(st.nextToken());
        }

        int studentsCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < studentsCount; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int number = Integer.parseInt(st.nextToken());

            if (gender == 1) {
                man(number);
            } else {
                woman(number);
            }

        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < switchCount; i++) {
            sb.append(switches[i]).append(' ');
            if ((i + 1) % 20 == 0) {
                sb.append('\n');
            }
        }

        System.out.println(sb);
    }

    private static void man(int num) {
        for (int i = 0; i < switchCount; i++) {
            if ((i + 1) % num == 0) {
                switches[i] = switches[i] == 0 ? 1 : 0;
            }
        }
    }

    private static void woman(int num) {
        int index = num - 1;

        switches[num - 1] = switches[num - 1] == 0 ? 1 : 0;
        for (int i = 1; i <= index; i++) {
            int minus = index - i;
            int plus = index + i;

            if (0 <= minus && plus < switchCount) {
                if (switches[minus] == switches[plus]) {
                    switches[minus] = switches[minus] == 0 ? 1 : 0;
                    switches[plus] = switches[plus] == 0 ? 1 : 0;
                } else {
                    break;
                }
            }
        }
    }
}
