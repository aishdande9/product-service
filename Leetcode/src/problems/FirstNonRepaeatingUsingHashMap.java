package problems;

import java.util.HashMap;


public class FirstNonRepaeatingUsingHashMap {
    public static void main(String[] args) {
        System.out.println(countWord("swiss"));
    }

    public static char countWord(String word) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (Character i : word.toCharArray()) {

            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }

        }


        for (Character i : word.toCharArray()) {
            if (map.get(i) == 1) {

              return i;


            }
        }

return '\u0000';
    }
}
