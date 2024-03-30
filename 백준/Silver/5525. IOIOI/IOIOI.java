import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();

        int count = 0;
        // IOI의 개수
        int c = 0;
        for (int i = 1; i < m - 1; i++) {
            if (arr[i - 1] == 'I' && arr[i] == 'O' && arr[i + 1] == 'I') {
                // IOI개수 증가
                c++;

                if (c == n) {
                    // IOI개수가 n과 같으면 정답 증가
                    count++;
                    // 처음 IOI 한 개 감소
                    c--;
                }
                // 두번째 뒤의 인덱스로 이동
                i++;
            } else {
                // IOI개수 초기화
                c = 0;
            }
        }

        System.out.println(count);
    }
}