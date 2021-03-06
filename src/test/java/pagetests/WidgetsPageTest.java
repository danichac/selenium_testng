package pagetests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.WidgetsPage;

import static org.testng.Assert.assertEquals;
import static utilities.Utils.takeScreenshot;

public class WidgetsPageTest extends BaseTest{

    private WidgetsPage widgetsPage;

    @BeforeClass
    public void goToWidgetsPage(){
        widgetsPage = homePage.clickWidgetPage();
        widgetsPage.clickToolTips();
    }

    @Test
    public void testButtonTooltipText(){
        widgetsPage.clickToolTips();
        String expected = "You hovered over the Button";
        String actual = widgetsPage.getButtonToolTipText();
        takeScreenshot(driver, "buttonToolTip");
        assertEquals(actual, expected);
    }

    @Test
    public void testTextFieldToolTipText(){
        widgetsPage.clickToolTips();
        String expected = "You hovered over the text field";
        String actual = widgetsPage.getTextFieldToolTipText();
        takeScreenshot(driver, "textFieldToolTip");
        assertEquals(actual, expected);
    }

    @Test
    public void testAnchorTagToolTipText(){
        widgetsPage.clickToolTips();
        String expected = "You hovered over the Contrary";
        String actual = widgetsPage.getAnchorTagToolTipText();
        takeScreenshot(driver, "contraryToolTip");
        assertEquals(actual, expected);
    }
}
