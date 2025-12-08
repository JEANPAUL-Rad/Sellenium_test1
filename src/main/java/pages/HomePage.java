package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    private By readMoreLink = By.linkText("Read More");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickLinks(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

    public FormsPage clickEnrollYourself(){
        driver.findElement(By.linkText("ENROLL YOURSELF")).click();
        return new FormsPage(driver);
    }

    public SeleniumTrainingPage clickReadMore(){
        driver.findElement(readMoreLink).click();
        return new SeleniumTrainingPage(driver);
    }
    public DropdownsAndButtonsPage clickTutorialsMenu(){
        driver.findElement(By.linkText("TUTORIALS")).click();
        return new DropdownsAndButtonsPage(driver);
    }
    public DemoSitePage clickDemoSite(){
        driver.findElement(By.linkText("DEMO SITE")).click();
        return new DemoSitePage(driver);
    }
}