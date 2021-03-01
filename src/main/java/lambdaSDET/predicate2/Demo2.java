package lambdaSDET.predicate2;

import java.util.function.Predicate;

class Employee {
    String ename;
    int salary;
    int experience;
    Employee(String name,int sal,int exp){
        ename=name;
        salary=sal;
        experience=exp;
    }

}

public class Demo2 {
    public static void main(String[] args) {
        // emp obj--> return name if sal>40000 exp>3
        Employee emp1=new Employee("John",50000,5);
        Employee emp2=new Employee("Mary",40000,5);
        Employee emp3=new Employee("Harry",50000,3);
        Employee [] employee={emp1,emp2,emp3,new Employee("Hasan",60000,6)};

        Predicate<Employee> pr=(e->e.salary>40000 && e.experience>3);
        for (Employee each:employee) {
            if(pr.test(each)){
                System.out.println(each.ename+" "+each.salary);
            }
        }




    }
}
