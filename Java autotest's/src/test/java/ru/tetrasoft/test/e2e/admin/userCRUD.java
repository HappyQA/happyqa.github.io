package ru.tetrasoft.test.e2e.admin;
import com.codeborne.selenide.Condition;
import static ru.tetrasoft.test.e2e.utilites.AuthorizationPage.login;
import static ru.tetrasoft.test.e2e.utilites.ButtonSave.saveButtonClick;
import static ru.tetrasoft.test.e2e.utilites.TextArea.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static ru.tetrasoft.test.e2e.utilites.TestURL.*;
import static ru.tetrasoft.test.e2e.utilites.LocatorPlaceholder.*;
import static ru.tetrasoft.test.e2e.utilites.ButtonPlus.*;
import static ru.tetrasoft.test.e2e.utilites.Toggles.*;
import static ru.tetrasoft.test.e2e.utilites.Credentials.*;

/**
*   autor a.stupin
*/

public class userCRUD {
    @BeforeEach
    public void setUp() {
        clearBrowserCookies();
        openAdminModule();
        login("admin", "1");
    }

    @Test
    public void createUser() {
        createUsersButtonClick();
        setUsername("Automata User");
        usersToggleClick();
        setPassword("secret");
        setFieldPlaceholder("Фамилия", "User");
        setFieldPlaceholder("Имя","From");
        setFieldPlaceholder("Отчество", "Autotest's");
        setFieldPlaceholder("Электронная почта", "2B@tetra-soft.ru");
        setFieldPlaceholder("Телефон","+79246666666");
        setFieldPlaceholder("Организация", "Tetra-Soft");
        setFieldPlaceholder("Отдел", "QA/QC/Testing");
        setFieldPlaceholder("Должность", "QA Engineer");
        setFieldTextarea("Описание", "Clean Code Production");
        saveButtonClick();
        $(By.xpath("//snack-bar-container"))
                .shouldBe(Condition.visible).shouldHave(Condition.text("Изменения сохранены"));
    }

    @Test
    public void renameUser () {
        $(By.xpath("//*[@id=\"users\"]/div/div[1]/mat-table/mat-row[2]/mat-cell[1]/div")).click();
        clearFieldPlaceholder("Фамилия");
        setFieldPlaceholder("Фамилия", "Renamed name :)");
        saveButtonClick();
        $(By.xpath("//snack-bar-container"))
                .shouldBe(Condition.visible).shouldHave(Condition.text("Изменения сохранены"));
    }

    @Test
    public void blockUser () {
        $(By.xpath("//*[@id=\"users\"]/div/div[1]/mat-table/mat-row[2]/mat-cell[6]/button")).click();
        $(By.xpath("//*[@id=\"cdk-overlay-6\"]/div/div/button/span")).click();
        $(By.xpath("//snack-bar-container"))
                .shouldBe(Condition.visible)
                .shouldHave(Condition.text("Пользователь Renamed name :) From разблокирован"));
    }

    @AfterEach
    public void tearsDown () {
        clearBrowserCookies();
        close();
    }
}
