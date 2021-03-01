package lambdaSDET.stream8ReduceCountLimitDistinct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("bus", "car", "bycle", "bus", "car", "car", "bike");


        List<String> distVehicles = vehicles.stream().distinct().collect(Collectors.toList());
        System.out.println("distVehicles = " + distVehicles);

        long count = vehicles.stream().distinct().count();
        System.out.println(count);

        List<String>limitedVehicle=vehicles.stream().limit(4).collect(Collectors.toList());
        System.out.println("limitedVehicle = " + limitedVehicle);

    }
}
