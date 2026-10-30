package problems;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesUsingStreams {

    public static void main(String[] args) {
        System.out.println(uniqueSortedNumbers(Arrays.asList(5, 2, 8, 2, 5, 1)));
    }
    public static List<Integer> uniqueSortedNumbers(List<Integer> numbers){
        return numbers.stream().distinct().sorted().toList();
    }
}
