package lambdaSDET.stream9Sorted;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo3 {
    public static void main(String[] args) {
        List<String> stringList= Arrays.asList("one","two","three","one");
        //findAny
        Optional<String> ele=stringList.stream().findAny();
        System.out.println(ele);
        System.out.println(ele.get());

        //findFirst
        Optional<String> elem=stringList.stream().findFirst();
        System.out.println(elem);
        System.out.println(elem.get());


    }
}
