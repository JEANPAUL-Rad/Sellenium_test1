package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FormsPage {
    private WebDriver driver;

    public FormsPage(WebDriver driver){
        this.driver = driver;
    }

    private By firstNameField = By.name("firstName");
    private By lastNameField = By.name("lastName");
    private By emailField = By.name("email");
    private By mobileField = By.name("mobile");
    private By countryDropdown = By.name("country");
    private By cityField = By.name("city");
    private By messageField = By.name("message");
    private By captchaField = By.id("code");
    private By sendButton = By.cssSelector("button.btn.btn-primary");

    public void fillFirstName(String firstName){
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void fillLastName(String lastName){
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void fillEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public void fillMobile(String mobile){
        driver.findElement(mobileField).sendKeys(mobile);
    }

    public void selectCountry(String country){
        Select dropdown = new Select(driver.findElement(countryDropdown));
        dropdown.selectByVisibleText(country);
    }

    public void fillCity(String city){
        driver.findElement(cityField).sendKeys(city);
    }

    public void fillMessage(String message){
        driver.findElement(messageField).sendKeys(message);
    }

    public void fillCaptcha(String captchaCode){
        driver.findElement(captchaField).sendKeys(captchaCode);
    }

    public void clickSend(){
        driver.findElement(sendButton).click();
    }
}