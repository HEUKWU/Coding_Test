package programmers.Lv_0;

public class p29 {
    public static void main(String[] args) {
        int[] a = {7, 17, 77};
        System.out.println(solution(a));
    }

    public static int solution(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            while (array[i] > 0) {
                if (array[i] % 10 == 7) {
                    count++;
                }
                array[i] /= 10;
            }
        }
//        for (int i : array) {
//            while (i > 0) {
//                if (i % 10 == 7) {
//                    count++;
//                }
//                i /= 10;
//            }
//        }
        return count;
    }
}
