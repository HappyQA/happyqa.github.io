package test.Admin;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static utilites.AuthorizationPage.login;
import static utilites.AuthorizationPage.logout;
import static utilites.testURL.*;

public class LoginRigSpace {
    @Before
    public void setUp() throws Exception {
        clearBrowserCookies();
        urlAdmin();
    }
    @Test
    public void WrongLogin() {
        login("admin", "afasgfag");
        $(By.xpath("//*[@id=\"mat-error-2\"]")).shouldHave(text("Неверный логин или пароль."));
    }
    @Test
    public void CorrectLogin() {
        login("admin", "1");
        logout();
    }
    @Test
    public void EmptyLogin() {
        login("", "");
        $(By.id("mat-error-0")).shouldHave(text("Обязательное поле"));
    }
}
