package lambda01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LambdaWithInt {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(9);
        list.add(13);
        list.add(4);
        list.add(9);
        list.add(2);
        list.add(4);
        list.add(12);
        list.add(15);
        printEvenElements1(list);
        System.out.println();
        printEvenElements2(list);
        System.out.println();
        printEvenElements3(list);
        System.out.println();
        printEvenElements4(list);
        System.out.println();
        getSquare1(list);
        System.out.println();
        getSquare2(list);
        System.out.println();
        System.out.println("getSum1(list) = " + getSum1(list));
        System.out.println();
        System.out.println("getSum2(list) = " + getSum2(list));
        System.out.println();
        System.out.println("getSum3(list) = " + getSum3(list));   // Optional[556]
        System.out.println();
        System.out.println("getSum4(list) = " + getSum4(list));   // Optional[556]
        System.out.println();
        System.out.println("getMaxEl1(list) = " + getMaxEl1(list));
        System.out.println();
        System.out.println("getMaxEl2(list) = " + getMaxEl2(list));
        System.out.println();
        System.out.println("getMaxEl3(list) = " + getMaxEl3(list));
        System.out.println();
        System.out.println("getMinEl1(list) = " + getMinEl1(list));
        System.out.println();
        System.out.println("getMinEl2(list) = " + getMinEl2(list));
        System.out.println();
        System.out.println("getEvenSquaresRevSorted1() = " + getEvenSquaresRevSorted1(list));
        System.out.println();
        System.out.println("getEvenSquaresRevSorted2() = " + getEvenSquaresRevSorted2(list));

    }
    /*
    1)Use "Structured Programming"
      Create a method to print the even list elements on the console in the same line
      with a space between two consecutive elements.
 */
    public static void printEvenElements1(List<Integer> list){

        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i)%2==0){
                System.out.print(list.get(i)+" ");
            }
        }
    }

    /*
    Use “Functional Programming”
	Create a method to print the even list elements on the console in the same line
	with a space between two consecutive elements.
     */

    //1st Way: By using lambda expression
    public static void printEvenElements2(List<Integer> list){
        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t +" "));
    }

    //2nd Way: By using Method Reference, use Java methods
    //Note:Method Reference ==> Class Name :: Method Name
    public static void printEvenElements3(List<Integer> list){
        list.stream().filter(t->t%2==0).forEach(System.out::print);
    }

    //3rd Way: By using Method Reference, use your own methods
    public static void printEvenElements4(List<Integer> list){
        list.stream().filter(LambdaWithInt::getEven).forEach(LambdaWithInt::getPrint);
    }
    public static void getPrint(int a){
        System.out.print(a+" ");
    }
    public static boolean getEven(int a){
        return a%2==0;
    }
/*
 Use “Functional Programming”
            2)Create a method to print the squares of every odd element on the console in the same line with a space between two consecutive elements.

 */
    //1st Way: By using lambda expression
    public static void getSquare1(List<Integer> list ){
        list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+" "));
    }
    //2nd Way: By using Method Reference, use your own methods
    public static void getSquare2(List<Integer> list ){
        list.stream().filter(LambdaWithInt::getOdd).map(LambdaWithInt::getsquare).forEach(LambdaWithInt::getPrint);
    }
    public static int getsquare(int a){
        return a*a;
    }
    public static boolean getOdd(int a){
        return a%2!=0;
    }
    /*
    Use “Functional Programming”
	 3)Create a method to find the sum of the square of all add elements in the given list
     */

    //solve by using "Structured Programming"
    public static int getSum1(List<Integer> list){
      int sum=0;
        for (Integer w:list) {
            if(w%2!=0) {
                sum = sum + (w * w);
            }
        }
        return sum;
    }

    //Solve by using "functional Programing"
    //1st way by using lambda expression
    public static int getSum2(List<Integer> list){
        return list.stream().filter(LambdaWithInt::getOdd).map(LambdaWithInt::getsquare).reduce(0,(x,y)->(x+y));
    }
    // 2nd way  by using Method reference ,use java Math methods in reduce()
    public static Optional<Integer> getSum3(List<Integer> list){
        return list.stream().filter(LambdaWithInt::getOdd).map(LambdaWithInt::getsquare).reduce(Math::addExact);
    }
    public static Optional<Integer> getSum4(List<Integer> list){
        return list.stream().filter(LambdaWithInt::getOdd).map(LambdaWithInt::getsquare).reduce(Integer::sum);
    }

    /*
    Use “Functional Programming”
	 4)Create a method to find the maximum value from the list

     */

    //1st way by using lambda expression
    public static Optional<Integer> getMaxEl1(List<Integer> list){
        return list.stream().reduce((x,y)->x>y ? x:y);
    }

    public static Optional<Integer> getMaxEl2(List<Integer> list){
      //  return list.stream().reduce(Math::max);     same with other method
        return list.stream().reduce(Integer::max);
    }
/*
Use “Functional Programming”
	 5)Create a method to find the maximum value by using sort()
 */

    public  static Optional<Integer> getMaxEl3(List<Integer> list){
     return    list.stream().sorted().reduce((x,y)->y);    // sorted() is ascebding order
    }
 /*
    Use “Functional Programming”
            5)Create a method to find the maximum value by using sort()
 */

    public  static Optional<Integer> getMinEl1(List<Integer> list){
        return    list.stream().sorted().reduce((x,y)->2);    // sorted() is ascending order
    }
    public  static Optional<Integer> getMinEl2(List<Integer> list){
        return    list.stream().sorted().findFirst();
    }

    /*
    Use “Functional Programming”
	6)Create a method to print the squares of even list elements in reverse order.
	   Print the repeated elements just once.
     */
    public static List<Integer> getEvenSquaresRevSorted1(List<Integer> list){
    return list.
            stream().
            filter(LambdaWithInt::getEven).
            map(LambdaWithInt::getsquare).
            sorted(Comparator.reverseOrder()).
            collect(Collectors.toList());
    }
    //Eliminates the repeated items
    public static List<Integer> getEvenSquaresRevSorted2(List<Integer> list){
        return list.
                stream().
                distinct().
                filter(LambdaWithInt::getEven).
                map(LambdaWithInt::getsquare).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
    }

   }
