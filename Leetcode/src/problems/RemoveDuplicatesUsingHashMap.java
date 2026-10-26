package problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveDuplicatesUsingHashMap {
    public static void main(String[] args) {
        System.out.println(countFrequency(Arrays.asList(4, 2, 4, 7, 2, 4)));
    }

    public static Map<Integer, Integer> countFrequency(List<Integer> numbers){
        HashMap<Integer,Integer> result = new HashMap<>();
        for(Integer i:numbers){
            if(result.containsKey(i)){
                result.put(i, result.get(i)+1);
            }else{
                result.put(i,1);
            }

        }

return result;
    }
}
