import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyURL {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/amineileri/Documents/broweserDrivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://qa-duotify.us-east-2.elasticbeanstalk.com/register.php");

        String currentUrl = driver.getCurrentUrl();
        System.out.println("The current URL is" + currentUrl);


    }
}
