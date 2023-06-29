package programmers.Lv_1.덧칠하기;

public class Main {
    public static void main(String[] args) {
        int[] a = {2, 3, 6};
        System.out.println(solution(8, 4, a));

        int[] b = {1, 3};
        System.out.println(solution(5, 4, b));

        int[] c = {1, 2, 3, 4};
        System.out.println(solution(4, 1, c));
    }

    static int solution(int n, int m, int[] section) {
        int count = 0;
        int a = section[0];
        for (int i = 0; i < section.length; i++) {
            if (a <= section[i]) {
                a = section[i] + m;
                count++;
            }
        }
        return count;
    }
}
