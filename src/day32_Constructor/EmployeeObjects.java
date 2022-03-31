package day32_Constructor;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Aoran");

        Employee employee2 = new Employee("Yulia",'F');

        Employee employee3 = new Employee("Asu",'F',"Developer");

        Employee employee4 = new Employee("Omer",'M',"SDET",8000);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
    }
}
