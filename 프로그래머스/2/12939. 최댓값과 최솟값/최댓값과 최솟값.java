class Solution {
    public String solution(String s) {
        String[] numbers = s.split(" ");

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (String number : numbers) {
            min = Math.min(min, Integer.parseInt(number));
            max = Math.max(max, Integer.parseInt(number));
        }

        return min + " " + max;
    }
}