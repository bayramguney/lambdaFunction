package lambdaSDET.consumer4;

import java.util.function.Consumer;

// consumer has accept metod takes input but no return
public class Demo1 {
    public static void main(String[] args) {
        Consumer<String>c=s-> System.out.println(s);
        c.accept("Welcome");

    }
}
