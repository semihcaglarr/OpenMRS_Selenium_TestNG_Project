package US_402;

import Utility.GWD;
import Utility.Tools;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Perform_Login_in_the_System extends GWD { // Tuba
    @Test(dataProvider = "database",priority = 1)
    public void TC_201_Negativ(String username,String password){
        Elements_402 ble = new Elements_402();
        Tools.Wait(3);

        driver1.get("https://openmrs.org/");
        ble.demoButton.click();

        wait1.until(ExpectedConditions.elementToBeClickable(ble.selectLanguage));

        if (!(ble.flagImg.getAttribute("alt").equals("en"))) {
            System.out.println("Language : " + ble.flagImg.getAttribute("alt"));

            ble.selectLanguage.click();

            wait1.until(ExpectedConditions.elementToBeClickable(ble.choiceLanguage));

            ble.choiceLanguage.click();

            System.out.println("Language : " + ble.flagImg.getAttribute("alt"));
        }

        wait1.until(ExpectedConditions.elementToBeClickable(ble.exploreMRS2Button));

        ble.exploreMRS2Button.click();
        //Tools.JavaScriptClick(ble.exploreMRS2Button);
        Tools.Wait(2);

        wait1.until(ExpectedConditions.elementToBeClickable(ble.demoMRS2Button));
        ble.demoMRS2Button.click();
        //Tools.JavaScriptClick_TUBA(ble.demoMRS2Button);

        wait1.until(ExpectedConditions.urlContains("login"));

        ble.userName.sendKeys(username);

        ble.password.sendKeys(password);

        ble.inpatientWard.click();

        ble.loginButton.click();

        wait1.until(ExpectedConditions.visibilityOf(ble.usernameerrormsg));
        Assert.assertTrue(ble.usernameerrormsg.getText().contains("Invalid"),"Unable to Login");

    }
    @DataProvider
    Object[][] database(){
        Object[][] usernamePassword=
                {
                        {"tuba","1234"},
                        {"seda","44444"},
                        {"Ayse","6666"},
                        {"suna","9999"},
                        {"mine","dddd"},
                        {"dede","kkkk"}

                };
        return  usernamePassword;
    }

    @Test(priority = 2)
    public void TC_0201() {
        Elements_402 ble = new Elements_402();
        Tools.Wait(3);

        driver1.get("https://openmrs.org/");
        ble.demoButton.click();

        wait1.until(ExpectedConditions.elementToBeClickable(ble.selectLanguage));

        if (!(ble.flagImg.getAttribute("alt").equals("en"))) {
            System.out.println("Language : " + ble.flagImg.getAttribute("alt"));

            ble.selectLanguage.click();

            wait1.until(ExpectedConditions.elementToBeClickable(ble.choiceLanguage));

            ble.choiceLanguage.click();

            System.out.println("Language : " + ble.flagImg.getAttribute("alt"));
        }

        wait1.until(ExpectedConditions.elementToBeClickable(ble.exploreMRS2Button));

        ble.exploreMRS2Button.click();
        //Tools.JavaScriptClick(ble.exploreMRS2Button);
        Tools.Wait(2);

        wait1.until(ExpectedConditions.elementToBeClickable(ble.demoMRS2Button));
        ble.demoMRS2Button.click();
        //Tools.JavaScriptClick_TUBA(ble.demoMRS2Button);

        wait1.until(ExpectedConditions.urlContains("login"));

        ble.userName.sendKeys("admin");

        ble.password.sendKeys("Admin123");

        ble.inpatientWard.click();

        ble.loginButton.click();

        wait1.until(ExpectedConditions.visibilityOf(ble.loggedMsg));

        Assert.assertTrue(ble.loggedMsg.getText().contains("Logged"), "Unable to Login");


    }


}
