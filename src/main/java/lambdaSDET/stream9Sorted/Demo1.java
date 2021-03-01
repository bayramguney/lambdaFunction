package lambdaSDET.stream9Sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//sorted
public class Demo1 {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(2, 4, 1, 3, 7, 5, 9);
        List<Integer>sortedlist1=list1.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedlist1);   //Ascending order

        List<Integer>sortedlist2=list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedlist2);   //Descending order

        List<String>list2= Arrays.asList("John","Mary","Kim","David","Smith");
        List<String>sortedlist3=list2.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedlist3);    //Ascending




    }
}