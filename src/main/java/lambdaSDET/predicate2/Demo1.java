package lambdaSDET.predicate2;

import java.util.function.Predicate;

public class Demo1 {
    public static void main(String[] args) {
        // Ex1
        Predicate<Integer> p = i -> (i > 10);     // predicate has just test method one parameter return boolean
        System.out.println(p.test(5));
        System.out.println(p.test(15));

        //Ex2 check the length of given string is greater than 4
        Predicate<String> st = s -> (s.length() > 4);
        System.out.println(st.test("Selam"));

        //Ex3
        String[] arr = {"David", "Scott", "John", "Mary"};
        for (String each:arr) {
            if(st.test(each)){
                System.out.print(each+" ");
            }
        }

    }
}
