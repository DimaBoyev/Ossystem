package WebSitesTest;
import TestData.TestData;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class OssystemMainPageTest extends TestData {

    @BeforeClass

    public static void BeforeClassMethod () {
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Test
    //ESTIMATE PROJECT button, ESTIMATE PROJECT form
    public void testMethod1 () {
        TestData.waitForElementVisibility("//img[@class='logo']");
        TestData.waitForElementVisibility("//a[@class='btn'] ").click();
        TestData.waitForElementVisibility("//form/div[1]/div[1]/input").sendKeys(fullName);
        TestData.findElement("//form/div[2]/div[1]/input").sendKeys(skype);
        TestData.findElement("//form/div[3]/div[1]/select").click();
        TestData.findElement("//form/div[3]/div[1]/select/option[3]").click();
        TestData.findElement("//form/div[4]/div[1]/textarea").sendKeys(yourMessage);
        TestData.findElement("//form/div[1]/div[2]/input").sendKeys(email);
        TestData.findElement("//form/div[2]/div[2]/input").sendKeys(companyName);
        TestData.findElement("//select[@name='budget']").click();
        TestData.findElement("//select[@name='budget']/option[5]").click();
        TestData.findElement("//select[@name='youAre']").click();
        TestData.findElement("//select[@name='youAre']/option[5]").click();
        TestData.findElement("//input[@name='submit']").click();
        String captcha = TestData.waitForElementVisibility("//span[@class='captcha-msg']").getText();
        Assert.assertEquals("Wrong CAPTCHA", captcha);
        System.out.println("The ESTIMATE PROJECT button clickable, contact form functional");
    }

    @Test
    //Contact us button and contact us form
    public void testMethod2 () {
        TestData.waitForElementVisibility("//a[@id='contact']").click();
        TestData.waitForElementVisibility("//input[@name='name']").sendKeys(fullName);
        TestData.findElement("//input[@name='email']").sendKeys(email);
        TestData.findElement("//div[@class='input-group']/div/button").click();
        TestData.waitForElementVisibility("//ul/li[5]").click();
        TestData.findElement("//div[@class='input-group']/input").sendKeys(phone);
        TestData.findElement("//textarea[@class='message-field']").sendKeys(yourMessage);
        TestData.findElement("//input[@name='submit']").click();
        String captcha = TestData.waitForElementVisibility("//span[@class='captcha-msg']").getText();
        Assert.assertEquals("Wrong Captcha", captcha);
        System.out.println("Contact us button clickable, contact us form functional");
    }

    @Test
    //Footer
    public void testMethod3 () {
        String phoneEuro = TestData.waitForElementVisibility("//div[@class='links-container footer-numbers']/ul/li[1]/a/span").getText();
        Assert.assertEquals(phoneEuro, contactPhoneEuro);
        String phoneUsa = TestData.waitForElementVisibility("//div[@class='links-container footer-numbers']/ul/li[2]/a/span").getText();
        Assert.assertEquals(phoneUsa, contactPhoneUsa);
        String phoneUkraine = TestData.waitForElementVisibility("//div[@class='links-container footer-numbers']/ul/li[3]/a/span").getText();
        Assert.assertEquals(phoneUkraine, contactPhoneUkraine);
        String email = TestData.waitForElementVisibility("//div[@class='links-container footer-numbers']/ul/li[4]/a/span").getText();
        Assert.assertEquals(email, officeEmail);
        System.out.println("Footer contacts available and correct");
    }

    @Test
    //Services tab
    public void testMethod4 () {
        TestData.waitForElementVisibility("//nav/div/div/div[2]/div[1]/a[1]").click();
        String section = TestData.waitForElementVisibility("//section[@class='services-header undefined']/div/div/h1").getText();
        Assert.assertEquals("Services", section);
        TestData.findElement("//a[@id='contact']").click();
        TestData.waitForElementVisibility("//input[@name='name']").sendKeys(fullName);
        TestData.findElement("//input[@name='email']").sendKeys(email);
        TestData.findElement("//div[@class='input-group']/div/button").click();
        TestData.waitForElementVisibility("//ul/li[5]").click();
        TestData.findElement("//div[@class='input-group']/input").sendKeys(phone);
        TestData.findElement("//textarea[@class='message-field']").sendKeys(yourMessage);
        TestData.findElement("//input[@name='submit']").click();
        String captcha = TestData.waitForElementVisibility("//span[@class='captcha-msg']").getText();
        Assert.assertEquals("Wrong Captcha", captcha);
        System.out.println("Services tab available, Contact us button clickable, contact us form functional");
    }

    @Test
    //Portfolio tab
    public void testMethod5 () {
        TestData.waitForElementVisibility("//nav/div/div/div[2]/div[1]/a[2]").click();
        String section = TestData.waitForElementVisibility("//section[@class='portfolio-header-container']/div/div/h1").getText();
        Assert.assertEquals("Portfolio", section);
        TestData.findElement("//a[@id='contact']").click();
        TestData.waitForElementVisibility("//input[@name='name']").sendKeys(fullName);
        TestData.findElement("//input[@name='email']").sendKeys(email);
        TestData.findElement("//div[@class='input-group']/div/button").click();
        TestData.waitForElementVisibility("//ul/li[5]").click();
        TestData.findElement("//div[@class='input-group']/input").sendKeys(phone);
        TestData.findElement("//textarea[@class='message-field']").sendKeys(yourMessage);
        TestData.findElement("//input[@name='submit']").click();
        String captcha = TestData.waitForElementVisibility("//span[@class='captcha-msg']").getText();
        Assert.assertEquals("Wrong Captcha", captcha);
        System.out.println("Portfolio tab available, Contact us button clickable, contact us form functional");
    }

    @Test
    //Partners tab
    public void testMethod6 () {
        TestData.waitForElementVisibility("//nav/div/div/div[2]/div[1]/a[3]").click();
        String section = TestData.waitForElementVisibility("//section[@class='stack']/span/section/div/div/h1").getText();
        Assert.assertEquals("Technology Partners & Community", section);
        TestData.findElement("//a[@id='contact']").click();
        TestData.waitForElementVisibility("//input[@name='name']").sendKeys(fullName);
        TestData.findElement("//input[@name='email']").sendKeys(email);
        TestData.findElement("//div[@class='input-group']/div/button").click();
        TestData.waitForElementVisibility("//ul/li[5]").click();
        TestData.findElement("//div[@class='input-group']/input").sendKeys(phone);
        TestData.findElement("//textarea[@class='message-field']").sendKeys(yourMessage);
        TestData.findElement("//input[@name='submit']").click();
        String captcha = TestData.waitForElementVisibility("//span[@class='captcha-msg']").getText();
        Assert.assertEquals("Wrong Captcha", captcha);
        System.out.println("Partners tab available, Contact us button clickable, contact us form functional");
    }

    @Test
    //Company tab
    public void testMethod7 () {
        TestData.waitForElementVisibility("//nav/div/div/div[2]/div[1]/a[4]").click();
        String section = TestData.waitForElementVisibility("//section[@class='company-about-header']/div/div/h1").getText();
        Assert.assertEquals("About us", section);
        TestData.findElement("//a[@id='contact']").click();
        TestData.waitForElementVisibility("//input[@name='name']").sendKeys(fullName);
        TestData.findElement("//input[@name='email']").sendKeys(email);
        TestData.findElement("//div[@class='input-group']/div/button").click();
        TestData.waitForElementVisibility("//ul/li[5]").click();
        TestData.findElement("//div[@class='input-group']/input").sendKeys(phone);
        TestData.findElement("//textarea[@class='message-field']").sendKeys(yourMessage);
        TestData.findElement("//input[@name='submit']").click();
        String captcha = TestData.waitForElementVisibility("//span[@class='captcha-msg']").getText();
        Assert.assertEquals("Wrong Captcha", captcha);
        System.out.println("Partners tab available, Contact us button clickable, contact us form functional");
    }

}
