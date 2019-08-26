package test.Common;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.*;
import static utilites.AuthorizationPage.login;
import static utilites.TestURL.*;
import static utilites.RefreshPageForCheck.*;

/**
 *   autor a.stupin
 */

//Checking if all module's are available right now
public class AvailableModules {
    @Before
    public void setUp() {
        clearBrowserCookies();
    }
    //if Admin module is available?
    @Test
    public void AvailableAdmin () {
        openAdminModule();
        login("admin","1");
        $("title").
                shouldHave(attribute("text" , "Rigspace Administrative Panel"));
        refreshPageForAdmin();
    }
    //if Reporting module is available?
    @Test
    public void AvailableReporting () {
        openReportingModule();
        login("admin", "1");
        $("title").
                shouldHave(attribute("text" , "RigSpace Reporting"));
        refreshPageForReporting();
    }
    //if Equipment module is available?
    @Test
    public void AvailableEquipment () {
        openEquipmentModule();
        login("admin", "1");
        $("title").
                shouldHave(attribute("text" , "Rigspace Equipment"));
        refreshPageForEquipment();
    }
    //if Analytics module is available?
    @Test
    public void AvailableAnalytics () {
        openAnalyticsModule();
        login("admin", "1");
        $("title").
                shouldHave(attribute("text" , "Rigspace Analytics"));
        refreshPageForAnalytics();
    }
    @After
    public void tearDown() {
        clearBrowserCookies();
        close();
    }

}