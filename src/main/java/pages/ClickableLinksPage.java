package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickableLinksPage {
    private WebDriver driver;
    private By clicks = By.cssSelector("body > div.landing-page > div.banners > div.container-fluid > div > div.col-12.col-md-6.col-xl-5.order-md-0.new-training.justify-content-sm-center > div.row.align-items-center > div.col-auto.pl-0.pl-sm-1.col-md-5.col-sm-6.text-center > a");

    public ClickableLinksPage(WebDriver driver){
        this.driver = driver;
    }
 public void setEnrollButton(){
        driver.findElement(clicks).click();
 }
}
