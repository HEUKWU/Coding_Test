import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < want.length; i++){
            map.put(want[i], number[i]);
        }

        int count = 0;
        for(int i = 0; i < discount.length - 10 + 1; i++){
            Map<String, Integer> dMap = new HashMap<>();

            for(int j = 0; j < 10; j++){
                dMap.put(discount[i + j], dMap.getOrDefault(discount[i + j], 0) + 1);
            }

            boolean b = true;

            for(String key : map.keySet()){
                if(!map.get(key).equals(dMap.get(key))){
                    b = false;
                    break;
                }
            }

            if (!b) {
                continue;
            }

            count++;
        }

        return count;
    }
}