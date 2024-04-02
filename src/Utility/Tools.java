package Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Tools {

    public static void Wait(int sec) {

        try {
            Thread.sleep(sec * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void ActionClick(WebElement element) {
        Actions driverAksiyon = new Actions(BaseDriver.driver);
        Action aksiyon = driverAksiyon.moveToElement(element).click().build();
        BaseDriver.wait.until(ExpectedConditions.visibilityOf(element));
        aksiyon.perform();
    }

    public static void SelectMenu(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }





    public static void JavaScriptClick(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) BaseDriver.driver;
        jse.executeScript("arguments[0].click();", element);
    }


    public static boolean ListContainsString(List<WebElement> list, String wordToSearch) {

        boolean foundIn = false;

        for (WebElement e : list) {

            if (e.getText().toUpperCase().contains(wordToSearch.toLowerCase()))
                foundIn = true;
        }
        return foundIn;
    }

    public static int randomGenerator(int limit) {
        return (int) (Math.random() * limit);
    }


}
