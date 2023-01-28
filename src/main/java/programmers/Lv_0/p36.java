package programmers.Lv_0;

public class p36 {
    public static void main(String[] args) {
//        int[] arr = {1, 3, 4, 3, 5};
//        int answer = 0; // 최빈값
//        int[] index = new int[5 + 1]; // 값별 갯수(COUNT) 저장
//        int max = Integer.MIN_VALUE;
//
//        for(int i = 0; i<arr.length; i++) {
//            index[arr[i]]++; // 값별 인덱스에 COUNT 추가
//        }
//        System.out.println(Arrays.toString(index));
//
//        for(int i = 0; i<index.length; i++) {
//            if(index[i] > max) { // 최대값 구하기
//                max = index[i];
//                answer = i;
//            }
//        }
//
//        System.out.println("ANSWER : " + answer + " COUNT : " + max);
    }
    public static int solution(int[] array) {
        int answer = 0;
        int a = 0;
        int count = 0;
        int[] n = new int[1001];
        for (int j : array) {
            n[j]++;
        }
        for (int i = 0; i < n.length; i++) {
            if (n[i] > answer) {
                answer = n[i];
                a = i;
            }
        }
        for (int j : n) {
            if (answer == j) {
                count++;
            }
        }
        if (count > 1) {
            return -1;
        }
        return a;
    }
}
