package problems;

public class StudentMain {
    public static void main(String[] args) {
        Student s = new Student("Aishwarya",37,"Java full stack");
        s.displayDetails();

        System.out.println(s.getName());
        System.out.println(s.getAge());
        s.setCourse("python");
        System.out.println(s.getCourse());
    }
}
