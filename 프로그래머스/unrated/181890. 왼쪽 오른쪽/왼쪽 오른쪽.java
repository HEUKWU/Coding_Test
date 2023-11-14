import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String[] str_list) {
        for(int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                return new ArrayList<>(Arrays.asList(str_list).subList(0, i)).toArray(new String[0]);
            } else if (str_list[i].equals("r")) {
                return new ArrayList<>(Arrays.asList(str_list).subList(i + 1, str_list.length)).toArray(new String[0]);
            }
        }

        return new String[]{};
    }
}