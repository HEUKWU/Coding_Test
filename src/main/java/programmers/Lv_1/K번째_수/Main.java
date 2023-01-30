package programmers.Lv_1.K번째_수;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }
    public static int[] solution(int[] array, int[][] commands) {
        int[] a = new int[commands.length];
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j < commands.length; j++) {
            for (int i = commands[j][0] - 1; i <= commands[j][1] - 1; i++) {
                list.add(array[i]);
            }
            answer = list.stream().mapToInt(Integer::intValue).toArray();
            Arrays.sort(answer);
            a[j] = answer[commands[j][2] - 1];
            list.clear();
        }
        return a;
    }
}
