import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static final int INF = (int) 1e9;
    private static int n;
    private static final List<List<Bus>> list = new ArrayList<>();
    private static int[] d;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        d = new int[n + 1];
        Arrays.fill(d, INF);

        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int fare = Integer.parseInt(st.nextToken());

            list.get(start).add(new Bus(end, fare));
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        int departure = Integer.parseInt(st.nextToken());
        int arrival = Integer.parseInt(st.nextToken());

        dijkstra(departure);

        System.out.println(d[arrival]);
    }

    private static void dijkstra(int departure) {
        PriorityQueue<Bus> q = new PriorityQueue<>();
        q.add(new Bus(departure, 0));
        d[departure] = 0;

        while (!q.isEmpty()) {
            Bus bus = q.poll();
            int end = bus.getEnd();
            int fare = bus.getFare();

            if (d[end] < fare) {
                continue;
            }

            for (Bus b : list.get(end)) {
                fare = d[end] + b.getFare();

                if (fare < d[b.getEnd()]) {
                    d[b.getEnd()] = fare;
                    q.offer(new Bus(b.getEnd(), fare));
                }
            }
        }
    }

    private static class Bus implements Comparable<Bus> {
        private final int end;
        private final int fare;

        public int getEnd() {
            return end;
        }

        public int getFare() {
            return fare;
        }

        public Bus(int end, int fare) {
            this.end = end;
            this.fare = fare;
        }

        @Override
        public int compareTo(Bus o) {
            return this.fare - o.fare;
        }
    }
}

