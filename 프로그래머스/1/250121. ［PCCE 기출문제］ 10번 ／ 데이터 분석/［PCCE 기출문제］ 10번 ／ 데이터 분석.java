import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int extN = 0;
        switch (ext) {
            case "date":
                extN = 1;
                break;
            case "maximum":
                extN = 2;
                break;
            case "remain":
                extN = 3;
                break;
        }

        int sort = 0;
        switch (sort_by) {
            case "date":
                sort = 1;
                break;
            case "maximum":
                sort = 2;
                break;
            case "remain":
                sort = 3;
                break;
        }

        List<int[]> list = new ArrayList<>();
        for (int[] datum : data) {
            if (datum[extN] < val_ext) {
                list.add(datum);
            }
        }

        int sortN = sort;
        list.sort(Comparator.comparingInt(a -> a[sortN]));

        int[][] newData = new int[list.size()][4];
        for (int i = 0; i < list.size(); i++) {
            newData[i] = list.get(i);
        }

        return newData;
    }
}