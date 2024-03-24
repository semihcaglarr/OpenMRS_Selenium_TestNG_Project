package US_405;

import Utility.BaseDriver;
import Utility.GWD;
import Utility.LCE;
import Utility.Tools;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class My_Account extends GWD { // Serik


    @Test
    public void TC_0501() {

        Elements_405 tc5 = new Elements_405();

        SoftAssert _softAssert = new SoftAssert();


        driver1.get("https://openmrs.org/");
        Tools.Wait(2);
      //  wait1.until(ExpectedConditions.elementToBeClickable(tc5.demoButton));


        tc5.demoButton.click();
//
//        wait1.until(ExpectedConditions.elementToBeClickable(tc5.selectLanguage));
//
//        if (!(tc5.flagImg.getAttribute("alt").equals("en"))) {
//            System.out.println("Language : " + tc5.flagImg.getAttribute("alt"));
//
//            tc5.selectLanguage.click();
//
//            wait1.until(ExpectedConditions.elementToBeClickable(tc5.choiceLanguage));
//
//            tc5.choiceLanguage.click();
//
//            System.out.println("Language : " + tc5.flagImg.getAttribute("alt"));
//        }
//
//        wait1.until(ExpectedConditions.visibilityOf(tc5.exploreMRS2Button));
//
//        Tools.JavaScriptClick(tc5.exploreMRS2Button);
//
//        wait1.until(ExpectedConditions.elementToBeClickable(tc5.demoMRS2Button));
//
//        Tools.JavaScriptClick(tc5.demoMRS2Button);
//
//        wait1.until(ExpectedConditions.urlContains("login"));
//
//        tc5.userName.sendKeys("admin");
//
//        tc5.password.sendKeys("Admin123");
//
//        int random = Tools.randomGenerator(tc5.sessionLocation.size());
//        tc5.sessionLocation.get(random).click();
//
//        tc5.loginButton.click();
//
//        wait1.until(ExpectedConditions.visibilityOf(tc5.loggedMsg));
//
//        _softAssert.assertTrue(tc5.loggedMsg.getText().contains("Inpatient Ward"), "Unable to Login");
//        _softAssert.assertAll();
    }


}

