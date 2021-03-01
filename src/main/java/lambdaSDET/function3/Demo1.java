package lambdaSDET.function3;

import jdk.nashorn.internal.ir.FunctionCall;

import java.util.function.Function;

//function has one method apply()  return anytype one  Function<Accepttype,Returntype>
public class Demo1 {
    public static void main(String[] args) {
        Function<Integer,Integer> f=i->i*i;
        System.out.println(f.apply(5));
        System.out.println(f.apply(13));

        //String --length--int
        Function<String,Integer> fn=i->i.length();
        System.out.println(fn.apply("Welcome"));    // get the lenght of welcome

    }
}
