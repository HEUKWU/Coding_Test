package programmers.Lv_1.숫자_짝꿍;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution("100", "2345"));
        System.out.println(solution("100", "203045"));
        System.out.println(solution("100", "123450"));
        System.out.println(solution("12321", "42531"));
        System.out.println(solution("5525", "1255"));
    }

    static String solution(String X, String Y) {
        int[] x = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] y = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < X.length(); i++) {
            x[X.charAt(i) - 48]++;
        }

        for(int i=0; i<Y.length();i++){
            y[Y.charAt(i) - 48]++;
        }

        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < Math.min(x[i], y[i]); j++) {
                sb.append(i);
            }
        }

        if (sb.toString().equals("")) {
            return "-1";
        } else if (sb.toString().charAt(0) == '0') {
            return "0";
        }

        return sb.toString();
    }
}
