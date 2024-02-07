import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        String[] type = {"code", "date", "maximum", "remain"};
        List<String> list = Arrays.asList(type);

        int extN = list.indexOf(ext);
        int sortN = list.indexOf(sort_by);

        return Arrays.stream(data)
                .filter(a -> a[extN] < val_ext)
                .sorted(Comparator.comparingInt(a -> a[sortN]))
                .toArray(int[][]::new);
    }
}