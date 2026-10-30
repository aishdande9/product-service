package problems;

import java.util.Arrays;
import java.util.List;

public class FindTheProduct {
    public static void main(String[] args) {
        System.out.println(multiplyNumbers(Arrays.asList(2, 3, 4)));
    }
    public static int multiplyNumbers(List<Integer> numbers){
    return numbers.stream().reduce(1,(result,number)->result*number);

    }
}
