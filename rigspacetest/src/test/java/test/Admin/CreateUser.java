package test.Admin;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static utilites.AuthorizationPage.login;
import static utilites.testURL.*;

public class CreateUser {
    @Before
    public void setUp() throws Exception {
        clearBrowserCookies();
        openAdminMainPage();
        login("admin", "1");
    }
    @Test
    public void createUser() {
        $(By.xpath("//*[@id=\"users\"]/div/div[2]/a")).click();
        $(By.xpath("//*[@id=\"username\"]")).sendKeys("ForAutoTest");
        $(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("AT");
        $(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("AT");
        $(By.xpath("//*[@id=\"mat-input-3\"]")).sendKeys("AUTOTEST@mail.ru");
        $(By.xpath("//*[@id=\"main-content\"]/div/app-manage/app-nav-root/div/app-user/app-user-card/div/app-user-form/form/div[2]/button/span")).click();
    }
    @After
    public void tearDown() throws Exception {
        clearBrowserCookies();
        close();
    }
}
