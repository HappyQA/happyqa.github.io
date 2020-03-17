package ru.tetrasoft.test.e2e.common;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.tetrasoft.test.e2e.utilites.BaseTest;
import ru.tetrasoft.test.e2e.utilites.RefreshPageForCheck;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.*;
import static ru.tetrasoft.test.e2e.utilites.AuthorizationPage.login;
import static ru.tetrasoft.test.e2e.utilites.RefreshPageForCheck.refreshPageForAnalytics;
import static ru.tetrasoft.test.e2e.utilites.TestURL.*;

/**
 *   autor a.stupin
 */


//Checking if all module's are available right now
public class AvailableModules {
    @BeforeEach
    public void setUp()  {
        clearBrowserCookies();
    }
    //if Admin module is available?
    @Test
    public void AvailableAdmin () {
        openAdminModule();
        login("qa","123456");
        $("title").
                shouldHave(attribute("text" , "Rigspace Administrative Panel"));
        RefreshPageForCheck.refreshPageForAdmin();
    }
    //if Reporting module is available?
    @Test
    public void AvailableReporting () {
        openReportingModule();
        login("qa", "123456");
        $("title").
                shouldHave(attribute("text" , "RigSpace Reporting"));
        RefreshPageForCheck.refreshPageForReporting();
    }
    //if Equipment module is available?
    @Test
    public void AvailableEquipment () {
        openEquipmentModule();
        login("qa", "123456");
        $("title").
                shouldHave(attribute("text" , "Rigspace Equipment"));
        RefreshPageForCheck.refreshPageForEquipment();
    }
    //if Analytics module is available?
    @Test
    public void AvailableAnalytics () {
        openAnalyticsModule();
        login("qa", "123456");
        $("title").
                shouldHave(attribute("text" , "Rigspace Analytics"));
        refreshPageForAnalytics();
    }
    @AfterEach
    public void tearDown() {
        clearBrowserCookies();
        close();
    }

}