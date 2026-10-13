package problems;

public class RemoveAllSpaces {
    public static void main(String[] args) {
        String sentence = "Java is fun";
        String[] word = sentence.trim().split("\\s+");
        for(int i =0;i<word.length;i++){
            System.out.print(word[i]);
        }

    }
}
