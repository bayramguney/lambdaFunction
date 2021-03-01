package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.flipkart.com/");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.amazon.in/");

        Set<String> windowsids=driver.getWindowHandles();
        windowsids.forEach(s-> System.out.println(driver.switchTo().window(s).getTitle()));

      driver.quit();

    }
}
