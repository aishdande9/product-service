package problems;

public class LargestNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        int c = 15;
        System.out.println(findLargest(a,b,c));
    }

    public static int findLargest(int a, int b, int c){
        int largest = a;
   if(b>largest){
       largest = b;
   }else if(c > largest){
      largest = c;
   }

     return largest;
    }
}
