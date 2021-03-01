package lambdaSDET.stream9Sorted;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo4 {
    public static void main(String[] args) {
        List<String> animalList = Arrays.asList("Dog","Cat","elephant");
        List<String> birdList = Arrays.asList("Peacock","Parrot","Crow");

         Stream stream1=animalList.stream();
         Stream stream2=birdList.stream();

         List<String>finalList= (List<String>) Stream.concat(stream1,stream2).collect(Collectors.toList());

        for (String each:finalList) {
            System.out.println(each);
        }
    }
}
