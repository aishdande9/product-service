package problems;


public class CountWords {
    public static void main(String[] args) {
        String sentence = "I am learning Java";
        String[] words = sentence.trim().split("\\s+");
        System.out.println(words.length);

    }
}