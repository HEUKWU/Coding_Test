package programmers.Lv_0.옹알이_1;

public class Main {
    public static void main(String[] args) {
        String[] a = {"aya", "yee", "u", "maa", "wyeoo"};
        System.out.println(solution(a));

        String[] b = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        System.out.println(solution(b));
    }

    static int solution(String[] babbling) {
        int count = 0;

        for (String s : babbling) {
            s = s.replaceFirst("aya", "0");
            s = s.replaceFirst("woo", "0");
            s = s.replaceFirst("ye", "0");
            s = s.replaceFirst("ma", "0");
            s = s.replace("0", "");
            if (s.equals("")) {
                count++;
            }
        }

        return count;
    }
}
