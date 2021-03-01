package lambdaSDET.consumer4;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
    String ename;
    int salary;
    String gender;

    public Employee(String ename, int salary, String gender) {
        this.ename = ename;
        this.salary = salary;
        this.gender = gender;
    }
}

// calculate the bonus after check bonus>2000 then print emp detail
public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Employee> emplist=new ArrayList<>();
        emplist.add(new Employee("David",50000,"Male"));
        emplist.add(new Employee("John",30000,"Male"));
        emplist.add(new Employee("Mary",20000,"FeMale"));
        emplist.add(new Employee("Scott",60000,"Male"));

        Function<Employee,Integer>f=emp->(emp.salary*10)/100;  //task1

        Predicate<Integer> p=b->b>2000;     // task2

        Consumer<Employee>c=emp->{         // task2
            System.out.println(emp.ename);
            System.out.println(emp.salary);
            System.out.println(emp.gender);
        };

        for (Employee each:emplist) {
            int bonus=f.apply(each);
            if(p.test(bonus)){
                c.accept(each);
                System.out.println("Employee Bonus : "+bonus);
                System.out.println("-------");
            }


        }

    }
}
