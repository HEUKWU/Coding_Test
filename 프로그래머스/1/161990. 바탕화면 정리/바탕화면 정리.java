class Solution {
    public int[] solution(String[] wallpaper) {
        int ax = Integer.MAX_VALUE;
        int ay = Integer.MAX_VALUE;
        int bx = 0;
        int by = 0;
        
        for (int i = 0; i < wallpaper.length; i++) {
            String s = wallpaper[i];
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '#') {
                    ax = Math.min(ax, i);
                    ay = Math.min(ay, j);
                    bx = Math.max(bx, i + 1);
                    by = Math.max(by, j + 1);
                }
            }
        }

        return new int[]{ax, ay, bx, by};
    }
}