class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            int a = food[i] / 2;
            for (int j = 0; j < a; j++) {
                sb.append(i);
            }
        }
        sb.append("0");

        for (int i = sb.length() - 2; i >= 0; i--) {
            sb.append(sb.charAt(i));
        }

        return sb.toString();
    }
}