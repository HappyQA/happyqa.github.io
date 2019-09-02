package ru.tetrasoft.test.e2e.admin;
import ru.tetrasoft.test.e2e.utilites.AuthorizationPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static ru.tetrasoft.test.e2e.utilites.TestURL.*;

/**
 *   autor a.stupin
 */

public class LoginRigSpace {
    @Before
    public void setUp() {
        clearBrowserCookies();
        openAdminModule();
    }
    @Test
    public void WrongLogin() {
        AuthorizationPage.login("admin", "afasgfag");
        $(By.xpath("//*[@id=\"mat-error-2\"]")).shouldHave(text("Неверный логин или пароль."));
    }
    @Test
    public void CorrectLogin() {
        AuthorizationPage.login("admin", "1");
        AuthorizationPage.logout();
    }
    @Test
    public void EmptyLogin() {
        AuthorizationPage.login("", "");
        $(By.id("mat-error-0")).shouldHave(text("Обязательное поле"));
    }
}
