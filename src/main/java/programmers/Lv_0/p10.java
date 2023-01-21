package programmers.Lv_0;

public class p10 {
    public static void main(String[] args) {
        System.out.println(solution(100));
    }

    public static String solution(int age) {
        String[] s = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        StringBuilder sb = new StringBuilder();
        int length = (int) (Math.log10(age) + 1);
        int[] a = new int[length];
        int b = 0;
        for (int i = 0; i < length; i++) {
            b = age % 10;
            age /= 10;
            a[length - 1 - i] = b;
        }
        for (int i = 0; i < length; i++) {
            sb.append(s[a[i]]);
        }
        return sb.toString();
//        StringBuilder answer = new StringBuilder();
//        while (age > 0) {
//            answer.insert(0, s[age % 10]);
//            age /= 10;
//        }
//        return answer.toString();
    }
}
