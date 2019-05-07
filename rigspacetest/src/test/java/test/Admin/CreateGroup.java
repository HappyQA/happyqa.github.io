package test.Admin;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.conditions.Text;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static utilites.AuthorizationPage.*;
import static utilites.testURL.*;

public class CreateGroup {
    @Before
    public void setUp() throws Exception {
        clearBrowserCookies();
        openAdminMainPage();
        login("admin", "1");
    }
    @Test
    public void createGroup() {
        $(By.xpath("//*[@id=\"main-content\"]/div/app-manage/app-nav-root/nav/div/div/a[2]")).click();
        $(By.xpath("//*[@id=\"groups\"]/div/div[2]/a")).click();
        $(By.xpath("//*[@id=\"main-content\"]/div/app-manage/app-nav-root/div/app-group/app-group-card/div/app-group-form/form/app-input")).click();
        $(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("Тестовая группа");
        $(By.xpath("//*[@id=\"mat-checkbox-1\"]")).click();
        $(By.xpath("//*[@id=\"main-content\"]/div/app-manage/app-nav-root/div/app-group/app-group-card/div/app-group-form/form/div/button")).click();
    }
    @After
    public void tearDown() throws Exception {
        clearBrowserCookies();
        close();
    }
}
