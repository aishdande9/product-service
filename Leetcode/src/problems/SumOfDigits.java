package problems;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1234));
    }

    public static int sumOfDigits(int number){

        int sum = 0;
       while(number>0) {
           int lastDigit = number % 10;
sum = sum+lastDigit;
number = number/10;
       }

      return sum ;
    }
}
