package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(10, 20, 30));

        System.out.println(rList(nums));
    }


    public static List<Integer> rList(List<Integer> nums){
        List<Integer> reverseNums = new ArrayList<>();
        for(int i = nums.size()-1;i>=0;i--){
            reverseNums.add(nums.get(i));
        }

      return reverseNums;
    }
}
