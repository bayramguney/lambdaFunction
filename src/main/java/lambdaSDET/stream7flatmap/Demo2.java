package lambdaSDET.stream7flatmap;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
        List<String> teamA= Arrays.asList("Scott","David","John");
        List<String> teamB= Arrays.asList("Mary","Luna","Tom");
        List<String> teamC= Arrays.asList("Ken","Jony","Kitty");

        List<List<String>> playersInWorldCup=Arrays.asList(teamA,teamB,teamC);

        List<String> result=playersInWorldCup.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(result);

    }
}
