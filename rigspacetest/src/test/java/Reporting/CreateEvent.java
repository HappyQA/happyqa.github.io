package Reporting;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static utilites.AuthorizationPage.*;
import static utilites.MatSelect.*;

public class CreateEvent {
    @Before
    public void setUp() throws Exception {
        clearBrowserCookies();
        open("http://standalone.rig.space/reporting/");
        login("admin", "1");
    }
    @Test
    public void createEvent() {
        $(By.xpath("//*[@id=\"main-content\"]/lib-toolbar/mat-toolbar/button")).click();
        $(By.xpath("/html/body/app-root/lib-root/mat-sidenav-container/mat-sidenav/div/lib-nav-list/mat-nav-list/a[3]/div")).click();
        $(By.xpath("//*[@id=\"events\"]/div/div[2]/a")).click();
        $(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("Тестовый");
        selectMatContains("Форма рапорта", "Форма суточного рапорта");
        $(By.xpath("//*[@id=\"main-content\"]/div/ts-directory/app-nav-root/div/ts-eventtype/ts-eventtype-card/div/ts-eventtype-form/form/div/div[2]/button[2]")).click();
    }
    @After
    public void tearDown() throws Exception {
        clearBrowserCookies();
        close();
    }
}