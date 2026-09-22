package problems;



public class Student {
    String name;
    int age;
    String course;
public Student(String name,int age,String course){
    this.name=name;
    this.age=age;
    this.course=course;
}
    public void displayDetails(){
        System.out.println("My name is "+ name + ". I am "+age+"years old."+ "I am studying "+course);
    }
}
