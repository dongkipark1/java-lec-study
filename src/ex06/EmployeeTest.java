package ex06;

class PersonE {
    String name;

    public PersonE() {

    }

    public PersonE(String theName) {
        this.name = theName;
    }
}

class Employee extends PersonE {
    String id;

    public Employee() {
        super();
    }

    public Employee(String name) {
        super(name);
    }

    public Employee(String name, String id) {
        super(name);
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee [사원번호 = " + id + " 이름 = " + name + "]";
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e = new Employee("kim", "20210001");
        System.out.println(e);
    }
}
