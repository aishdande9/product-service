package problems;

import java.util.Arrays;
import java.util.List;

public class AllStudentsPassed {
    public static void main(String[] args) {
        System.out.println(allStudentsPassed(Arrays.asList(75, 60, 90, 50)));
        System.out.println(allStudentsPassed(Arrays.asList(75, 40, 90, 60)));
    }
    public static boolean allStudentsPassed(List<Integer> scores){
        return scores.stream().allMatch(score->score>=50);

    }
}
