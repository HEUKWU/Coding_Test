import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static final int INF = (int) 1e9;
    private static final List<List<Bus>> graph = new ArrayList<>();
    private static int[] d;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        d = new int[n + 1];

        Arrays.fill(d, INF);

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int fare = Integer.parseInt(st.nextToken());

            graph.get(start).add(new Bus(end, fare));
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        int departure = Integer.parseInt(st.nextToken());
        int arrival = Integer.parseInt(st.nextToken());

        System.out.println(dijkstra(departure, arrival));
    }

    private static int dijkstra(int departure, int arrival) {
        PriorityQueue<Bus> q = new PriorityQueue<>();
        q.offer(new Bus(departure, 0));
        d[departure] = 0;

        while (!q.isEmpty()) {
            Bus bus = q.poll();
            int end = bus.end;
            int fare = bus.fare;

            if (d[end] < fare) {
                continue;
            }

            for (int i = 0; i < graph.get(end).size(); i++) {
                fare = d[end] + graph.get(end).get(i).fare;

                if (fare < d[graph.get(end).get(i).end]) {
                    d[graph.get(end).get(i).end] = fare;
                    q.offer(new Bus(graph.get(end).get(i).end, fare));
                }
            }
        }

        return d[arrival];
    }

    private static class Bus implements Comparable<Bus> {
        private final int end;
        private final int fare;

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
