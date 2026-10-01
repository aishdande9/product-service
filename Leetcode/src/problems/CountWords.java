package problems;


public class CountWords {
    public static void main(String[] args) {
        String sentence = "I love Java";


        String[] words = sentence.split("  ");
for(int i= words.length-1;i>=0;i--){
    System.out.print(words[i]);


}

    }
}