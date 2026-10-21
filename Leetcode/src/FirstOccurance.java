
import java.util.HashSet;

public class FirstOccurance {
    public static void main(String[] args) {
        String text = "programming";
        System.out.println(removeDuplicates(text));
    }

    public static String removeDuplicates(String text) {


        HashSet<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();


        for (int i = 0; i < text.length(); i++) {
            if (!seen.contains(text.charAt(i))) {
                seen.add(text.charAt(i));
                result.append(text.charAt(i));
            }
        }
return result.toString();
    }
}
