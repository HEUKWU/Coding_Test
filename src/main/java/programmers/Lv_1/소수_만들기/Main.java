package programmers.Lv_1.소수_만들기;

public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {1, 2, 7, 6, 4};
        System.out.println(solution(a));
        System.out.println(solution(b));
    }

    static int solution(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    count = num(nums[i] + nums[j] + nums[k], count);
                }
            }
        }

        return count;
    }

    static int num(int a, int count) {
        int c = 0;

        for (int i = 2; i <= a; i++) {
            if (a % i == 0) {
                c++;
            }
        }

        return c == 1 ? count + 1 : count;
    }
}
