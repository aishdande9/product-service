package problems;

import java.util.HashMap;

public class WordOccurances {
    public static void main(String[] args) {
        String str = "java is java and java is powerful";
String[] word = str.split(" ");
        HashMap<String,Integer> map = new HashMap<>();

        for(String i:word){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }

        System.out.println(map);

    }
}
