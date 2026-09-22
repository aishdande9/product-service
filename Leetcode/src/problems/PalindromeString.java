package problems;

public class PalindromeString {
    public static void main(String[] args) {
        String word = "madam";

        System.out.println(isPalindrome(word));
    }

    public static boolean isPalindrome(String word) {
        String rev = "";
        for (int i = 0; i < word.length(); i++) {
            rev = word.charAt(i) + rev;
        }

        return word.equals(rev);
    }
}
