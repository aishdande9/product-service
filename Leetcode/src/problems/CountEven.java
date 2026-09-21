package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountEven {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6));
        System.out.println(even(nums));


        }

    public static int even(List<Integer> nums){
        int count = 0;
        for(int i=0;i<nums.size();i++){
            if(nums.get(i)%2 == 0){
                count++;
            }
        }

        return count;
    }
}
