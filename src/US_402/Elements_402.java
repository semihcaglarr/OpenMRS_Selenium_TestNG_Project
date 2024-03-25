package US_402;

import Utility.BaseDriver;
import Utility.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements_402 {

    public Elements_402() {
        PageFactory.initElements(GWD.driver1, this);
    }

    @FindBy(xpath = "//a[@class='zak-button']")
    public WebElement demoButton;

    @FindBy(xpath = "//div[@class='gt-selected']")
    public WebElement selectLanguage;

    @FindBy(xpath = "//div[@class='gt-current-lang']//img")
    public WebElement flagImg;

    @FindBy(xpath = "//a[@data-gt-lang='en']")
    public WebElement choiceLanguage;

    @FindBy(xpath = "//a[contains(@href,'#openmrs2')]/span/span")
    public WebElement exploreMRS2Button;

    @FindBy(xpath = "//a[contains(@href,'openmrs/login.htm')]/span/span")
    public WebElement demoMRS2Button;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userName;


    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//li[@id='Inpatient Ward']")
    public WebElement inpatientWard;

    @FindBy(xpath = "//span[@class='location-error']")
    public WebElement locationerrormsg;


    @FindBy(xpath = "//input[@id='loginButton']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@id='content']//h4")
    public WebElement loggedMsg;


    @FindBy(xpath = "//div[@id='error-message']")
    public WebElement usernameerrormsg;


}



