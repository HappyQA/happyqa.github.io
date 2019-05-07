package test.Admin;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static utilites.AuthorizationPage.*;
import static utilites.testURL.*;

public class CreateRole {
    @Before
    public void setUp() throws Exception {
        clearBrowserCookies();
        openAdminMainPage();
        login("admin", "1");
    }
    @Test
    public void createRole(){
        $(By.xpath("//*[@id=\"main-content\"]/div/app-manage/app-nav-root/nav/div/div/a[3]")).click();
        $(By.xpath("//*[@id=\"roles\"]/div/div[2]/a/span")).click();
        $(By.xpath("//*[@id=\"main-content\"]/div/app-manage/app-nav-root/div/app-role/app-role-card/div/app-role-form/form/div[1]/div[2]/app-input/mat-form-field")).click();
        $(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("Тестовая роль");
        $(By.xpath("//*[@id=\"mat-checkbox-3\"]/label/div")).click();
        $(By.xpath("//*[@id=\"mat-checkbox-6\"]/label/div")).click();
        $(By.xpath("//*[@id=\"mat-checkbox-9\"]/label/div")).click();
        $(By.xpath("//*[@id=\"mat-checkbox-12\"]/label/div")).click();
        $(By.xpath("//*[@id=\"main-content\"]/div/app-manage/app-nav-root/div/app-role/app-role-card/div/app-role-form/form/div[2]/button")).click();
    }
    @After
    public void tearDown() throws Exception {
        clearBrowserCookies();
        close();
    }
}
