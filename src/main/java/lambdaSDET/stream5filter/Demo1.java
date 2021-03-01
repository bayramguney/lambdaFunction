package lambdaSDET.stream5filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(10,15,20,25,30);
        List<Integer> evenNumberList=new ArrayList<>();

       // numbers.stream().filter(s->s%2==0).forEach(evenNumberList::add);
        numbers.stream().filter(s->s%2==0).forEach(n-> System.out.println(n));
   //     numbers.stream().filter(s->s%2==0).forEach(System.out::println);


        //  evenNumberList=numbers.stream().filter(s->s%2==0).collect(Collectors.toList()); [10,20,30]




    }
}
