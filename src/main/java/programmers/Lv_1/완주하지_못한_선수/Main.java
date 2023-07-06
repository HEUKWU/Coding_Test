package programmers.Lv_1.완주하지_못한_선수;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] a = {"leo", "kiki", "eden"};
        String[] b = {"eden", "kiki"};
        System.out.println(solution(a, b));

        String[] c = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] d = {"josipa", "filipa", "marina", "nikola"};
        System.out.println(solution(c, d));

        String[] e = {"mislav", "stanko", "mislav", "ana"};
        String[] f = {"stanko", "ana", "mislav"};
        System.out.println(solution(e, f));
    }

    static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!completion[i].equals(participant[i])) {
                return participant[i];
            }
        }

        return participant[participant.length - 1];
    }
}
