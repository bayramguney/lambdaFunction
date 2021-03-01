package lambdaSDET.stream6map;

import java.util.Arrays;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<String> vehicles= Arrays.asList("bus","car","bicyle","flight","train");

        vehicles.stream().map(s -> s.length()).forEach(len-> System.out.println(len));
      //  vehicles.stream().map(String::length).forEach(System.out::println);

    }
}
