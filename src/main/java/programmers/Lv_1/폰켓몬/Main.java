package programmers.Lv_1.폰켓몬;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] a = {3, 1, 2, 3};
        int[] b = {3, 3, 3, 2, 2, 4};
        int[] c = {3, 3, 3, 2, 2, 2};
        System.out.println(solution(a));
        System.out.println(solution(b));
        System.out.println(solution(c));
    }

    static int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        return Math.min(set.size(), nums.length / 2);
    }
}
