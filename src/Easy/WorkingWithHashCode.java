package Easy;

import java.util.Objects;

public class WorkingWithHashCode {

    private final int id;
    private final String name;
    private final int age;
    private final long salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }

    public WorkingWithHashCode(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkingWithHashCode that = (WorkingWithHashCode) o;
        return that.getId() == getId() && that.getSalary() == getSalary();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, salary);
    }
}

class RunnerForHashCode {
    public static void main(String[] args) {
        WorkingWithHashCode[] empArr = new WorkingWithHashCode[4];
        empArr[0] = new WorkingWithHashCode(10, "Mikey", 25, 10000);
        empArr[1] = new WorkingWithHashCode(10, "Arun", 25, 10000);
        empArr[2] = new WorkingWithHashCode(5, "Lisa", 35, 5000);
        empArr[3] = new WorkingWithHashCode(1, "Pankaj", 32, 50000);

        for (int i = 0; i < empArr.length - 1; i++) {
            System.out.println(empArr[i].getName() + " > " + empArr[i].hashCode());
            if (empArr[i].equals(empArr[i + 1])) {
                System.out.println(empArr[i].getName());
            }
        }

    }
}
