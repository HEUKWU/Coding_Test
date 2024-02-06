import java.util.ArrayList;
import java.util.List;    

class Solution {
    public String solution(String new_id) {
        char[] chars = {'-', '_', '.'};
        List<Character> cList = new ArrayList<>();
        for (char c1 : chars) {
            cList.add(c1);
        }

        String s = new_id.toLowerCase();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('a' <= c && c <= 'z') {
                sb.append(c);
            } else if ('0' <= c && c <= '9') {
                sb.append(c);
            } else if (cList.contains(c)) {
                sb.append(c);
            }
        }

        String newString = sb.toString();

        while (newString.contains("..")) {
            newString = newString.replace("..", ".");
        }

        if (newString.charAt(0) == '.') {
            newString = newString.substring(1);
        }

        if (!newString.equals("")) {
            if (newString.charAt(newString.length() - 1) == '.') {
                newString = newString.substring(0, newString.length() - 1);
            }
        }

        if (newString.equals("")) {
            newString = "a";
        }

        if (newString.length() >= 16) {
            newString = newString.substring(0, 15);
        }

        if (newString.charAt(0) == '.') {
            newString = newString.substring(1);
        }
        if (newString.charAt(newString.length() - 1) == '.') {
            newString = newString.substring(0, newString.length() - 1);
        }

        if (newString.length() <= 2) {
            char c = newString.charAt(newString.length() - 1);
            while (newString.length() != 3) {
                newString += c;
            }
        }

        return newString;
    }
}