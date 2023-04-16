package programmers.Lv_0.문제;

public class p2 {
    public static void main(String[] args) {
        System.out.println(new Solution2().solution(150000));
    }
}

class Solution2 {
    public int solution(int price) {
        if (100000 <= price && price < 300000) {
            price *= 0.95;
        } else if (300000 <= price && price < 500000) {
            price *= 0.9;
        } else if (500000 <= price) {
            price *= 0.8;
        }
        return price;
    }
}