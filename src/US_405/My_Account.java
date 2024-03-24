package US_405;

import Utility.BaseDriver;
import Utility.GWD;
import Utility.LCE;
import Utility.Tools;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class My_Account extends BaseDriver { // Serik


    @Test
    public void TC_0501() {

        Actions driverAction = new Actions(driver);
        Elements_405 tc05 = new Elements_405();

        driverAction.moveToElement(tc05.adminIcon).build().perform();

        tc05.myAccountButton.click();

        for (WebElement e : tc05.tasks) {
            if (e.getText().contains("Password") || e.getText().contains("Languages")) {
                System.out.println(e.getText().trim() + " visible");
            }
        }

        for (int i = 0; i < tc05.buttonApp.size(); i++) {
            tc05.buttonApp.get(i).click();
            wait.until(ExpectedConditions.elementToBeClickable(tc05.cancelButton));
            tc05.cancelButton.click();
            wait.until(ExpectedConditions.visibilityOfAllElements(tc05.buttonApp));
        }
    }

}

