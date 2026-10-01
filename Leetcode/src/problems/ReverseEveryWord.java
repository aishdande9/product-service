package problems;

public class ReverseEveryWord {
    public static void main(String[] args) {
        String sentence = "Java is fun";
        String[] words = sentence.split(" ");
        System.out.println(words[0]);
        StringBuilder result = new StringBuilder();


        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];

            for (int j = currentWord.length() - 1; j >= 0; j--) {
                result.append(currentWord.charAt(j));
            }

            if(i< words.length-1){
                result.append(" ");
            }


        }
        System.out.println(result);
    }
}
//Input:"Java is fun";
//Expected output:"avaJ si nuf"
//Steps in plain English:we cannot change the value of the string because it is immutable,
// so we are coverting it ito string array
//Possible edge cases: