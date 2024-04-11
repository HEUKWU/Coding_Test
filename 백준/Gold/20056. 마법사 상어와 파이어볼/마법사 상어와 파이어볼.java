import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    private static int N;
    private static ArrayList<Fireball>[][] map;
    private static final List<Fireball> fireballs = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        map = new ArrayList[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = new ArrayList<>();
            }
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            fireballs.add(new Fireball(r - 1, c - 1, m, s, d));
        }

        for (int i = 0; i < K; i++) {
            skill();
        }

        int sum = 0;
        for (Fireball fireball : fireballs) {
            sum += fireball.m;
        }

        System.out.println(sum);
    }

    private static final int[] dr = {-1, -1, 0, 1, 1, 1, 0, -1};
    private static final int[] dc = {0, 1, 1, 1, 0, -1, -1, -1};

    private static void skill() {
        // 이동
        for (Fireball fireball : fireballs) {
            int nr = (fireball.r + N + dr[fireball.d] * (fireball.s % N)) % N;
            int nc = (fireball.c + N + dc[fireball.d] * (fireball.s % N)) % N;
            fireball.setR(nr);
            fireball.setC(nc);

            map[fireball.r][fireball.c].add(fireball);
        }

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                // 같은 칸에 두개 미만으로 있을때
                if (map[r][c].size() < 2) {
                    map[r][c].clear();
                    continue;
                }

                int mSum = 0;
                int sSum = 0;
                int even = 0;
                int odd = 0;

                // 같은 칸에 있는 파이어볼들
                ArrayList<Fireball> sameSpaceBalls = map[r][c];
                int mergedFireballCount = sameSpaceBalls.size();

                for (Fireball fireball : sameSpaceBalls) {
                    mSum += fireball.m;
                    sSum += fireball.s;

                    if (fireball.d % 2 == 0) {
                        even++;
                    } else {
                        odd++;
                    }

                    // 분열된 파이어볼 제거
                    fireballs.remove(fireball);
                }

                // 맵 초기화
                sameSpaceBalls.clear();

                // 질량
                mSum /= 5;
                if (mSum == 0) {
                    // 질량 0이면 넘어감
                    continue;
                }

                // 속도
                sSum /= mergedFireballCount;

                // 방향이 모두 짝수이거나 홀수일 때
                if (even == mergedFireballCount || odd == mergedFireballCount) {
                    for (int k = 0; k <= 6; k += 2) {
                        fireballs.add(new Fireball(r, c, mSum, sSum, k));
                    }
                } else {
                    for (int k = 1; k <= 7; k += 2) {
                        fireballs.add(new Fireball(r, c, mSum, sSum, k));
                    }
                }
            }
        }
    }

    private static class Fireball {
        private int r;
        private int c;
        private final int m;
        private final int s;
        private final int d;

        public void setR(int r) {
            this.r = r;
        }

        public void setC(int c) {
            this.c = c;
        }

        public Fireball(int r, int c, int m, int s, int d) {
            this.r = r;
            this.c = c;
            this.m = m;
            this.s = s;
            this.d = d;
        }
    }
}
