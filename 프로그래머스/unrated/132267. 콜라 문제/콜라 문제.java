class Solution {
    public int solution(int a, int b, int n) {
        int sum = 0;

        while(n >= a) {
            sum += (n / a) * b;
            int c = n % a;

            n = (n / a) * b + c;
        }

        return sum;
    }
}