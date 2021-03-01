package lambdaSDET.stream5filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo3 {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("cup",null,"forest","sky","book",null,"theatre");
        List<String>result=new ArrayList<>();

        result=words.stream().filter(s->s!=null).collect(Collectors.toList());
       // result=words.stream().filter(Objects::nonNull).collect(Collectors.toList());

        System.out.println(result);    //    [cup, forest, sky, book, theatre]

    }
}
