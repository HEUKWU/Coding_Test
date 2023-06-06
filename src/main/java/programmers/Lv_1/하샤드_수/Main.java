package programmers.Lv_1.하샤드_수;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int a = x;

        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }

        return x % sum == 0;
    }
}