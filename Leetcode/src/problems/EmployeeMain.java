package problems;

public class EmployeeMain {
    public static void main(String[] args) {
        Developer developer = new Developer("Aishwarya", 80000, "Java");
        Manager manager =
                new Manager("John", 100000, 6);

        Employee[] employees = {developer,manager};

       for(Employee emp:employees){
           System.out.println(emp.getName()+" : $"+emp.calculateBonus(emp.getSalary()));
       }
    }
}
