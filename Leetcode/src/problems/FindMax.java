package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMax {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(3, 7, 2, 9, 4));
        System.out.println(findM(nums));
    }

    public static int findM(List<Integer> nums){

        int max = nums.get(0);
        for(int i=0;i<nums.size();i++){
          if(nums.get(i)>max){
              max = nums.get(i);

            }
        }

        return max;
    }
}
