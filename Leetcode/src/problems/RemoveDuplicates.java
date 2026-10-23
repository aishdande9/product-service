package problems;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(Arrays.asList(4, 2, 4, 7, 2, 9)));
    }

    public static List<Integer> removeDuplicates(List<Integer> numbers) {

        List<Integer> newList = new ArrayList<>();
for(int i = 0;i <numbers.size();i++){
    if(!newList.contains(numbers.get(i))){
        newList.add(numbers.get(i));
    }
}

return newList;
    }
}


