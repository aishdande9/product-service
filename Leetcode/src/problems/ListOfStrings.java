package problems;

import java.util.ArrayList;

public class ListOfStrings {
    public static void main(String[] args) {

        ArrayList<String> skills = new ArrayList<String>();
        skills.add("java");
        skills.add("springboot");
        skills .add("react");
        skills .add("sql");

        System.out.println(skills.get(1));
        skills.set(2,"javascript");
        System.out.println(skills.contains("java"));
        skills.remove("sql");
        System.out.println(skills.size());


     for(int i=0;i< skills.size();i++){
         System.out.println(skills.get(i));
     }






        }

    }

