package problems;

import java.util.Arrays;
import java.util.List;
//reduce takes the elements and produces a result
public class SumOfSDquares {
    public static void main(String[] args) {
        System.out.println(sumOfEvenSquares(Arrays.asList(1, 2, 3, 4, 5, 6)));
    }
    public static int sumOfEvenSquares(List<Integer> numbers){
return numbers.stream().filter(num->num%2==0).map(num->num*num).reduce(0,(result,num)->result+num);
    }
}
