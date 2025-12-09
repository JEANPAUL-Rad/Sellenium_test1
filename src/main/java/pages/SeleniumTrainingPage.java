package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumTrainingPage {
    private WebDriver driver;

    private By pageHeading = By.cssSelector(".enroll__heading");

    public SeleniumTrainingPage(WebDriver driver){
        this.driver = driver;
    }

    public String getPageHeading(){
        return driver.findElement(pageHeading).getText();
    }
}