class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] sum = new int[photo.length];

        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < photo.length; j++) {
                int a = 0;
                for (int k = 0; k < photo[j].length; k++) {
                    if (name[i].equals(photo[j][k])) {
                        sum[j] += yearning[i];
                    }
                }
            }
        }

        return sum;
    }
}