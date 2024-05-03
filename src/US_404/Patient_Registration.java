package US_404;

import Utility.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Patient_Registration extends BaseDriver {
    public static String patientNameSend = "Kamil" + ((int) (Math.random() * 1000));
    public static String patientMiddleNameSend = "Osman";
    public static String patientFamilyNameSend = "Tanburacı";

    @Test(groups = {"Regression Test","PatientManagement Test"})
    public void TC_0401() {
        Elements_404 tc04 = new Elements_404();

        tc04.registerPatientButton.click();
        wait.until(ExpectedConditions.visibilityOf(tc04.patientName));
        tc04.patientName.sendKeys(patientNameSend);
        tc04.patientMiddleName.sendKeys(patientMiddleNameSend);
        tc04.patientFamilyName.sendKeys(patientFamilyNameSend);
        tc04.nextButton.click();

        Tools.SelectMenu(tc04.gender, "M");
        tc04.nextButton.click();

        tc04.birthDateDay.sendKeys("12");
        Tools.SelectMenu(tc04.birthDateMonth, "4");
        tc04.birthDateYear.sendKeys("1995");
        tc04.nextButton.click();

        tc04.address1.sendKeys("ABQ");
        tc04.address2.sendKeys("Alberq");
        tc04.cityVillage.sendKeys("YoYoYo");
        tc04.stateProvince.sendKeys("New Mexico");
        tc04.country.sendKeys("Santa Fe");
        tc04.postalCode.sendKeys("85456");
        tc04.nextButton.click();

        tc04.phoneNumber.sendKeys("5556547897");
        tc04.nextButton.click();

        Tools.SelectMenu(tc04.relationshipType, "8d919b58-c2cc-11de-8d13-0010c6dffd0f-A");
        tc04.relationshipName.sendKeys("Kamuran");
        tc04.nextButton.click();

        tc04.submitButton.click();
        wait.until(ExpectedConditions.visibilityOf(tc04.givenName));

        Assert.assertEquals(patientNameSend, tc04.givenName.getText(), "Patient Records Entered Do Not Match");

        System.out.println("PatientID = " + tc04.patientID.getText());

    }
}
