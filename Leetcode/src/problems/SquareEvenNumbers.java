package problems;

import java.util.Arrays;
import java.util.List;

public class SquareEvenNumbers {
    public static void main(String[] args) {

        System.out.println(squareEvenNumbers(Arrays.asList(2, 3, 4, 5, 6)));
    }

    public static List<Integer> squareEvenNumbers(List<Integer> numbers){
return numbers.stream().filter(num->num%2==0).map(num->num*num).toList();
    }
}
