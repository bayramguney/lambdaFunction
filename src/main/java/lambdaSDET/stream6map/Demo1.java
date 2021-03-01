package lambdaSDET.stream6map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
        List<String> vehicles= Arrays.asList("bus","car","bicyle","flight","train");
        List<String>vehicleListUppercase=new ArrayList<>();
        vehicleListUppercase=vehicles.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
      //  vehicleListUppercase=vehicles.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(vehicleListUppercase);
    }
}
