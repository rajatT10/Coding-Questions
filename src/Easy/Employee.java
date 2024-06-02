package Easy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee implements Comparable<Employee>{

    private int id;
    private String name;
    private int age;
    private int salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.age, o.age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public int hashCode(){
        return 1;
    }

    public boolean equals(Object obj){
        return true;
    }
}



class Runner {
    public static void main(String[] args) {
        Employee[] empArr = new Employee[4];
        empArr[0] = new Employee(10, "Mikey", 25, 10000);
        empArr[1] = new Employee(20, "Arun", 35, 20000);
        empArr[2] = new Employee(5, "Lisa", 35, 5000);
        empArr[3] = new Employee(1, "Pankaj", 25, 50000);
        Arrays.sort(empArr);
        Arrays.stream(empArr).forEach(System.out::println);

        Map<Integer, List<Employee>> result = Arrays.stream(empArr).collect(Collectors.groupingBy(Employee::getAge));
        System.out.println(result);
    }
}