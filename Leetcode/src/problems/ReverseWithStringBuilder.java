package problems;

public class ReverseWithStringBuilder {
    public static void main(String[] args) {
String text = "aishwarya";
        System.out.println(reverseString(text));

    }
    public static String reverseString(String text){
        StringBuilder reverse = new StringBuilder();
        for(int i=text.length()-1;i>=0;i--){
            reverse.append(text.charAt(i));
        }

        return reverse.toString();
    }

}
