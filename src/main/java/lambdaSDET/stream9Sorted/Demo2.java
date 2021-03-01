package lambdaSDET.stream9Sorted;

import java.util.HashSet;
import java.util.Set;

//anyMatch , allMatch , noneMatch
public class Demo2 {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("One apple");
        fruits.add("One mango");
        fruits.add("Two apples");
        fruits.add("More grapes");
        fruits.add("Two guavas");
        //anyMatch
        boolean result = fruits.stream().anyMatch(s -> s.startsWith("Two"));
        System.out.println(result);

        //allMatch
        boolean result1 = fruits.stream().allMatch(s -> s.startsWith("Two"));
        System.out.println(result1);

        //noneMatch
        boolean result2 = fruits.stream().noneMatch(s -> s.startsWith("Two"));
        System.out.println(result2);

    }
}
