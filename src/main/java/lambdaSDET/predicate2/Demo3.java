package lambdaSDET.predicate2;

import java.util.function.Predicate;

// p1-- check nimber is even
// p2 --check greater than 50
public class Demo3 {
    public static void main(String[] args) {
        int [] a={5,15,20,25,30,35,40,45,50,55,60,65,80};
        Predicate<Integer> p1=i->i%2==0;
        Predicate<Integer> p2=i->i>50;

        //and
        System.out.println("foll0wing are numbers EVEN & greater than 50... ");
        for (int each:a) {
            if(p1.and(p2).test(each)) {             //if(p1.test(each)&&p2.test(each)){
                System.out.print(each+" ");
            }
        }

        //or
        System.out.println();
        System.out.println("following are numbers EVEN or greater than 50... ");
        for (int each:a) {
            if(p1.or(p2).test(each)) {             //if(p1.test(each)&&p2.test(each)){
                System.out.print(each+" ");
            }
        }

        //negate
        System.out.println();
        System.out.println("following are negate of even numbers ... ");
        for (int each:a) {
            if(p1.negate().test(each)) {             //if(p1.test(each)&&p2.test(each)){
                System.out.print(each+" ");
            }
        }


    }
}

