package utilites;
import com.codeborne.selenide.Condition;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static utilites.AuthorizationPage.login;
import static utilites.testURL.*;


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
        $(By.xpath("//span[contains(text(), 'Управление пользователями')]")).shouldBe(Condition.visible);
    }
    //if Reporting module is available?
    @Test
    public void AvailableReporting () {
        openReportingModule();
        login("admin", "1");
        $(By.xpath("//button[contains(text(), 'Название')]")).shouldBe(Condition.visible);
    }
    //if Equipment module is available?
    @Test
    public void AvailableEquipment () {
        openEquipmentModule();
        login("admin", "1");
        $(By.xpath("//span[contains(text(), 'Схема расположения оборудования')]")).shouldBe(Condition.visible);
    }
    //if Analytics module is available?
    @Test
    public void AvailableAnalytics () {
        openAnalyticsModule();
        login("admin", "1");
        $(By.xpath("//span[contains(text(), 'Избранные')]")).shouldBe(Condition.visible);
    }
    @After
    public void tearDown() {
        clearBrowserCookies();
        close();
    }
}