package test.Admin;
import com.codeborne.selenide.Condition;
import static utilites.TextArea.*;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static utilites.AuthorizationPage.login;
import static utilites.TestURL.*;
import static utilites.LocatorPlaceholder.*;

/**
*   autor a.stupin
*/

public class CreateUser {
    @Before
    public void setUp() {
        clearBrowserCookies();
        openAdminModule();
        login("admin", "1");
    }
    @Test
    public void createUser() {
        //Adding info in all fields
        $(By.xpath("//*[@id=\"users\"]/div/div[2]/a")).click();
        $(By.id("username")).sendKeys("Automata User");
        $(By.xpath("//mat-slide-toggle[contains(@id, 'mat-slide-toggle-1')]")).click();
        $(By.id("password")).sendKeys("secret");
        placeholder("Фамилия", "User");
        placeholder("Имя", "From");
        placeholder("Отчество", "Autotest's");
        placeholder("Электронная почта", "2B@tetra-soft.ru");
        placeholder("Телефон","+79246666666");
        placeholder("Организация", "Tetra-Soft");
        placeholder("Отдел", "QA/QC/Testing");
        placeholder("Должность", "QA Engineer");
        textarea("Описание", "Clean Code Production");
        $(By.xpath("//*/button/span[contains(text(), 'Сохранить')]")).click();
        //Checking if it real create?
        $(By.xpath("//snack-bar-container"))
                .shouldBe(Condition.visible).shouldHave(Condition.text("Изменения сохранены"));
    }
}