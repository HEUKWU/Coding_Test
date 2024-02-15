class Solution {
    public int[] solution(String[] park, String[] routes) {
        int h = 0;
        int w = 0;

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[0].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    h = i;
                    w = j;
                    break;
                }
            }
        }

        for (String route : routes) {
            char d = route.charAt(0);
            int n = route.charAt(2) - '0';

            int newH = h;
            int newW = w;
            boolean b = false;
            switch (d) {
                case 'N':
                    for (int i = 0; i < n; i++) {
                        newH -= 1;
                        if (newH < 0 || park[newH].charAt(newW) == 'X') {
                            b = true;
                            break;
                        }
                    }
                    if (!b) {
                        h = newH;
                    }
                    b = false;
                    break;
                case 'S':
                    for (int i = 0; i < n; i++) {
                        newH += 1;
                        if (newH >= park.length || park[newH].charAt(newW) == 'X') {
                            b = true;
                            break;
                        }
                    }
                    if (!b) {
                        h = newH;
                    }
                    b = false;
                    break;
                case 'W':
                    for (int i = 0; i < n; i++) {
                        newW -= 1;
                        if (newW < 0 || park[newH].charAt(newW) == 'X') {
                            b = true;
                            break;
                        }
                    }
                    if (!b) {
                        w = newW;
                    }
                    b = false;
                    break;
                case 'E':
                    for (int i = 0; i < n; i++) {
                        newW += 1;
                        if (newW >= park[0].length() || park[newH].charAt(newW) == 'X') {
                            b = true;
                            break;
                        }
                    }
                    if (!b) {
                        w = newW;
                    }
                    b = false;
                    break;
            }
        }

        return new int[]{h, w};
    }
}