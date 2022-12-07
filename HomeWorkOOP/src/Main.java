import Employee.Employee;

public class Main {
    public static void main(String[] args) {
        String name;
        String position;
        String email;
        String phoneNumber;
        int age;
        Employee empl1 = new Employee("Jenna Ortega", "Actress", "jenna.ortega@gmail.com", "+1424-3222-9331", 20);

        System.out.println("Employee name: " + empl1.getName());
        System.out.println("Employee position: " + empl1.getPosition());
        System.out.println("Employee email: " + empl1.getEmail());
        System.out.println("Employee phoneNumber: " + empl1.getPhoneNumber());
        System.out.println("Employee age: " + empl1.getAge());
    }
}
