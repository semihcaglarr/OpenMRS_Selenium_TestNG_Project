package US_408;

import Utility.BaseDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Patient_Listing extends BaseDriver {


    @Test(groups = {"Regression Test","PatientManagement Test"})
    public void TC_0801(){

        Elements_408 tc08=new Elements_408();

        tc08.findPatient.click();
        wait.until(ExpectedConditions.visibilityOfAllElements(tc08.patientList));

        String dataTablesReplace=tc08.showingPatientEntries.getText().replaceAll("[^0-9]","");

        String dataTableSubs=dataTablesReplace.substring(2);

        int dataTableZ=Integer.parseInt(dataTableSubs);
        //System.out.println("dataTableZ = " + dataTableZ);
        int listSize=tc08.patientList.size();
        //System.out.println("listSize = " + listSize);

        Assert.assertEquals(dataTableZ,listSize,"The patient Number is not equal");
    }
}
