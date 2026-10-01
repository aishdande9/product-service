package problems;

public class CountCharacterType {
    public static void main(String[] args) {
        String text = "Java 17";
        int letterCount=0;
        int digitCount=0;
        int spacesCount=0;
        char[] letter = text.toCharArray();

        for (int i = 0; i < letter.length; i++) {
            char currentCharacter = letter[i];

            if(Character.isLetter(currentCharacter)){
                letterCount++;
            }else if(Character.isDigit(currentCharacter)){
                digitCount++;
            }else{
                spacesCount++;
            }

        }

        System.out.println("letterCount :"+ letterCount);
        System.out.println("digitCount :"+ digitCount);
        System.out.println("spacesCount :"+ spacesCount);
    }
}

