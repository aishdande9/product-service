package problems;

public class FindLongestWord {
    public static void main(String[] args) {
        String sentence = "I am learning programming";
        System.out.println(findLongestWord(sentence));
    }

    public static String findLongestWord(String sentence){
        String[] word = sentence.split(" ");
String  longest = word[0];

for(int i=0;i<word.length;i++){
    if(word[i].length()>longest.length()){
       longest = word[i] ;
    }
}

return longest;
    }
}
