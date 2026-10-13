package problems;

public class CaptializeWords {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] word = sentence.trim().split("\\s+");

        StringBuilder result = new StringBuilder();
        String captialize = "";

        for(int i=0;i<word.length;i++){
         String currentWord = word[i];

captialize =currentWord.substring(0,1).toUpperCase()+currentWord.substring(1);

            result.append(captialize);
            if (i < word.length - 1) {
                result.append(" ");
            }

        }


        System.out.println(result);


    }
}
