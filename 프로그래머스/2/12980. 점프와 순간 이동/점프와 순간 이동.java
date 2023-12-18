import java.util.*;

public class Solution {
    public int solution(int n) {
        int sum = 1;

        while (n != 1) {
            sum += n % 2;
            n /= 2;
        }

        return sum;
    }
}