package problems;

public class RemoveVowels {
    public static void main(String[] args) {
        String text = "Java Is Powerful";
        System.out.println(removeVowels(text));
    }

    public static String removeVowels(String text){
        String vowel = "aeiou";
char[] letter = text.toLowerCase().toCharArray();
StringBuilder result = new StringBuilder();
for(int i=0;i<letter.length;i++){
    if(vowel.indexOf(letter[i]) == -1){
        result.append(text.charAt(i));
    }
}

return result.toString();
    }
}
