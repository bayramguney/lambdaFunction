package lambdaSDET.stream10Parallel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student{
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName(){
        return this.name;
    }
    public int getScore(){
        return this.score;
    }
}
public class Demo1 {
    public static void main(String[] args) {

        List<Student> studentlist= Arrays.asList(
                new Student("David",82),
                new Student("Bob",90),
                new Student("John",65),
                new Student("Canedy",55),
                new Student("Eric",85),
                new Student("Smith",88),
                new Student("Scott",50)
        );
//using stream
        studentlist.stream().filter(s->s.getScore()>80).limit(3).
                forEach(s-> System.out.println(s.getName()+" - "+s.getScore()));
        System.out.println("---------------------------");
//using parallel stream
        studentlist.parallelStream().filter(s->s.getScore()>80).limit(3).
                forEach(s-> System.out.println(s.getName()+" - "+s.getScore()));

        System.out.println("---------------------------");
        // convert stream()-----> parallel stream()
        studentlist.stream().parallel().filter(s->s.getScore()>80).limit(3).
                forEach(s-> System.out.println(s.getName()+" - "+s.getScore()));
    }
}
