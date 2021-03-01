package lambdaSDET.expression1;

@FunctionalInterface
interface Cab2 {
    public String  bookCab(String source, String destination);

}

public class Test2 {
    public static void main(String[] args) {
        Cab2 cab = (x, y)->{
            System.out.println("Ola cab is booked from "+x+" To "+y);
            return ("Price : $250");
        };
        System.out.println(cab.bookCab("Hyd", "Mumbai"));

    }
}
