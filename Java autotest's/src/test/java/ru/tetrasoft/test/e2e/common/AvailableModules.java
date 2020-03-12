package ru.tetrasoft.test.e2e.common;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import ru.tetrasoft.test.e2e.utilites.BaseTest;
import ru.tetrasoft.test.e2e.utilites.RefreshPageForCheck;

import java.net.MalformedURLException;
import java.net.URI;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.*;
import static ru.tetrasoft.test.e2e.utilites.AuthorizationPage.login;
import static ru.tetrasoft.test.e2e.utilites.RefreshPageForCheck.refreshPageForAnalytics;
import static ru.tetrasoft.test.e2e.utilites.TestURL.*;

/**
 *   autor a.stupin
 */


//Checking if all module's are available right now
public class AvailableModules extends BaseTest {
    @BeforeEach
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("78.0");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);

        RemoteWebDriver driver = new RemoteWebDriver(URI.create("http://192.168.0.8:4444/wd/hub").toURL(),
                capabilities);
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