package TestData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.List;

public class TestData {
    //Variables
    static public String url = "https://os-system.com";
    static public String url2 = "https://ossystem.ua/";
    static public WebDriver driver = new ChromeDriver();

//    static public WebDriver driver = new FirefoxDriver();
    static public WebDriverWait wait = new WebDriverWait(driver, 10);
    public String fullName = "Dmytro Boyev";
    public String skype = "d.boev.ossystem@ossystem.com.ua";
    public String yourMessage = "Hello, we wanted to order your company for a big project";
    public String email = "dmytro@gmail.com";
    public String companyName = "Terminator & Friends";
    public String phone = "1234455";
    public String contactPhoneEuro = "+49 8124 4436 255";
    public String contactPhoneUsa = "+1 888 572 75 39";
    public String contactPhoneUkraine = "+38 050 400 59 93";
    public String officeEmail = "office@os-system.com";
    public String resumeUrl = "https://ossystem.ua/hello";



    //Test Methods

    public static WebElement findElement (String xPath) {
        return driver.findElement(By.xpath(xPath));
    }

    public static WebElement waitForElementVisibility (String xPath){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPath)));
    }

    public static List<WebElement> findAllElements (String xPath) {
        return driver.findElements(By.xpath(xPath));
    }

    public static List<WebElement> waitForAllElementsVisibility (String xPath) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xPath)));
    }

    public static Boolean waitForElementInvisibility (String xPath) {
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xPath)));
    }
}
