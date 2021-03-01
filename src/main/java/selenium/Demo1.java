package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.stream.Collectors;

//find number of links in the page
//Print link texts from all the links
//Check how many links does not have href attribute(broken links)
public class Demo1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://demowebshop.tricentis.com/");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Number of the links present on the page = " + links.size());  //1

        links.forEach(link -> System.out.println(link.getText()));     //2

        long workinglinks = links.stream().filter(s -> s.getAttribute("href") != null).count();
        System.out.println("Working links number : " + workinglinks);
    }
}