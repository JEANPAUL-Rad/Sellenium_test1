package forms;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FormsPage;

public class FormTests extends BaseTests {
    @Test
    public void testEnrollYourselfLink(){
        FormsPage formsPage = homePage.clickEnrollYourself();

        formsPage.fillFirstName("IRADUKUNDA");
        formsPage.fillLastName("Aman");
        formsPage.fillEmail("musa@gmail.com");
        formsPage.fillMobile("0780097403");
        formsPage.selectCountry("Rwanda");
        formsPage.fillCity("Kigali");
        formsPage.fillMessage("This is a test message");
        formsPage.fillCaptcha("3UOt");
        formsPage.clickSend();
    }
}