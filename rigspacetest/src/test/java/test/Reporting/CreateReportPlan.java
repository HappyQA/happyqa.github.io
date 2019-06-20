package test.Reporting;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.not;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static utilites.AuthorizationPage.*;
import static utilites.MatSelect.*;
import static utilites.testURL.*;

public class CreateReportPlan {
    @Before
    public void setUp() {
        clearBrowserCookies();
        openReportingModule();
        login("admin", "1");
    }
    @Test
    public void createReport() {
        $(By.xpath("//*[@id=\"main-content\"]/lib-toolbar/mat-toolbar/button")).click();
        $(By.xpath("/html/body/app-root/lib-root/mat-sidenav-container/mat-sidenav/div/lib-nav-list/mat-nav-list/a[3]/div")).click();
        $(By.xpath("//*[@id=\"main-content\"]/div/ts-reports/div/div/button/span")).click();
        $(By.xpath("//*[@id=\"mat-radio-3\"]")).click();
        $(By.tagName("app-spinner")).shouldBe(not(visible));
        selectMatContains("Мероприятие","666");
        $(By.xpath("//input[contains(@placeholder, 'Дата')]")).click();
        $(By.xpath("//input[contains(@placeholder, 'Дата')]")).sendKeys("04.04.2019");
        $(By.xpath("//input[contains(@placeholder, 'Номер')]")).click();
        $(By.xpath("//input[contains(@placeholder, 'Номер')]")).sendKeys("666");
        $(By.xpath("//button[contains(@type, 'submit')]")).click();
    }
    @After
    public void tearDown() {
        clearBrowserCookies();
        close();
    }
}
