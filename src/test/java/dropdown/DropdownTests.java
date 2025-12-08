package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropdownsAndButtonsPage;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectQAPractices(){
        DropdownsAndButtonsPage dropdownPage = homePage.clickTutorialsMenu();
        dropdownPage.selectQAPractices();
    }

    @Test
    public void testSelectFrontEndTesting(){
        DropdownsAndButtonsPage dropdownPage = homePage.clickTutorialsMenu();
        dropdownPage.selectFrontEndTesting();
    }

    @Test
    public void testSelectMobileTesting(){
        DropdownsAndButtonsPage dropdownPage = homePage.clickTutorialsMenu();
        dropdownPage.selectMobileTesting();
    }
}