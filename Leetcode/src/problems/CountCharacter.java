package problems;

import java.util.HashMap;
import java.util.Map;

public class CountCharacter {
    public static void main(String[] args) {

        String word = "hello";
        System.out.println(countCharacters(word));
}


public static Map<Character,Integer> countCharacters(String word){


        HashMap<Character,Integer> map = new HashMap<>();

     char[] letter = word.toCharArray();
    for(char i :letter){

        if(map.containsKey(i)){
       map.put(i, map.get(i)+1);

        }else{
            map.put(i,1);
        }
     }
return map;
}


}

