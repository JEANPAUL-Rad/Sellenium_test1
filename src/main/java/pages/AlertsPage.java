package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AlertsPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By alertButton = By.id("alertButton");
    private By timerAlertButton = By.id("timerAlertButton");
    private By confirmButton = By.id("confirmButton");
    private By promptButton = By.id("promtButton");
    private By confirmResult = By.id("confirmResult");
    private By promptResult = By.id("promptResult");

    public AlertsPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        removeAds();
    }

    private void removeAds(){
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript(
                    "var ads = document.querySelectorAll('iframe[id*=\"google_ads\"], div[id*=\"google_ads\"]');" +
                            "ads.forEach(ad => ad.remove());"
            );
        } catch (Exception e) {

        }
    }

    private void jsClick(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

    private void scrollToElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
    }

    public void clickAlertAndAccept(){
        WebElement element = driver.findElement(alertButton);
        scrollToElement(element);
        jsClick(element);
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }

    public void clickTimerAlertAndAccept(){
        WebElement element = driver.findElement(timerAlertButton);
        scrollToElement(element);
        jsClick(element);
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }

    public String clickConfirmAndAccept(){
        WebElement element = driver.findElement(confirmButton);
        scrollToElement(element);
        jsClick(element);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert a = driver.switchTo().alert();
        a.accept();
        return driver.findElement(confirmResult).getText();
    }

    public String clickConfirmAndDismiss(){
        WebElement element = driver.findElement(confirmButton);
        scrollToElement(element);
        jsClick(element);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert a = driver.switchTo().alert();
        a.accept();
        return driver.findElement(confirmResult).getText();
    }

    public String clickPromptAndSendText(String input){
        WebElement element = driver.findElement(promptButton);
        scrollToElement(element);
        jsClick(element);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert a = driver.switchTo().alert();
        a.sendKeys(input);
        a.accept();
        return driver.findElement(promptResult).getText();
    }
}