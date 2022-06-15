
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TitleVerification {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/amineileri/Documents/broweserDrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa-duotify.us-east-2.elasticbeanstalk.com/register.php");


        String actualTitle = driver.getTitle();
        String expecteedTitle = "Welcome to Duotify!";
        Assert.assertEquals(actualTitle,expecteedTitle);
    }
}
