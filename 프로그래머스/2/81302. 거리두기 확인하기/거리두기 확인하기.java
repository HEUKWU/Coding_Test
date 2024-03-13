class Solution {

    // 한칸
    private final int[] dx1 = {0, -1, 0, 1};
    private final int[] dy1 = {1, 0, -1, 0};

    // 두칸
    private final int[] dx2 = {0, -2, 0, 2};
    private final int[] dy2 = {2, 0, -2, 0};

    // 대각선
    private final int[] dx = {-1, -1, 1, 1};
    private final int[] dy = {1, -1, -1, 1};


    public int[] solution(String[][] places) {
        int[] answer = new int[5];

        for (int i = 0; i < 5; i++) {
            String[] place = places[i];
            answer[i] = check(place) ? 1 : 0;
        }

        return answer;
    }

    private boolean check(String[] place) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (place[i].charAt(j) == 'P') {
                    if (!distancing(i, j, place)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    private boolean distancing(int x, int y, String[] place) {
        for (int k = 0; k < 4; k++) {
            int nx = x + dx1[k];
            int ny = y + dy1[k];

            // 한칸 떨어진 곳에 응시자가 있으면 거리두기 X
            if (0 <= nx && nx < 5 && 0 <= ny && ny < 5) {
                if (place[nx].charAt(ny) == 'P') {
                    return false;
                }
            }
        }

        for (int k = 0; k < 4; k++) {
            int nx = x + dx2[k];
            int ny = y + dy2[k];

            // 두 칸 떨어진 곳에 응시자가 있을 때 사이에 파티션이 없으면 거리두기 X
            if (0 <= nx && nx < 5 && 0 <= ny && ny < 5) {
                if (place[nx].charAt(ny) == 'P') {
                    if (place[x + dx2[k] / 2].charAt(y + dy2[k] / 2) != 'X') {
                        return false;
                    }
                }
            }
        }

        for (int k = 0; k < 4; k++) {
            int nx = x + dx[k];
            int ny = y + dy[k];

            // 대각선에 응시자가 있을 때 파이에 파티션이 없으면 거리두기 X
            if (0 <= nx && nx < 5 && 0 <= ny && ny < 5) {
                if (place[nx].charAt(ny) == 'P') {
                    if (!(place[x].charAt(ny) == 'X' && place[nx].charAt(y) == 'X')) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}