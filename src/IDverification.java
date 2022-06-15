import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDverification {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/amineileri/Documents/broweserDrivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://qa-duotify.us-east-2.elasticbeanstalk.com/register.php");

//        driver.findElement(By.name);
        driver.findElement(By.id("hideLogin")).click();



    }
}
