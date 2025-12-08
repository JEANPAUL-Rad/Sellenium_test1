package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class DropdownsAndButtonsPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By tutorialsMenu = By.linkText("TUTORIALS");
    private By qaPracticesOption = By.linkText("QA Practices");
    private By frontEndTestingOption = By.linkText("Front-End Testing Automation");
    private By backEndTestingOption = By.linkText("Back-End Testing Automation");
    private By mobileTestingOption = By.linkText("Mobile Testing Automation");

    public DropdownsAndButtonsPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickTutorialsMenu(){
        driver.findElement(tutorialsMenu).click();
    }

    public void selectQAPractices(){
        wait.until(ExpectedConditions.elementToBeClickable(qaPracticesOption));
        driver.findElement(qaPracticesOption).click();
    }

    public void selectFrontEndTesting(){
        wait.until(ExpectedConditions.elementToBeClickable(frontEndTestingOption));
        driver.findElement(frontEndTestingOption).click();
    }

    public void selectMobileTesting(){
        wait.until(ExpectedConditions.elementToBeClickable(mobileTestingOption));
        driver.findElement(mobileTestingOption).click();
    }
}