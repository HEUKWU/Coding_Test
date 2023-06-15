package programmers.Lv_1.문자열_내_마음대로_정렬하기;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] s = {"sun", "bed", "car"};
        System.out.println(Arrays.toString(solution(s, 1)));
    }

    static String[] solution(String[] strings, int n) {
        String[] arr = new String[strings.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = strings[i].charAt(n) + strings[i];
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].substring(1);
        }

        return arr;
    }
}
