package lambdaSDET.stream6map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// multiple with 3 given list
public class Demo3 {
    public static void main(String[] args) {
        List<Integer> numberList= Arrays.asList(2,3,4,5);
        List<Integer> multiplesList= new ArrayList<>();

        numberList.stream().map(s->s*3).forEach(System.out::println);
      //  multiplesList=numberList.stream().map(s->s*3).collect(Collectors.toList());

    }
}
