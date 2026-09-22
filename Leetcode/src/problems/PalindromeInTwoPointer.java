package problems;

public class PalindromeInTwoPointer {
    public static void main(String[] args) {
        String word = "madam";
        System.out.println(isPalindrome(word));

    }

    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;


            }


            left++;
            right--;
        }
        return true;
    }
}
