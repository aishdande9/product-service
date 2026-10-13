package problems;

public class CountVowelsConsonents {
    public static void main(String[] args) {
        String vowels = "aeiou";
        String text = "Java is fun";


        int vowelCount = 0;
        int consonentCount = 0;
        char[] letter = text.toLowerCase().toCharArray();
        for(int i=0;i< letter.length;i++){
            if(vowels.indexOf(letter[i]) != -1){
                vowelCount++;

            }else{
                consonentCount++;

            }
        }
        System.out.println("vowelCount :"+vowelCount);
        System.out.println("consonentCount :"+consonentCount);
    }
}
