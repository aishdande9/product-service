package problems;

import java.util.Arrays;
import java.util.List;

public class MinValueInStreams {
    public static void main(String[] args) {
        System.out.println(findMinValue(Arrays.asList(10, 35, 8, 20)));
    }

    public static int findMinValue(List<Integer> numbers) {


        return numbers.stream().min((first, second) -> Integer.compare(first, second)).orElse(0);


    }

}
