package US_409;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Elements409  {

    public void Elements409(){
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
    @FindBy(xpath = "//div[@class='float-sm-right']/span")
    public List<WebElement> patients;
}
