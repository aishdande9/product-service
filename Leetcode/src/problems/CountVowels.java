package problems;

public class CountVowels {
    public static void main(String[] args) {
        String name = "Aishwarya";
        System.out.println(vowelCount(name));
    }

    public static int vowelCount(String name){
        String vowel = "aeiou";
        int count = 0;
        for(int i=0;i<name.length();i++){
            if(vowel.indexOf(name.charAt(i)) != -1){
                count++;

            }

        }

        return count;
    }
}
