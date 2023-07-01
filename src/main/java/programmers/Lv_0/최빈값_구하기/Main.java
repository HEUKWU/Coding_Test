package programmers.Lv_0.최빈값_구하기;

public class Main {
    public static void main(String[] args) {

    }

    static public int solution(int[] array) {
        int answer = 0;
        int a = 0;
        int count = 0;
        int[] n = new int[1001];
        for (int j : array) {
            n[j]++;
        }
        for (int i = 0; i < n.length; i++) {
            if (n[i] > answer) {
                answer = n[i];
                a = i;
            }
        }
        for (int j : n) {
            if (answer == j) {
                count++;
            }
        }
        if (count > 1) {
            return -1;
        }
        return a;
    }
}
