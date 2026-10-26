package problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstDuplicate {
    public static void main(String[] args) {
        System.out.println(findFirstDuplicate(Arrays.asList(5, 8, 5, 8)));
    }
    public static int findFirstDuplicate(List<Integer> numbers) {
        Set<Integer> result = new HashSet<>();
        for (Integer number : numbers) {
            // If adding fails, return this number
            if(result.contains(number)){
               return number;
            }

            result.add(number);
                }

        return -1;
        }


    }
