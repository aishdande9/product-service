package problems;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Aishwarya";
        System.out.println(reverseMyName(name));
    }


    public static String reverseMyName(String name){
        String rev = "";
        for(int i=0;i<name.length();i++){
            rev = name.charAt(i)+rev;

        }

        return rev;
    }
}
