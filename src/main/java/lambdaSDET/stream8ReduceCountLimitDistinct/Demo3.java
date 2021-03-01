package lambdaSDET.stream8ReduceCountLimitDistinct;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
//reduce tek bir parametre return verir.
public class Demo3 {
    public static void main(String[] args) {
        List<String> stringList  = Arrays.asList("A","B","C","1","2","3");

      Optional<String> reduced =stringList.stream().reduce((x, y)->y+x);   //tersten birlestir
        System.out.println("reduced = " + reduced);
    }
}
