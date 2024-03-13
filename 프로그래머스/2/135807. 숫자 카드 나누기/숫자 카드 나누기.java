class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int a = arrayA[0];
        int b = arrayB[0];
        for (int i = 1; i < arrayA.length; i++) {
            a = gcdRec(a, arrayA[i]);
            b = gcdRec(b, arrayB[i]);
        }

        int answer = 0;
        if (division(arrayB, a)) {
            answer = Math.max(answer, a);
        }

        if (division(arrayA, b)) {
            answer = Math.max(answer, b);
        }

        return answer;
    }

    // 유클리드 호재법
    private static int gcdRec(int a, int b) {
        if (a % b == 0) {
            return b;
        }

        return gcdRec(b, a % b);
    }

    private boolean division(int[] arr, int num) {
        for (int i : arr) {
            if (i % num == 0) {
                return false;
            }
        }

        return true;
    }
}