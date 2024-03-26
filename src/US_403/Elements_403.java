package US_403;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements_403 {
    public Elements_403() {
        PageFactory.initElements(BaseDriver.driver, this);
    }
   @FindBy(xpath = "//li[@class='nav-item logout']/a")
    public WebElement logoutButton;




}
