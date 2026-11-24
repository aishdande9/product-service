package problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountWordsInList {
    public static void main(String[] args) {
        System.out.println(wordCount(Arrays.asList("Java", "React", "Java", "Spring", "React", "Java")));
    }

    public static Map<String,Integer> wordCount(List<String> words){
        Map<String,Integer> map = new HashMap<>();

        for(String i:words){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }

        return map;
    }
}
