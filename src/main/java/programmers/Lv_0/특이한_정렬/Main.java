package programmers.Lv_0.특이한_정렬;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(solution(a, 4)));
    }

    public static int[] solution(int[] numlist, int n) {
        Arrays.sort(numlist);
        List<Integer> list = new ArrayList<>();
        for (Integer integer : numlist) {
            list.add(integer);
        }
        list.sort((a, b) -> Integer.compare(Math.abs(b - n), Math.abs(a - n)));
        Collections.reverse(list);
        return list.stream().mapToInt(a -> a).toArray();
    }

}
