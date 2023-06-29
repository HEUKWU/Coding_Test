package programmers.Lv_1.다트_게임;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution("1S2D*3T"));
    }

    static int solution(String dartResult) {
        int count = 0;
        int score[] = new int[3];
        int a;
        int idx = 0;
        String num = "";

        for (int i = 0; i < dartResult.length(); i++) {
            char ch = dartResult.charAt(i);

            if (ch >= '0' && ch <= '9') {
                num += String.valueOf(ch);
            } else if (ch == 'S' || ch == 'D' || ch == 'T') {
                a = Integer.parseInt(num);
                if (ch == 'S') {
                    a = (int) Math.pow(a, 1);
                } else if (ch == 'D') {
                    a = (int) Math.pow(a, 2);
                } else {
                    a = (int) Math.pow(a, 3);
                }
                score[idx++] = a;
                num = "";
            } else {
                if (ch == '#') {
                    score[idx - 1] *= -1;
                } else {
                    score[idx - 1] *= 2;
                    if (idx >= 2) {
                        score[idx - 2] *= 2;
                    }
                }
            }
        }

        for (int i = 0; i < score.length; i++) {
            count += score[i];
        }

        return count;
    }
}
