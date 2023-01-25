package programmers.Lv_0;

public class p26 {
    public static void main(String[] args) {
        int[] a = {10, 8, 6};
        System.out.println(solution(a, 3));
    }

    public static int solution(int[] box, int n) {
        return (box[0] / n) * (box[1] / n) * (box[2] / n);
    }
}
