package Utility;

import US_402.Elements_402;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class BaseDriver {

    public static WebDriver driver;

    public static WebDriverWait wait;


    @BeforeClass
    public void startUpOperations() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();  // Ekranı maximum yapar
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

        wait = new WebDriverWait(driver, Duration.ofSeconds(25));

        US_402_Login();

    }

    public void US_402_Login() {

        SoftAssert _softAssert = new SoftAssert();
        Elements_402 ble = new Elements_402();

        driver.get("https://openmrs.org/");

        ble.demoButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(ble.selectLanguage));

        if (!(ble.flagImg.getAttribute("alt").equals("en"))) {
            System.out.println("Language : " + ble.flagImg.getAttribute("alt"));

            ble.selectLanguage.click();

            wait.until(ExpectedConditions.elementToBeClickable(ble.choiceLanguage));

            ble.choiceLanguage.click();

            System.out.println("Language : " + ble.flagImg.getAttribute("alt"));
        }

        wait.until(ExpectedConditions.visibilityOf(ble.exploreMRS2Button));

        Tools.JavaScriptClick(ble.exploreMRS2Button);

        wait.until(ExpectedConditions.elementToBeClickable(ble.demoMRS2Button));

        Tools.JavaScriptClick(ble.demoMRS2Button);

        wait.until(ExpectedConditions.urlContains("login"));

        ble.userName.sendKeys("admin");

        ble.password.sendKeys("Admin123");

        ble.inpatientWard.click();

        ble.loginButton.click();

        wait.until(ExpectedConditions.visibilityOf(ble.loggedMsg));

        _softAssert.assertTrue(ble.loggedMsg.getText().contains("Inpatient Ward"), "Unable to Login");
        _softAssert.assertAll();
    }


    @AfterClass
    public void closingOperations() {

        Tools.Wait(3);
        driver.quit();

    }
}
