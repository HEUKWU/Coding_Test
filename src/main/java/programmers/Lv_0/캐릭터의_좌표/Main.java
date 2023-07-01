package programmers.Lv_0.캐릭터의_좌표;

public class Main {
    public static void main(String[] args) {

    }

    static public int[] solution(String[] keyinput, int[] board) {
        int x = 0;
        int y = 0;
        int xMax = board[0] / 2;
        int xMin = -board[0] / 2;
        int yMax = board[1] / 2;
        int yMin = -board[1] / 2;

        for (String s : keyinput) {
            switch (s) {
                case "up":
                    y++;
                    if (y > yMax) {
                        y--;
                    }
                    break;
                case "down":
                    y--;
                    if (y < yMin) {
                        y++;
                    }
                    break;
                case "left":
                    x--;
                    if (x < xMin) {
                        x++;
                    }
                    break;
                default:
                    x++;
                    if (x > xMax) {
                        x--;
                    }
                    break;
            }
        }
        return new int[]{x, y};
    }
}
