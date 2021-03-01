package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.stream.Collectors;
// check if the books are sorted
public class Demo3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://demowebshop.tricentis.com/");
        driver.findElement(By.xpath("//ul[@class='top-menu']//a[normalize-space()='Books']")).click();  //Books

        Select sortbydrp = new Select(driver.findElement(By.id("products-orderby")));
        sortbydrp.selectByVisibleText("Name: A to Z");

        List<WebElement> product_items = driver.findElements(By.xpath("//h2[@class='product-title']"));
        List<String> beforeSort = product_items.stream().map(s -> s.getText()).collect(Collectors.toList());
        List<String> afterSort = product_items.stream().map(WebElement::getText).sorted().collect(Collectors.toList());

        if (beforeSort.equals(afterSort)) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }

        driver.quit();
    }
}
