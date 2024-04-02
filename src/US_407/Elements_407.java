package US_407;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements_407 {

    public Elements_407() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "(//div[@id='apps']//a)[1]")
    public WebElement findPatientRecordButton;

    @FindBy(xpath = "//ul[@id='breadcrumbs']//a")
    public WebElement homePageIcon;

    @FindBy(xpath = "//form[@id='patient-search-form']/input")
    public WebElement patientSearch;


    @FindBy(xpath = "//div[@class='dataTables_info']")
    public WebElement dataTableInfo;

    @FindBy(xpath = "(//tr[@class='odd']/td)[2]")
    public WebElement resultsTable;


    @FindBy(xpath = "//span[@class='recent-lozenge']/..")
    public WebElement patientId;


    @FindBy(xpath = "//a[contains(@id,'deletePatient')]")
    public WebElement deletePatient;


    @FindBy(xpath = "//input[@id='delete-reason']")
    public WebElement deleteReason;


    @FindBy(xpath = "//input[@id='delete-reason']/..//button[@class='confirm right']")
    public WebElement deleteConfirm;

    @FindBy(xpath = "//div[contains(text(),'successfull')]")
    public WebElement successMessage;

}
