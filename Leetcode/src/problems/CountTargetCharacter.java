package problems;

public class CountTargetCharacter {
    public static void main(String[] args) {
String text = "Aishwarya";
char target = 'a';
        System.out.println(countCharacter(text,target));
    }

    public static int countCharacter(String text, char target){

        int count = 0;
      char[] letter = text.toLowerCase().toCharArray();
      target = Character.toLowerCase(target);
      for(int i=0;i<letter.length;i++){
          if(letter[i] == target){

              count++;
          }
      }

      return count;
    }
}
