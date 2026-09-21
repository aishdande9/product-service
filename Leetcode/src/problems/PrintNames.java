package problems;

public class PrintNames {
    public static void main(String[] args) {
        System.out.println(introduceYourself());
    }

    public static String introduceYourself(){
        String name = "Aishwarya";
        String city = "stlouis";
        int yearsOfExperience = 4;
        boolean isLearningJava = true;
String printName =  "My name is " + name +
        ". I live in " + city +
        ". I have " + yearsOfExperience + " years of experience" +
        ". Am I learning Java? " + isLearningJava;

if(isLearningJava) {
    return printName + name + "is currently learning java";
}else{
    return printName + name + "is not learning java ";
}

    }
}
