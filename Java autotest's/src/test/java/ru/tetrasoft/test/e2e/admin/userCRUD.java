package ru.tetrasoft.test.e2e.admin;
import org.junit.After;
import com.codeborne.selenide.Condition;
import static ru.tetrasoft.test.e2e.utilites.AuthorizationPage.login;
import static ru.tetrasoft.test.e2e.utilites.ButtonSave.saveButton;
import static ru.tetrasoft.test.e2e.utilites.TextArea.*;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static ru.tetrasoft.test.e2e.utilites.TestURL.*;
import static ru.tetrasoft.test.e2e.utilites.LocatorPlaceholder.*;
import static ru.tetrasoft.test.e2e.utilites.ButtonPlus.*;
import static ru.tetrasoft.test.e2e.utilites.Toggles.*;

/**
*   autor a.stupin
*/

public class userCRUD {
    @Before
    public void setUp() {
        clearBrowserCookies();
        openAdminModule();
        login("admin", "1");
    }

    @Test
    public void createUser() {
        usersButtonPlus();
        $(By.id("username")).sendKeys("Automata User");
        usersToggle();
        $(By.id("password")).sendKeys("secret");
        setFieldPlaceholder("Фамилия", "User");
        setFieldPlaceholder("Имя", "From");
        setFieldPlaceholder("Отчество", "Autotest's");
        setFieldPlaceholder("Электронная почта", "2B@tetra-soft.ru");
        setFieldPlaceholder("Телефон","+79246666666");
        setFieldPlaceholder("Организация", "Tetra-Soft");
        setFieldPlaceholder("Отдел", "QA/QC/Testing");
        setFieldPlaceholder("Должность", "QA Engineer");
        setFieldTextarea("Описание", "Clean Code Production");
        saveButton();
        $(By.xpath("//snack-bar-container"))
                .shouldBe(Condition.visible).shouldHave(Condition.text("Изменения сохранены"));
    }

    @Test
    public void renameUser () {
        usersButtonPlus();
        $(By.id("username")).sendKeys("Automata User");
        usersToggle();
        $(By.id("password")).sendKeys("secret");
        setFieldPlaceholder("Фамилия", "User");
        saveButton();
        $(By.xpath("//snack-bar-container"))
                .shouldBe(Condition.visible).shouldHave(Condition.text("Изменения сохранены"));
    }

    @Test
    public void deleteUser () {
    }

    @After
    public void tearsDown () {
        clearBrowserCookies();
        close();
    }
}
