package US_404;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements_404 {
    public Elements_404() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "(//div[@id='apps']//a)[4]")
    public WebElement registerPatientButton;

    @FindBy(xpath = "//input[@name='givenName']")
    public WebElement patientName;

    @FindBy(xpath = "//input[@name='middleName']")
    public WebElement patientMiddleName;

    @FindBy(xpath = "//input[@name='familyName']")
    public WebElement patientFamilyName;

    @FindBy(xpath = "//button[@id='next-button']")
    public WebElement nextButton;

    @FindBy(xpath = "//select[@name='gender']")
    public WebElement gender;

    @FindBy(xpath = "//input[@name='birthdateDay']")
    public WebElement birthDateDay;

    @FindBy(xpath = "//select[@name='birthdateMonth']")
    public WebElement birthDateMonth;

    @FindBy(xpath = "//input[@name='birthdateYear']")
    public WebElement birthDateYear;

    @FindBy(xpath = "//input[@id='address1']")
    public WebElement address1;

    @FindBy(xpath = "//input[@id='address2']")
    public WebElement address2;

    @FindBy(xpath = "//input[@id='cityVillage']")
    public WebElement cityVillage;

    @FindBy(xpath = "//input[@id='stateProvince']")
    public WebElement stateProvince;

    @FindBy(xpath = "//input[@id='country']")
    public WebElement country;

    @FindBy(xpath = "//input[@id='postalCode']")
    public WebElement postalCode;

    @FindBy(xpath = "//input[@name='phoneNumber']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//select[starts-with(@id,'relationship')]")
    public WebElement relationshipType;
    @FindBy(xpath = "//input[contains(@ng-model,'name')]")
    public WebElement relationshipName;

    @FindBy(xpath = "//input[@id='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//span[contains(@class,'givenName')]")
    public WebElement givenName;

    @FindBy(xpath = "//div[@class='float-sm-right']/span")
    public WebElement patientID;

}
