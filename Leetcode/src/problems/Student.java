package problems;



public class Student {
    private String name;
    private int age;
    private String course;
public Student(String name,int age,String course){
    this.name=name;
    this.age=age;
    this.course=course;
}
    public void displayDetails(){
        System.out.println("My name is "+ name + ". I am "+age+"years old."+ "I am studying "+course);
    }

    public String getName(){
    return this.name;
    }


    public int getAge(){
    return this.age;
    }

    public String getCourse(){
return this.course;
}

public void setCourse(String course){
    this.course = course;
}
}


