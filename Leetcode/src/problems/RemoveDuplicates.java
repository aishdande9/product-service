package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 1));

        System.out.println(rmvDuplicates(nums));
    }

    public static List<Integer> rmvDuplicates(List<Integer> nums){

        List<Integer> result = new ArrayList<>();
        for(int i=0;i<nums.size();i++){
            if(!result.contains(nums.get(i))){
                result.add(nums.get(i));
            }

        }

        return result;
    }
}
