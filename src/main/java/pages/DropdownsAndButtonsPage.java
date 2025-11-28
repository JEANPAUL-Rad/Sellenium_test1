package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropdownsAndButtonsPage {
    private WebDriver driver;

    private By tutorialsMenu = By.linkText("TUTORIALS");
    private By qaPracticesOption = By.linkText("QA Practices");
    private By frontEndTestingOption = By.linkText("Front-End Testing Automation");
    private By backEndTestingOption = By.linkText("Back-End Testing Automation");
    private By mobileTestingOption = By.linkText("Mobile Testing Automation");
    private By frameworksOption = By.linkText("Frameworks & Libraries");
    private By devOpsToolsOption = By.linkText("DevOps Tools");
    private By crossBrowserOption = By.linkText("Cross Browser Testing");
    private By nonFunctionalOption = By.linkText("Non-Functional Testing");
    private By programmingLanguageOption = By.linkText("Programming Language");

    public DropdownsAndButtonsPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickTutorialsMenu(){
        driver.findElement(tutorialsMenu).click();
    }

    public void selectQAPractices(){
        driver.findElement(qaPracticesOption).click();
    }

    public void selectFrontEndTesting(){
        driver.findElement(frontEndTestingOption).click();
    }

    public void selectBackEndTesting(){
        driver.findElement(backEndTestingOption).click();
    }

    public void selectMobileTesting(){
        driver.findElement(mobileTestingOption).click();
    }

    public void selectFrameworks(){
        driver.findElement(frameworksOption).click();
    }

    public void selectDevOpsTools(){
        driver.findElement(devOpsToolsOption).click();
    }

    public void selectCrossBrowser(){
        driver.findElement(crossBrowserOption).click();
    }

    public void selectNonFunctional(){
        driver.findElement(nonFunctionalOption).click();
    }

    public void selectProgrammingLanguage(){
        driver.findElement(programmingLanguageOption).click();
    }
}