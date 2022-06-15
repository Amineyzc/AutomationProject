import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Project {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/amineileri/Documents/broweserDrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.navigate().to("http://qa-duotify.us-east-2.elasticbeanstalk.com/register.php");

        String actualTitle = driver.getTitle();
        String expecteedTitle = "Welcome to Duotify!";
        Assert.assertEquals(actualTitle,expecteedTitle);

        String currentUrl = driver.getCurrentUrl();
        System.out.println("The current URL is" + currentUrl);
        driver.findElement(By.id("hideLogin")).click();

    }
}
