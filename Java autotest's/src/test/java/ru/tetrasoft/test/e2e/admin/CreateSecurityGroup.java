package ru.tetrasoft.test.e2e.admin;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.tetrasoft.test.e2e.utilites.AuthorizationPage;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static ru.tetrasoft.test.e2e.utilites.ButtonPlus.appGroupObject;
import static ru.tetrasoft.test.e2e.utilites.ButtonPlus.appGroupUsers;
import static ru.tetrasoft.test.e2e.utilites.TestURL.*;

/**
 *   autor a.stupin
 */

public class CreateSecurityGroup {
    @BeforeEach
    public void setUp() {
        clearBrowserCookies();
        //open Url qa.rig.space/admin
        openAdminModule();
        AuthorizationPage.login("admin", "1");
    }
    @Test
    public void createSecurityGroup() {
        //Create new security group for admin with all privileges (users, object and role)
        //Step 1: Create security group
        $(By.xpath("//a[contains(text(), 'Группы безопасности')]")).click();
        $(By.xpath("//*[@id=\"groups\"]/div/div[2]/a")).click();
        $(By.xpath("//input[contains(@placeholder, 'Название')]"))
                .sendKeys("Group for Auto User");
        $(By.xpath("//textarea[contains(@placeholder, 'Описание')]"))
                .sendKeys("Random description");

        //Step 2: Adding admin user to SG
        $(By.xpath("//span[contains(text(), 'Участники')]")).click();
        //Push button +
        appGroupUsers();
        $(By.xpath("//*[@id=\"mat-checkbox-2\"]/label")).click();
        $(By.xpath("//span[contains(text(), 'Добавить (1)')]")).click();
        //Checking if this user are really added in this group (Admin)
        $(By.xpath("//*[@id=\"users\"]/div/div[1]/mat-table/mat-row/mat-cell[1]/div"))
                .shouldBe(Condition.visible).shouldHave(Condition.text("Админ Админ"));

        //Step 3: Adding all object's for this group
        $(By.xpath("//span[contains(text(), 'Объекты')]")).click();
        //Push button +
        appGroupObject();
        $(By.xpath("//*[@id=\"mat-dialog-1\"]/app-group-objects-add-dialog/div[1]/mat-form-field/div/div[1]/div"))
                .click();
        $(By.xpath("//span[contains(text(), 'Учетная запись')]")).click();
        $(By.xpath("//span[contains(text(), 'Добавить (1)')]")).click();
        //Push button +
        appGroupObject();
        $(By.xpath("//*[@id=\"mat-dialog-2\"]/app-group-objects-add-dialog/div[1]/mat-form-field/div/div[1]/div"))
                .click();
        $(By.xpath("//span[contains(text(), 'Буровая установка')]")).click();
        $(By.xpath("//span[contains(text(), 'Добавить (1)')]")).click();
        //Push button +
        appGroupObject();
        $(By.xpath("//*[@id=\"mat-dialog-3\"]/app-group-objects-add-dialog/div[1]/mat-form-field/div/div[1]/div"))
                .click();
        $(By.xpath("//span[contains(text(), 'Скважина')]")).click();
        $(By.xpath("//span[contains(text(), 'Добавить (1)')]")).click();

        //Step 4: Adding role with all attributes
        $(By.xpath("//span[contains(text(), 'Роли')]")).click();

    }
}