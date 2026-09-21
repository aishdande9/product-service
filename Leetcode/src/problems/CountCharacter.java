package problems;

import java.util.HashMap;
import java.util.Map;

public class CountCharacter {
    public static void main(String[] args) {
String str = "banana";

        System.out.println(returnCharacterCount(str));
    }

    public static Map<Character,Integer> returnCharacterCount(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);

            } else {
                map.put(c, 1);
            }

        }

        return map;

    }}