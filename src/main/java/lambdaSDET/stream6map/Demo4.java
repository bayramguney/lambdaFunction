package lambdaSDET.stream6map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    int empId;
    String empName;
    int salary;

    public Employee(int empId, String empName, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }
}

public class Demo4 {
    public static void main(String[] args) {
// find the salaries are more than 20000

        List<Employee> employeeLIst = Arrays.asList(
                new Employee(101, "Alex", 10000),
                new Employee(102, "Brian", 20000),
                new Employee(103, "Charles", 30000),
                new Employee(104, "David", 40000),
                new Employee(105, "Edward", 50000));

    List<Integer>employeeSalaryList= employeeLIst.
            stream().
            filter(s -> s.salary > 20000).
            map(s -> s.salary).
            collect(Collectors.toList());
        System.out.println(employeeSalaryList);
    }
}
