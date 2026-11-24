package problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberMore {
    public static void main(String[] args) {
        System.out.println(countNumber(Arrays.asList(4, 2, 4, 3, 2, 4)));
    }

    public static int countNumber(List<Integer> number) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : number) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);

            } else {
                map.put(i, 1);
            }


        }

        int maxCount = 0;
        int mostFrequent = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        return mostFrequent;
    }
}
