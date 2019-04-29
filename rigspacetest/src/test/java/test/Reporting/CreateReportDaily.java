package test.Reporting;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static utilites.AuthorizationPage.*;
import static utilites.MatSelect.*;
import static utilites.testURL.*;

public class CreateReportDaily {
    @Before
    public void setUp() throws Exception {
        clearBrowserCookies();
        urlReporting();
        login("admin", "1");
    }
    @Test
    public void createReport() {
        $(By.xpath("//*[@id=\"main-content\"]/lib-toolbar/mat-toolbar/button")).click();
        $(By.xpath("/html/body/app-root/lib-root/mat-sidenav-container/mat-sidenav/div/lib-nav-list/mat-nav-list/a[3]/div")).click();
        $(By.xpath("//*[@id=\"main-content\"]/div/ts-reports/div/div/button/span")).click();
        selectMatContains("Мероприятие","666");
        $(By.xpath("//input[contains(@placeholder, 'Дата')]")).click();
        $(By.xpath("//input[contains(@placeholder, 'Дата')]")).sendKeys("04.04.2019");
        $(By.xpath("//input[contains(@placeholder, 'Номер')]")).click();
        $(By.xpath("//input[contains(@placeholder, 'Номер')]")).sendKeys("666");
        $(By.xpath("//*[@id=\"mat-dialog-0\"]/ts-report-dialog/ts-report-form/form/div[3]/button[2]")).click();
    }
    @After
    public void tearDown() throws Exception {
        clearBrowserCookies();
        close();
    }
}