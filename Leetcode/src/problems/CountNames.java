package problems;

import java.util.Arrays;
import java.util.List;

public class CountNames {
    public static void main(String[] args) {
        System.out.println(countLongNames(Arrays.asList("Amy", "John", "Aishwarya", "David", "Sam")));
    }
    public static long countLongNames(List<String> names){
        return names.stream().filter(name->name.length()>4).count();
    }
}
