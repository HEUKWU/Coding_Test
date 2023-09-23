class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int a = 0;
        if (fori(cards1, goal, a)){
            return "No";
        }

        a = 0;

        if (fori(cards2, goal, a)) {
            return "No";
        }

        return "Yes";
    }
    
    boolean fori(String[] cards1, String[] goal, int a) {
        for (int i = 0; i < goal.length; i++) {
            for (int j = 0; j < cards1.length; j++) {
                if (goal[i].equals(cards1[j])) {
                    if (a != j) {
                        return true;
                    }
                    a++;
                    break;
                }
            }
        }
        return false;
    }
}