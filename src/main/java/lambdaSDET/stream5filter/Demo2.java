package lambdaSDET.stream5filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Melissa","Sansa","Jon","Daenery","Joffery");
        List<String> longnames=new ArrayList<>();

        longnames=names.stream().filter(s->(s.length()>5 && s.length()<8)).collect(Collectors.toList());
        System.out.println(longnames);
       // names.stream().filter(s->(s.length()>5 && s.length()<8)).forEach(System.out::println);
    }
}
