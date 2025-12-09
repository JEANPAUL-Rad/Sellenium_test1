package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickableLinksPage {
    private WebDriver driver;
    private By clicks = By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[4]/div[1]/a");

    public ClickableLinksPage(WebDriver driver){
        this.driver = driver;
    }
 public void setEnrollButton(){
        driver.findElement(clicks).click();
 }
}
