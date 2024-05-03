package US_409;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.util.List;
import java.util.UUID;

import static Utility.BaseDriver.wait;

public class Elements409  {
    public Elements409(){
        PageFactory.initElements(BaseDriver.driver, this);
    }
    @FindBy(id = "coreapps-datamanagement-homepageLink-coreapps-datamanagement-homepageLink-extension")
    public WebElement dataManagementButton;
    @FindBy(id = "coreapps-mergePatientsHomepageLink-app")
    public WebElement mergeButton;
    @FindBy(id = "patient1-text")
    public WebElement patient1;
    @FindBy(id = "patient2-text")
    public WebElement patient2;
    @FindBy(id = "confirm-button")
    public WebElement confirmButton;
    @FindBy(id = "first-patient")
    public WebElement firstPatient;
    @FindBy(xpath = "//div[@class='float-sm-right']//span")
    public List<WebElement> patients;
    @FindBy(xpath = "//a[starts-with(@id,'referenceapplication-registrationapp')]")
    public WebElement registerButton;
    @FindBy(name = "givenName")
    public WebElement givenName;
    @FindBy(name = "familyName")
    public WebElement familyName;
    @FindBy(id = "next-button")
    public WebElement nextButton;
    @FindBy(id = "gender-field")
    public WebElement genderField;
    @FindBy(name = "birthdateDay")
    public WebElement birthdateDay;
    @FindBy(name = "birthdateMonth")
    public WebElement birthdateMonth;
    @FindBy(name = "birthdateYear")
    public WebElement birthdateYear;
    @FindBy(id = "address1")
    public WebElement address;
    @FindBy(id = "submit")
    public WebElement submitButton;
    @FindBy(xpath = "//div[@class='float-sm-right']/span")
    public WebElement patientID;
    @FindBy(xpath = "//ul[@id='breadcrumbs']/li/a")
    public WebElement homeLink;
    public String registerPatient(){
        Elements409 elements = new Elements409();

        String randomName = "User_" + UUID.randomUUID().toString().substring(0, 8);
        String randomFamilyName = "User_" + UUID.randomUUID().toString().substring(0, 8);

        elements.registerButton.click();
        elements.givenName.sendKeys(randomName);
        elements.familyName.sendKeys(randomFamilyName);
        elements.nextButton.click();
        Select genderMenu = new Select(elements.genderField);
        genderMenu.selectByValue("M");
        elements.nextButton.click();
        elements.birthdateDay.sendKeys("01");
        Select monthMenu = new Select(elements.birthdateMonth);
        monthMenu.selectByValue("1");
        elements.birthdateYear.sendKeys("2000");
        elements.nextButton.click();
        elements.address.sendKeys("address");
        elements.nextButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.nextButton));
        elements.nextButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.nextButton));
        elements.nextButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.submitButton));
        elements.submitButton.click();
        String id = elements.patientID.getText();
        return id;
    }
}
