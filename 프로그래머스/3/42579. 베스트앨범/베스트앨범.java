import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer>  totalPlayHashMap = new HashMap<>();
        HashMap<Integer, String> indexHashMap = new HashMap<>();

        ArrayList<Integer> answerArrayList = new ArrayList<>();


        for(int i = 0; i < genres.length; i++){
            if (totalPlayHashMap.containsKey(genres[i])) {
                totalPlayHashMap.put(genres[i], totalPlayHashMap.get(genres[i]) + plays[i]);
            }
            else {
                totalPlayHashMap.put(genres[i], plays[i]);
            }
            indexHashMap.put(i, genres[i]);
        }

        String[] sortGenres = totalPlayHashMap.keySet().toArray(new String[0]);
        Arrays.sort(sortGenres, (key1, key2) -> totalPlayHashMap.get(key2) - totalPlayHashMap.get(key1));


        for (String key : sortGenres) {
            ArrayList<Integer> tempArrayList = new ArrayList<>();
            for (int i = 0; i < genres.length; i++) {
                if (key.equals(indexHashMap.get(i))) {
                    tempArrayList.add(i);
                }
            }
            if(tempArrayList.size() < 2){
                answerArrayList.add(tempArrayList.get(0));
            }
            else {
                Integer[] sortPlays = tempArrayList.toArray(new Integer[0]);
                Arrays.sort(sortPlays, (index1, index2) -> plays[index2] - plays[index1]);
                answerArrayList.add(sortPlays[0]);
                answerArrayList.add(sortPlays[1]);
            }
        }

        return answerArrayList.stream().mapToInt(i->i).toArray();
    }
}