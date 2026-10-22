package problems;

import java.util.Arrays;

public class AreAnagrams {
    public static void main(String[] args) {
        System.out.println(areAnagrams("listen", "silent"));
        System.out.println(areAnagrams("java", "react"));
    }

    public static boolean areAnagrams(String first, String second) {
        first = first.toLowerCase();
        second = second.toLowerCase();

        if (first.length() != second.length()) {
            return false;
        }

        char[] letter1 = first.toCharArray();
        Arrays.sort(letter1);
        char[] letter2 = second.toCharArray();
        Arrays.sort(letter2);
        for (int i = 0; i < letter1.length; i++) {
            for (int j = 0; j < letter2.length; j++) {
                if (letter1[i] == letter2[j]) {
                    return Arrays.equals(letter1, letter2);
                }
            }
        }
        return false;
    }
}
