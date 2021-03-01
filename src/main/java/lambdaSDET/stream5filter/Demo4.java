package lambdaSDET.stream5filter;

import java.util.ArrayList;
import java.util.List;

class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}


public class Demo4 {
    public static void main(String[] args) {
        List<Product> productList=new ArrayList<>();
        productList.add(new Product(1,"Hp Laptop",25000));
        productList.add(new Product(2,"Dell Laptop",30000));
        productList.add(new Product(3,"Lenova Laptop",28000));
        productList.add(new Product(4,"Sony Laptop",23000));
        productList.add(new Product(5,"Apple Laptop",90000));

        productList.stream().filter(s->s.price>25000).forEach(s-> System.out.println(s.name+"=== "+s.price));


    }
}
