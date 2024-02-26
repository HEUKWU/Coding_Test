class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int max = health;
        int last = attacks[attacks.length - 1][0];

        int ca = 0;
        for (int i = 1; i <= last; i++) {
            boolean attacked = false;

            for (int[] attack : attacks) {
                if (i == attack[0]) {
                    attacked = true;
                    health -= attack[1];
                    if (health <= 0) {
                        return -1;
                    }
                    ca = 0;
                    break;
                }
            }

            if (attacked) {
                continue;
            }

            ca++;
            health += bandage[1];
            if (ca == bandage[0]) {
                ca = 0;
                health += bandage[2];
            }

            if (health > max) {
                health = max;
            }
        }

        return health;
    }
}