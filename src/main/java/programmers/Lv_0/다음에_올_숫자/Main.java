package programmers.Lv_0.다음에_올_숫자;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {2, 4, 8};
        System.out.println(solution(a));
        System.out.println(solution(b));
    }

    public static int solution(int[] common) {
        if (common[1] - common[0] == common[2] - common[1]) {
            return common[common.length - 1] + (common[2] - common[1]);
        } else {
            return common[common.length - 1] * (common[2] / common[1]);
        }
    }
}
