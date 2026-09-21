package problems;

public class FindLevel {
    public static void main(String[] args) {

        System.out.println(findJavaLevel(75));
    }


    public static String findJavaLevel(int javaKnowledge){
        if(javaKnowledge >= 80){
            return "Advanced";
        }else if(javaKnowledge >= 50){
            return "Intermediate";

        }else{
            return "Beginner";
        }
    }
}
