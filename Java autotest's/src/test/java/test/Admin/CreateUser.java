package test.Admin;
import com.codeborne.selenide.Condition;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static utilites.AuthorizationPage.login;
import static utilites.testURL.*;

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
        $(By.xpath("//input[contains(@placeholder, 'Фамилия')]")).sendKeys("User");
        $(By.xpath("//input[@placeholder='Имя']")).sendKeys("From");
        $(By.xpath("//input[contains(@placeholder, 'Отчество')]")).sendKeys("Autotest's");
        $(By.xpath("//input[contains(@placeholder, 'Электронная почта')]")).sendKeys("2B@tetra-soft.ru");
        $(By.xpath("//input[contains(@placeholder, 'Телефон')]")).sendKeys("+79246666666");
        $(By.xpath("//input[contains(@placeholder, 'Организация')]")).sendKeys("Tetra-Soft");
        $(By.xpath("//input[contains(@placeholder, 'Отдел')]")).sendKeys("QA/QC/Testing");
        $(By.xpath("//input[contains(@placeholder, 'Должность')]")).sendKeys("QA Engineer");
        $(By.xpath("//textarea[contains(@placeholder, 'Описание')]")).sendKeys("Clean Code Production");
        $(By.xpath("//*/button/span[contains(text(), 'Сохранить')]")).click();
        //Checking if it real create?
        $(By.xpath("//snack-bar-container")).shouldBe(Condition.visible).shouldHave(Condition.text("Изменения сохранены"));
    }
    @After
    public void tearDown() {
        clearBrowserCookies();
        close();
    }
}