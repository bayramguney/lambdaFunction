package lambdaSDET.function3;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
    String ename;
    int salary;

    public Employee(String ename, int salary) {
        this.ename = ename;
        this.salary = salary;
    }
}



public class Demo2 {
    public static void main(String[] args) {
        // given employee object checking the salary and calculating bonus .print them if bonus is > 5000

        ArrayList<Employee> emplist=new ArrayList<>();
        emplist.add(new Employee("David",50000));
        emplist.add(new Employee("john",30000));
        emplist.add(new Employee("Mary",20000));

        Function<Employee,Integer> fn=e->{
            int sal=e.salary;
            if(sal>=10000&& sal<=20000)
                return (sal*10/100);
            else if(sal>20000 && sal<=30000)
                return (sal*20/100);
            else if(sal>30000 && sal<=50000)
                return (sal*30/100);
            else
                return (sal*40/100);
        };

        Predicate<Integer> p=i->i>5000;

        for (Employee each:emplist) {
            int bonus = fn.apply(each);
            if (p.test(bonus)) {
                System.out.println(each.ename + " " + each.salary);
                System.out.println("Bonus is : " + bonus);
            }

        }
    }
}
