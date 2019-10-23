package WebSitesTest;

import TestData.TestData;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class OssystemVacanciesTest extends TestData {

    @BeforeClass
    public static void beforeClassMethod () {
        driver.get(url2);
        driver.manage().window().maximize();
    }

    @Test
    //Vacancies button
    public void testMethod1 () {
        waitForElementVisibility("//ul/li[3]/span").click();
        String vacancies = waitForElementVisibility("//div[@class='headerSectionInnerCont']/h2/span").getText();
        Assert.assertEquals("Открытые вакансии", vacancies);
        findElement("//div[1][@class='vacanceCel']").click();
        String requirements = waitForElementVisibility("//div[@class='vacancy_detail__main']/p/u/strong").getText();
        Assert.assertEquals("Требования", requirements);
        System.out.println("Vacancies button clickable, vacancies available");
    }

    @Test
    //Send Resume Button
    public void testMethod2 () {
        waitForElementVisibility("//ul/li[3]/span").click();
        waitForElementVisibility("//div[@class='mainButtonContent displayBtn displayBtn2']/button").click();
        waitForElementVisibility("//input[@name='name']").sendKeys("Это тест!!!");
        findElement("//input[@name='email']").sendKeys(email);
        findElement("//textarea[@name='message']").sendKeys(yourMessage);
        findElement("//input[@name='cvLink']").sendKeys(resumeUrl);
        findElement("//div[@class='inputs']/div[3]/button").click();
        waitForElementVisibility("//div[@class='feedback']/button");
        System.out.println("CV sent");
    }

}

