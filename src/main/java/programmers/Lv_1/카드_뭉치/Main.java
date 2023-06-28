package programmers.Lv_1.카드_뭉치;

public class Main {
    public static void main(String[] args) {
        String[] a = {"i", "drink", "water"};
        String[] b = {"want", "to"};
        String[] c = {"i", "want", "to", "drink", "water"};
        System.out.println(solution(a, b, c));

        String[] d = {"i", "water", "drink"};
        String[] e = {"want", "to"};
        String[] f = {"i", "want", "to", "drink", "water"};
        System.out.println(solution(d, e, f));
    }

    static String solution(String[] cards1, String[] cards2, String[] goal) {
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

    private static boolean fori(String[] cards1, String[] goal, int a) {
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
