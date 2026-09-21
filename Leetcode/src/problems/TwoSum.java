package problems;

import java.util.Arrays;

public class TwoSum {


    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));

    }
    public static int[] twoSum(int[] nums, int target) {
        // Write your solution here

        for(int i=0;i<nums.length;i++){
            if(nums[i]+nums[i+1]== target){
                return new int[]{i, i + 1};

            }
        }

        return new int[]{};
    }
}
