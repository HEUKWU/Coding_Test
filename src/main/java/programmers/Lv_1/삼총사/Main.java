package programmers.Lv_1.삼총사;

public class Main {
    public static void main(String[] args) {
        int[] a = {-2, 3, 0, 2, -5};
        int[] b = {-3, -2, -1, 0, 1, 2, 3};
        int[] c = {-1, 1, -1, 1};
        System.out.println(solution(a));
        System.out.println(solution(b));
        System.out.println(solution(c));
    }

    static int solution(int[] number) {
        int count = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
