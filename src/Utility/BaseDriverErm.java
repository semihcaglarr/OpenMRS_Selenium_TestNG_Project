package Utility;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseDriverErm {
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public void startMethod(){
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        Tools.Wait(2);
        loginSite();
    }
    @AfterClass
    public void closeMethod(){
        Tools.Wait(3);;
        driver.quit();
    }
    public void loginSite(){
        driver.navigate().to("https://openmrs.org/");

        WebElement demoButton = driver.findElement(By.xpath("//a[@class='zak-button']"));
        demoButton.click();

        WebElement exploreButton = driver.findElement(By.xpath("//a[contains(@href,'#openmrs2')]/span/span"));
        exploreButton.click();

        WebElement demoMRSButton = driver.findElement(By.xpath("//a[contains(@href,'openmrs/login.htm')]/span/span"));
        Tools.Wait(3);
        demoMRSButton.click();

        wait.until(ExpectedConditions.urlContains("login"));
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("admin");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Admin123");

        WebElement inpatientWard = driver.findElement(By.id("Inpatient Ward"));
        inpatientWard.click();

        WebElement loginButton = driver.findElement(By.id("loginButton"));
        loginButton.click();
    }
}
