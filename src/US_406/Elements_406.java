package US_406;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Elements_406 {

    public Elements_406() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "(//div[@id='apps']//a)[1]")
    public WebElement findPatientRecordButton;

    @FindBy(xpath = "//ul[@id='breadcrumbs']//a")
    public WebElement homePageIcon;

    @FindBy(xpath = "//form[@id='patient-search-form']/input")
    public WebElement patientSearch;

    @FindBy(xpath = "//tr[@class='odd']")
    public WebElement resultsTable;




}
