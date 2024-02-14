import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (String call : callings) {
            Integer a = map.get(call);
            String player = players[a - 1];

            players[a - 1] = call;
            players[a] = player;

            map.put(call, a - 1);
            map.put(player, a);
        }

        return players;
    }
}