import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String solution(int[] numbers) {
        List<String> list = Arrays.stream(numbers).mapToObj(String::valueOf).sorted((a, b) -> (b + a).compareTo(a + b)).collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();
        list.forEach(sb::append);

        if (list.get(0).equals("0")) {
            return "0";
        }

        return sb.toString();
    }
}