import java.util.*;

class Solution {
    
    private boolean[] visited;
    private List<String> airports;
    String[][] tickets;

    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        airports = new ArrayList<>();
        this.tickets = tickets;

        dfs("ICN", "ICN", 0);
        Collections.sort(airports);

        return airports.get(0).split(" ");
    }

    private void dfs(String airport, String route, int index) {
        if (index == tickets.length) {
            airports.add(route);
            return;
        }

        for (int i = 0; i < tickets.length; i++) {
            if (!visited[i] && tickets[i][0].equals(airport)) {
                visited[i] = true;
                dfs(tickets[i][1], route + " " + tickets[i][1], index + 1);
                visited[i] = false;
            }
        }
    }
}