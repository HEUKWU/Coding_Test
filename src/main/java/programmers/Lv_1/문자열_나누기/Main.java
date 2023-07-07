package programmers.Lv_1.문자열_나누기;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution("banana"));
        System.out.println(solution("abracadabra"));
        System.out.println(solution("aaabbaccccabba"));
    }

    static int solution(String s) {
        int count = 0;
        char a = s.charAt(0);
        int j = 0, k = 0;

        for (int i = 0; i < s.length(); i++) {
            if (j == k) {
                count++;
                a = s.charAt(i);
            }
            if (s.charAt(i) == a) {
                j++;
            } else {
                k++;
            }
        }

        return count;
    }
}
