package problems;

public class RemoveAllVowels {
    public static void main(String[] args) {
        String sentence = "Java is fun";
        String vowel = "aeiou";
        StringBuilder result = new StringBuilder();
     char[] letter = sentence.toLowerCase().toCharArray();

     for(int i=0;i<letter.length;i++){
         if(vowel.indexOf(letter[i]) == -1){
            result.append(sentence.charAt(i));
         }
     }

        System.out.println(result);
    }
}
