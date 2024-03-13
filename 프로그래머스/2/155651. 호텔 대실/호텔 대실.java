class Solution {
    public int solution(String[][] book_time) {
        // 하루동안의 시간(24 * 60 + 10(청소 시간))
        int[] timetable = new int[1450];

        for (String[] time : book_time) {
            String in = time[0];
            String out = time[1];

            // 타임테이블에 표기
            timetable[time(in)]++;
            timetable[time(out) + 10]--;
        }

        // 누적합
        int max = 0;
        for (int i = 1; i < 1450; i++) {
            timetable[i] += timetable[i - 1];
            max = Math.max(max, timetable[i]);
        }

        return max;
    }

    // 시간 계산
    private int time(String time) {
        String[] split = time.split(":");

        return Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
    }
}