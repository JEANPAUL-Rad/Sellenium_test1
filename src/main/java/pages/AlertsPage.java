package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
    }

    public void clickAlertAndAccept(){
        driver.findElement(alertButton).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert a = driver.switchTo().alert();
        a.accept();
    }

    public void clickTimerAlertAndAccept(){
        driver.findElement(timerAlertButton).click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }

    public String clickConfirmAndAccept(){
        driver.findElement(confirmButton).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert a = driver.switchTo().alert();
        String text = a.getText();
        a.accept();
        return driver.findElement(confirmResult).getText();
    }

    public String clickConfirmAndDismiss(){
        driver.findElement(confirmButton).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert a = driver.switchTo().alert();
        a.dismiss();
        return driver.findElement(confirmResult).getText();
    }

    public String clickPromptAndSendText(String input){
        driver.findElement(promptButton).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert a = driver.switchTo().alert();
        a.sendKeys(input);
        a.accept();
        return driver.findElement(promptResult).getText();
    }
}