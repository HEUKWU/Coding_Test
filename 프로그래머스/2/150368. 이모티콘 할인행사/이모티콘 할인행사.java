import java.util.Arrays;

class Solution {

    private final int[] discountRate = {10, 20, 30, 40};
    private int maxOfSubscribe;
    private int maxOfCost;
    private int[][] users;
    private int[] emoticons;

    public int[] solution(int[][] users, int[] emoticons) {
        this.users = users;
        this.emoticons = emoticons;

        dfs(0, emoticons.length, new int[emoticons.length]);

        return new int[]{maxOfSubscribe, maxOfCost};
    }

    public void dfs(int index, int length, int[] discounts) {
        if (index == length) {
            int subscribe = 0;
            int cost = 0;

            for (int[] user : users) {
                int userDiscountRate = user[0];
                int userMaxCost = user[1];

                int sum = 0;

                for (int i = 0; i < emoticons.length; i++) {
                    if (discounts[i] >= userDiscountRate) {
                        sum += emoticons[i] / 100 * (100 - discounts[i]);
                    }
                }

                if (sum >= userMaxCost) {
                    subscribe++;
                } else {
                    cost += sum;
                }
            }

            if (subscribe > maxOfSubscribe) {
                maxOfSubscribe = subscribe;
                maxOfCost = cost;
            } else if (subscribe == maxOfSubscribe) {
                maxOfCost = Math.max(maxOfCost, cost);
            }

            return;
        }

        for (int i = 0; i < 4; i++) {
            discounts[index] = discountRate[i];
            dfs(index + 1, length, discounts);
        }
    }
}