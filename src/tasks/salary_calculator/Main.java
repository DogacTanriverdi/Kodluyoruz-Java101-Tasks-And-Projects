package tasks.salary_calculator;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Kemal", 2000, 46, 1985);
        e1.printEmployeeInfo();

        Employee e2 = new Employee("Mahmut", 4000, 42, 2007);
        e2.printEmployeeInfo();
    }
}
