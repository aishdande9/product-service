package problems;

public class TargetValue {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 7, 40};
        int target = 7;

        System.out.println(findIndex(numbers,target));
    }

    public static int findIndex(int[] numbers,int target){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==target){
                return i;
            }
        }

        return -1;
    }
}
