package problems;

public class ArrayOfNumbers {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};

        System.out.println(printNumbers(numbers));

    }

    public static int printNumbers(int[] numbers){

int sum = 0;
        for(int i=0;i<numbers.length;i++){
         sum = sum + numbers[i];


        }

        return sum;
    }

    //Arrays are used to store multiple values of a same datatype

    //array values are retrievd based on indexes numbers[i]



}
