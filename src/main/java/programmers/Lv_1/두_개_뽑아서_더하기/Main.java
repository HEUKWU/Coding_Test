package programmers.Lv_1.두_개_뽑아서_더하기;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] a = {5, 0, 2, 7};
        System.out.println(Arrays.toString(solution(a)));
    }

    static int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        int[] a = new int[set.size()];
        Iterator<Integer> it = set.iterator();

        for (int i = 0; i < a.length; i++) {
            a[i] = it.next();
        }
        Arrays.sort(a);

        return a;
    }
}
