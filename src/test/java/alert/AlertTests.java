package alert;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AlertsPage;
import static org.testng.Assert.*;

public class AlertTests extends BaseTests {

    @Test
    public void testSimpleAlert(){
        AlertsPage alertsPage = homePage.clickDemoSite().openAlertsPage();
        alertsPage.clickAlertAndAccept();
    }

    @Test
    public void testTimerAlert(){
        AlertsPage alertsPage = homePage.clickDemoSite().openAlertsPage();
        alertsPage.clickTimerAlertAndAccept();
    }

    @Test
    public void testConfirmAlertAccept(){
        AlertsPage alertsPage = homePage.clickDemoSite().openAlertsPage();
        String result = alertsPage.clickConfirmAndAccept();
        assertEquals(result, "You selected Ok", "Confirm accept result mismatch");
    }

    @Test
    public void testConfirmAlertDismiss(){
        AlertsPage alertsPage = homePage.clickDemoSite().openAlertsPage();
        String result = alertsPage.clickConfirmAndDismiss();
        assertEquals(result, "You selected Cancel", "Confirm dismiss result mismatch");
    }

    @Test
    public void testPromptAlert(){
        AlertsPage alertsPage = homePage.clickDemoSite().openAlertsPage();
        String inputText = "Test User";
        String result = alertsPage.clickPromptAndSendText(inputText);
        assertTrue(result.contains(inputText), "Prompt result should contain input text");
    }
}