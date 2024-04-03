import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<Balloon> q = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            q.add(new Balloon(i + 1, Integer.parseInt(st.nextToken())));
        }

        StringBuilder sb = new StringBuilder();
        Balloon firstBalloon = q.poll();
        int index = firstBalloon.index;
        int move = firstBalloon.move;
        sb.append(index).append(' ');

        while (!q.isEmpty()) {
            if (move > 0) {
                for (int i = 1; i < move; i++) {
                    q.addLast(q.pollFirst());
                }
                Balloon balloon = q.pollFirst();
                move = balloon.move;
                sb.append(balloon.index);
            } else {
                for (int i = 1; i < -move; i++) {
                    q.addFirst(q.pollLast());
                }
                Balloon balloon = q.pollLast();
                move = balloon.move;
                sb.append(balloon.index);
            }
            sb.append(' ');
        }

        System.out.println(sb);
    }

    static class Balloon {
        private final int index;
        private final int move;

        public Balloon(int index, int move) {
            this.index = index;
            this.move = move;
        }
    }
}