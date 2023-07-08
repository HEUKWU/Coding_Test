package programmers.Lv_1.대충_만든_자판;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(
                new String[]{"ABACD", "BCEFD"},
                new String[]{"ABCD","AABB"})));


    }

    static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int[] al = new int[26];

        for (int i = 0; i < al.length; i++) {
            char t = (char) ('A' + i);
            al[i] = Integer.MAX_VALUE;

            for (String s : keymap) {
                int j = s.indexOf(t) + 1;
                if (j != 0) {
                    al[i] = Math.min(al[i], j);
                }
            }
        }

        for (int i = 0; i < targets.length; i++) {
            int sum = 0;
            for (int j = 0; j < targets[i].length(); j++) {
                char t = targets[i].charAt(j);
                int l = al[t - 'A'];
                if (l == Integer.MAX_VALUE) {
                    sum = -1;
                    break;
                }
                sum += l;
            }
            answer[i] = sum;
        }

        return answer;
    }
}
