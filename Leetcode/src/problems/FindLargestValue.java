package problems;

public class FindLargestValue {
    public static void main(String[] args) {
        int[] numbers = {8, 21, 4, 50, 17};
        System.out.println(findMaximum(numbers));
    }

    public static int findMaximum(int[] numbers){
        int max = numbers[0];
     for(int i=0;i<numbers.length;i++){

         if(numbers[i]>max){
             max = numbers[i];
         }
     }

     return max;
    }
}
