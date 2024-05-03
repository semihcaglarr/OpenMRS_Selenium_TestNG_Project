package US_408;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import java.util.List;

public class Elements_408 {

    public Elements_408() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//div[@id='content']//a[1]")
    public WebElement findPatient;

    @FindBy(xpath = "//div[@id='patient-search-results-table_info']")
    public WebElement showingPatientEntries;

    @FindBy(xpath = "//tbody[@role='alert']/tr")    // Hasta sayisinin listesi
    public List<WebElement> patientList;
}
