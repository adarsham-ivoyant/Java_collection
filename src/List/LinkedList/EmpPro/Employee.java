package List.LinkedList.EmpPro;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + '}';
    }

}

class LinkedListExample{
    public static void main(String[] args) {
        List<Employee> employees =new LinkedList<>();

        employees.add(new Employee("David", 28, 48000));
        employees.add(new Employee("Charlie", 35, 70000));
        employees.add(new Employee("Eve", 22, 45000));
        employees.add(new Employee("Alice", 30, 60000));
        employees.add(new Employee("Bob", 25, 50000));
        // Print the original list
        System.out.println("Original list:");
        printList(employees);

        //print using Stream API
        System.out.println("Print using stream API");
        employees.stream()
                .filter(employee -> employee.getAge() > 20 && employee.getAge() <30)
                .sorted((e1,e2) -> Double.compare(e1.getSalary(),e2.getSalary()))
                .forEach(System.out::println);
    }

    private static void printList(List<Employee> list) {
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }

}
