package lambdaSDET.stream7flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    String sname;
    int sid;
    char grade;

    public Student(String sname, int sid, char grade) {
        this.sname = sname;
        this.sid = sid;
        this.grade = grade;
    }
}
public class Demo3 {
    public static void main(String[] args) {
        List<Student> studentlist1=new ArrayList<>();
        studentlist1.add(new Student("Smith",101,'A'));
        studentlist1.add(new Student("John",102,'B'));
        studentlist1.add(new Student("Kenny",103,'C'));

        List<Student> studentlist2=new ArrayList<>();
        studentlist2.add(new Student("Scott",104,'A'));
        studentlist2.add(new Student("Mary",105,'B'));
        studentlist2.add(new Student("Kitty",106,'C'));

        List<List<Student>>finalList= Arrays.asList(studentlist1,studentlist2);

        List<String>names=finalList.stream().flatMap(Collection::stream).map(s->s.sname+"-"+s.grade).collect(Collectors.toList());

        System.out.println(names);
    }
}
