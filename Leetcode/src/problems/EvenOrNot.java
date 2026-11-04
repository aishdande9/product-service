package problems;

import java.util.Arrays;
import java.util.List;


public class EvenOrNot {
    public static void main(String[] args) {

        System.out.println(findFirstEven(Arrays.asList(3, 7, 8, 10)));

    }

    public static int findFirstEven(List<Integer> numbers) {
       return numbers.stream().filter(num -> num % 2 == 0).findFirst().orElse(-1);

    }
}

