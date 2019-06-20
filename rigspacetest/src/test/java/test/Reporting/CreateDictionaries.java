package test.Reporting;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static utilites.AuthorizationPage.login;
import static utilites.testURL.openAdminMainPage;

public class CreateDictionaries {
    //Open admin page authorization
    @Before
    public void setUp() throws Exception {
        clearBrowserCookies();
        openAdminMainPage();
        login("admin", "1");
    }
    @Test
    public void createAllDictionaries() {
        $(By.xpath("//button[contains(@class, 'mat-icon-button ng-tns-c4-1')]")).click();
    }
}
//*[@id="main-content"]/lib-toolbar/mat-toolbar/button