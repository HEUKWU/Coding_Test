package programmers.Lv_1.소수_만들기;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,7,6,4}));
    }
    public static int solution(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    list.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }
        int answer = 0;
        for (Integer integer : list) {
            int a = 0;
            for (int j = 1; j <= integer; j++) {
                if (integer % j == 0) {
                    a++;
                }
            }
            if (a == 2) {
                answer++;
            }
        }
        return answer;
    }
}
