package problems;

public class FindEven {
    public static void main(String[] args) {
        int[] numbers = {3, 8, 12, 5, 7, 10};

        System.out.println(countEvenNumbers(numbers));
    }

    public static int countEvenNumbers(int[] numbers){
        int count = 0;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2==0){
                count++;
            }
        }

        return count;
    }
}
