package problems;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;//accumulator because it stores the running total
        for(int i =1;i<=5;i++){
            sum = sum+i;

        }
        System.out.println(sum);
    }
}
