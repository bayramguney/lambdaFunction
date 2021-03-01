package lambdaSDET.stream8ReduceCountLimitDistinct;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo2 {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
         //count()
        long numofEven = numbersList.stream().filter(s -> s % 2 == 0).count();
        System.out.println("num = " + numofEven);
        //min()
        Optional<Integer> min = numbersList.stream().min((x, y) -> x > y ? y : x);
        System.out.println("min = " + min);
        //max()
        Optional<Integer> max = numbersList.stream().max((x, y) -> x < y ? y : x);
        System.out.println("max = " + max);


    }
}
