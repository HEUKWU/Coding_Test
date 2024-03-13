class Solution {
    public int solution(int storey) {
        int count = 0;

        while (storey != 0) {
            int a = storey % 10;
            storey /= 10;

            if (a > 5) {
                count += 10 - a;
                storey++;
            } else if (a == 5) {
                if (storey % 10 >= 5) {
                    count += 10 - a;
                    storey++;
                } else {
                    count += a;
                }
            } else {
                count += a;
            }
        }

        return count;
    }
}