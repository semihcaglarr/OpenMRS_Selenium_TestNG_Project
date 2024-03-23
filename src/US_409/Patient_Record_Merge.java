package US_409;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.UUID;

public class Patient_Record_Merge extends BaseDriver { // Erman
     @Test
     public void TC_0901(){
          Elements409 elements = new Elements409();

          String id1 = elements.registerPatient();
          elements.homeLink.click();
          String id2 = elements.registerPatient();
          elements.homeLink.click();

          elements.dataManagementButton.click();
          wait.until(ExpectedConditions.urlContains("datamanagement"));
          elements.mergeButton.click();
          wait.until(ExpectedConditions.urlContains("merge"));
          elements.patient1.sendKeys(id1);
          elements.patient2.sendKeys(id2);

          Actions actions = new Actions(driver);
          actions.keyDown(Keys.TAB).build().perform();
          actions.keyUp(Keys.TAB).build().perform();

          wait.until(ExpectedConditions.elementToBeClickable(elements.confirmButton));
          elements.confirmButton.click();
          wait.until(ExpectedConditions.urlContains("patient1"));
          elements.firstPatient.click();
          elements.confirmButton.click();
          wait.until(ExpectedConditions.urlContains("patientdashboard"));

          Assert.assertTrue(elements.patients.get(0).getText().equals(id2),"id2 is not correct");
          Assert.assertTrue(elements.patients.get(1).getText().equals(id1),"id1 is not correct");

     }
}
