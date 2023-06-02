package programmers.Lv_1.평균_구하기;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public double solution(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return (double) sum / arr.length;
    }
}
