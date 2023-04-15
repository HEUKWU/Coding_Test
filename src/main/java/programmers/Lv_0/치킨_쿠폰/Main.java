package programmers.Lv_0.치킨_쿠폰;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(1081));
    }

    public static int solution(int chicken) {
        int answer = 0;

        while (chicken >= 10) {
            int a = chicken / 10;
            int b = chicken % 10;
            chicken = a + b;
            answer += a;
        }
        return answer;
    }
}
