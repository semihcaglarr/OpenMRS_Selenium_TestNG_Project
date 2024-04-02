package US_405;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.List;

public class Elements_405 {
    public Elements_405() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//*[@class='icon-user small']")
    public WebElement adminIcon;

    @FindBy(xpath = "//*[@id='user-account-menu']//a")
    public WebElement myAccountButton;

    @FindBy(xpath = "//div[@id='tasks']//div")
    public List<WebElement> tasks;

    @FindBy(xpath = "//div[@id='tasks']//a")
    public List<WebElement> buttonApp;

    @FindBy(xpath = "//*[@id='cancel-button']")
    public WebElement cancelButton;
}











