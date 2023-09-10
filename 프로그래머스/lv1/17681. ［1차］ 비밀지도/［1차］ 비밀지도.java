class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            String s1 = method(i, n, arr1);
            String s2 = method(i, n, arr2);
            String answer = "";

            for (int j = 0; j < n; j++) {
                if (s1.charAt(j) == '1' || s2.charAt(j) == '1') {
                    answer += "#";
                } else {
                    answer += " ";
                }
            }

            a[i] = answer;
        }
        return a;
    }
    
    String method(int i, int n, int[] arr) {
        String s = Integer.toBinaryString(arr[i]);
        return "0".repeat(n - s.length()) + s;
    }
}