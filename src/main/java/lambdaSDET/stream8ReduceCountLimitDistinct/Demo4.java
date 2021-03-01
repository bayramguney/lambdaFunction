package lambdaSDET.stream8ReduceCountLimitDistinct;

import java.util.Arrays;
import java.util.List;
//toArray()
public class Demo4 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("A", "B", "C", "1", "2", "3");
        Object[] arr = stringList.stream().toArray();

        for (Object each : arr) {
            System.out.println(each);
        }

    }
}
