import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        boolean[] students = new boolean[101];
        List<Student> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());

            // 처음 추천 받는다면
            if (!students[num]) {
                // 사진틀이 다 찼다면
                if (list.size() >= n) {
                    // 추천 횟수가 가장 적은 사진 삭제
                    Collections.sort(list);
                    int number = list.get(0).getNum();
                    // 삭제된 학생 추천 수 초기화
                    students[number] = false;
                    // 사진틀에서 삭제
                    list.remove(0);
                }
                // 추천 처리
                students[num] = true;
                // 사진틀에 추가
                list.add(new Student(num, 1, i));
            } else {  // 추천을 또 받았다면
                for (Student student : list) {
                    if (student.getNum() == num) {
                        // 추천 횟수 증가
                        student.incrementCount();
                        break;
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 101; i++) {
            // 추천을 받은 최종 후보 출력
            if (students[i]) {
                sb.append(i).append(' ');
            }
        }

        System.out.println(sb);
    }

    private static class Student implements Comparable<Student> {
        private final int num;
        private int count;
        private final int order;

        public int getNum() {
            return num;
        }

        public void incrementCount() {
            count++;
        }

        public Student(int num, int count, int order) {
            this.num = num;
            this.count = count;
            this.order = order;
        }

        @Override
        public int compareTo(Student o) {
            if (this.count == o.count) {
                return this.order - o.order;
            }

            return this.count - o.count;
        }
    }
}

