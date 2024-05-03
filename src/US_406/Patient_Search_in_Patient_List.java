package US_406;

import US_404.Patient_Registration;
import Utility.BaseDriver;
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

        if (!(tc06.resultsTable.getText().equals("No matching records found"))) {
            tc06.resultsTable.click();
        } else {
            System.out.println("No matching records found");
        }

        wait.until(ExpectedConditions.urlContains("patientId"));

        Assert.assertEquals(Patient_Registration.patientNameSend, tc06.givenName.getText(), "Patient Records Entered Do Not Match");

        System.out.println("Patient ID = " + tc06.patientID.getText());

    }
}
