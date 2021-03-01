package lambdaSDET.expression1;
@FunctionalInterface
interface Cab
{
    public void bookCab();
}


public class Test1 {
    public static void main(String[] args) {
        Cab cab=()-> System.out.println("Ola cab is booked..");
        cab.bookCab();


    }
}
