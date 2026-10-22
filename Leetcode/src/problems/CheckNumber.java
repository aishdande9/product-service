package problems;

public class CheckNumber {
    public static void main(String[] args) {
        System.out.println(checkNumber(4));
    }

    public static String checkNumber(int number){
        if(number>0){
            return "positive";
        }else if(number < 0){
            return "negative";
        }else{
            return "zero";
        }
    }
}
