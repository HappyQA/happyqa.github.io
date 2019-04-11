package test.Reporting;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static utilites.AuthorizationPage.*;
import static utilites.MatSelect.*;
import static utilites.URL.*;

public class CreateReport {
    @Before
    public void setUp() throws Exception {
        clearBrowserCookies();
        testURL();
        login("admin", "1");
    }
    @Test
    public void createReport() {
        $(By.xpath("//*[@id=\"main-content\"]/lib-toolbar/mat-toolbar/button")).click();
        $(By.xpath("/html/body/app-root/lib-root/mat-sidenav-container/mat-sidenav/div/lib-nav-list/mat-nav-list/a[3]/div")).click();
        $(By.xpath("//*[@id=\"main-content\"]/div/ts-reports/div/div/button/span")).click();
        selectMatContains("Мероприятие","1");
        $(By.xpath("//*[@id=\"mat-form-field-label-79\"]")).sendKeys("04.04.2019");
        $(By.xpath("//*[@id=\"mat-input-21\"]")).sendKeys("666  ");
        $(By.xpath("//*[@id=\"main-content\"]/div/ts-directory/app-nav-root/div/ts-eventtype/ts-eventtype-card/div/ts-eventtype-form/form/div/div[2]/button[2]")).click();
    }
    @After
    public void tearDown() throws Exception {
        clearBrowserCookies();
        close();
    }
}