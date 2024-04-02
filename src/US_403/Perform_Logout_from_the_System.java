package US_403;

import US_402.Elements_402;
import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Perform_Logout_from_the_System extends BaseDriver {

    @Test(groups = {"Smoke Test","Logout Test"})
    public void TC_0301(){

        Tools.Wait(3);

        Elements_403 tc03 = new Elements_403();

        wait.until(ExpectedConditions.elementToBeClickable(tc03.logoutButton));

        tc03.logoutButton.click();

        wait.until(ExpectedConditions.urlContains("login"));

        String url=driver.getCurrentUrl();
        Assert.assertTrue(url.contains("login"),"Loginpage could not be reached");

    }
}
