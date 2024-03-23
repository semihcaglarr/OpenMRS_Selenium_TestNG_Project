package US_406;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Elements_406 {

    public Elements_406() {

    }

    @FindBy(xpath = "(//div[@id='apps']//a)[1]")
    public WebElement findPatientRecordButton;

    @FindBy(xpath = "//ul[@id='breadcrumbs']//a")
    public WebElement homePageIcon; // bu element oluşana kadar bekle diyeceğiz


}
