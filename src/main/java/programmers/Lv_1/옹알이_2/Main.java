package programmers.Lv_1.옹알이_2;

public class Main {
    public static void main(String[] args) {
        String[] a = {"aya", "yee", "u", "maa"};
        System.out.println(solution(a));

        String[] b = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        System.out.println(solution(b));
    }

    static int solution(String[] babbling) {
        int count = 0;

        for (String s : babbling) {
            if (s.contains("ayaaya") || s.contains("yeye") || s.contains("woowoo") || s.contains("mama")) {
                continue;
            }
            s = s.replace("aya", "0");
            s = s.replace("ye", "0");
            s = s.replace("woo", "0");
            s = s.replace("ma", "0");
            s = s.replace("0", "");
            if (s.equals("")) {
                count++;
            }
        }

        return count;
    }
}
