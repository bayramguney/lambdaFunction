package lambdaSDET.function3;

import java.util.function.Function;

// function chaining     andThen()-compose()
public class Demo3 {
    public static void main(String[] args) {
        Function<Integer,Integer> f1=n->n*2;
        Function<Integer,Integer> f2=n->n*n*n;

        System.out.println(f1.andThen(f2).apply(2));   // first 4  after 4 * 4 * 4

        System.out.println(f1.compose(f2).apply(2));   // first 2 * 2 * 2  after  2*8     reverse of andThen()



    }
}
