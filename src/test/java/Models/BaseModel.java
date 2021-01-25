package Models;

import driver.Driver;
import io.appium.java_client.MobileDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BaseModel extends Driver {
    WebDriverWait wait = new WebDriverWait(appiumDriver, 20);

    public WebElement findElement(By by){
       return appiumDriver.findElement(by);
    }

    public void sendKeys(By by, String text) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        findElement(by).sendKeys(text);
    }

    public void clickElement(By by) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        wait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();
    }
    public void clickElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(appiumDriver, 20);
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
    public boolean isElementDisplayed(By by) {
        try {
            return findElement(by).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }

    }
    public boolean isElementClickable(By by) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(by));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
    public boolean isElementVisible(By by) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;
        } catch (Exception var4) {
            return false;
        }
    }
    public String getText(By by) {

       wait.until(ExpectedConditions.visibilityOfElementLocated(by));
       return findElement(by).getText();
    }

    public List<WebElement> findElements(By by) {
        return appiumDriver.findElements(by);
    }



}



