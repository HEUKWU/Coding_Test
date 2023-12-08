import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);

        int count = 0;
        int min = 0;

        for (int i = people.length - 1; i >= min; i--) {
            if (people[min] + people[i] <= limit) {
                min++;
            }
            count++;
        }

        return count;
    }
}