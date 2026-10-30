package problems;

import java.util.Arrays;
import java.util.List;

public class UpperCaseVersionOfNames {
    public static void main(String[] args) {
        System.out.println(processNames(Arrays.asList("Amy", "John", "Aishwarya", "David", "Sam")));
    }
    public static List<String> processNames(List<String> names){
        return names.stream().filter(name->name.length() > 4).map(name->name.toUpperCase()).toList();

    }
}
