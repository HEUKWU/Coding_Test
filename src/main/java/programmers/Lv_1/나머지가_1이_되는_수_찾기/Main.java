package programmers.Lv_1.나머지가_1이_되는_수_찾기;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(12));
    }

    public static int solution(int n) {
        for (int i = 1; i < n; i++) {
            if (n % i == 1) {
                return i;
            }
        }
        return 1;
    }
}
