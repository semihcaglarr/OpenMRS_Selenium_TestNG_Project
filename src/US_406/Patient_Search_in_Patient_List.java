package US_406;

import US_404.Patient_Registration;
import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Patient_Search_in_Patient_List extends BaseDriver {  // Demet


    @Test(groups = {"PatientManagement Test"})
    public void TC_0601() {
        Elements_406 tc06 = new Elements_406();

        tc06.findPatientRecordButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(tc06.homePageIcon));

        tc06.patientSearch.sendKeys(Patient_Registration.patientNameSend);
        tc06.resultsTable.click();

        wait.until(ExpectedConditions.urlContains("patientId"));

    }
}
