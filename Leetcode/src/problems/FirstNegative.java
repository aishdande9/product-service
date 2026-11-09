package problems;

import java.util.Arrays;
import java.util.List;

public class FirstNegative {
    public static void main(String[] args) {
        System.out.println(findFirstNegative(Arrays.asList(5, 8, -3, -7)));
    }

    public static int findFirstNegative(List<Integer> numbers) {

        return numbers.stream().filter(num->num<0).findFirst().orElse(0);

    }


    }
