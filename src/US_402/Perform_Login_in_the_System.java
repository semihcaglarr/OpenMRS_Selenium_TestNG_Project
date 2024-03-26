package US_402;

import Utility.GWD;
import Utility.Tools;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Perform_Login_in_the_System extends GWD { // Tuba

    @Test
    public void TC_0201() {
        Elements_402 ble1 = new Elements_402();
        Tools.Wait(3);

        driver1.get("https://openmrs.org/");
        Tools.Wait(2);

        wait1.until(ExpectedConditions.elementToBeClickable(ble1.flagImg));

        if (!(ble1.flagImg.getAttribute("alt").equals("en"))) {
            System.out.println(ble1.flagImg.getAttribute("alt"));

            ble1.selectLanguage.click();

            wait1.until(ExpectedConditions.elementToBeClickable(ble1.choiceLanguage));

            ble1.choiceLanguage.click();
        }

        Tools.JavaScriptClick(ble1.demoButton);

        wait1.until(ExpectedConditions.visibilityOf(ble1.exploreMRS2Button));

        Tools.JavaScriptClick(ble1.exploreMRS2Button);

        wait1.until(ExpectedConditions.elementToBeClickable(ble1.demoMRS2Button));

        Tools.JavaScriptClick(ble1.demoMRS2Button);

        wait1.until(ExpectedConditions.urlContains("login"));

        ble1.userName.sendKeys("admin");

        ble1.password.sendKeys("Admin123");

        ble1.inpatientWard.click();

        ble1.loginButton.click();

        wait1.until(ExpectedConditions.visibilityOf(ble1.loggedMsg));

        Assert.assertTrue(ble1.loggedMsg.getText().contains("Logged"), "Unable to Login");


    }


}
