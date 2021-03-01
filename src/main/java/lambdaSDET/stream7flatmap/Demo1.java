package lambdaSDET.stream7flatmap;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
        //map()
        List<Integer> list1= Arrays.asList(1,2,3,4,5,6);
        List<Integer> revList=list1.stream().map(s->s+10).collect(Collectors.toList());
        System.out.println(revList);

        //flatMap()
        List<Integer>ls1=Arrays.asList(1,2);
        List<Integer>ls2=Arrays.asList(3,4);
        List<Integer>ls3=Arrays.asList(5,6);
        List<List<Integer>>finalList=Arrays.asList(ls1,ls2,ls3);

        List<Integer>finalResult=finalList.stream().flatMap(s->s.stream()).map(s->s+10).collect(Collectors.toList());
     //   List<Integer>finalResult=finalList.stream().flatMap(Collection::stream).map(s->s+10).collect(Collectors.toList());

        System.out.println(finalResult);


    }
}
