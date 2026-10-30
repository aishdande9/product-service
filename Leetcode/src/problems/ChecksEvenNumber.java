package problems;

import java.util.Arrays;
import java.util.List;
//anymatch checks the condition and returns true or false
//
//anyMatch()  // Is at least one element a match?
//allMatch()  // Do all elements match?
//noneMatch() // Do no elements match?
public class ChecksEvenNumber {
    public static void main(String[] args) {
        System.out.println(containsEvenNumber(Arrays.asList(1, 3, 6, 7)));
    }
    public static boolean containsEvenNumber(List<Integer> numbers){
return numbers.stream().anyMatch(num->num%2==0);
    }
}
