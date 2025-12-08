package clicklinks;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.SeleniumTrainingPage;

public class ClickableLinksTests extends BaseTests {

    @Test
    public void testReadMoreLink(){
        SeleniumTrainingPage trainingPage = homePage.clickReadMore();

    }
}