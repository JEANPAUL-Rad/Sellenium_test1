package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DemoSitePage {
    private WebDriver driver;
    private WebDriverWait wait;

    public DemoSitePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            String current = driver.getCurrentUrl();
            if (current == null || !current.contains("demoqa.com")) {
                for (String h : driver.getWindowHandles()) {
                    driver.switchTo().window(h);
                    try {
                        if (driver.getCurrentUrl().contains("demoqa.com") || driver.getTitle().toLowerCase().contains("demoqa")) {
                            return;
                        }
                    } catch (Exception ignored) {
                    }
                }
            }
        } catch (Exception ignored) {
        }
    }

    public AlertsPage openAlertsPage(){
        driver.get("https://demoqa.com/alerts");
        return new AlertsPage(driver);
    }
}