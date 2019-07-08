package test.Admin;
import com.codeborne.selenide.Condition;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static utilites.AuthorizationPage.login;
import static utilites.ButtonPlus.appGroupObject;
import static utilites.ButtonPlus.appGroupUsers;
import static utilites.testURL.*;

/**
 *   autor a.stupin
 */

public class CreateSecurityGroup {
    @Before
    public void setUp() {
        clearBrowserCookies();
        openAdminModule();
        login("admin", "1");
    }
    @Test
    public void createSecurityGroup() {
        //Create new security group for admin with all privileges (object and role)
        $(By.xpath("//a[contains(text(), 'Группы безопасности')]")).click();
        $(By.xpath("//*[@id=\"groups\"]/div/div[2]/a")).click();
        $(By.xpath("//input[contains(@placeholder, 'Название')]")).sendKeys("Group for Auto User");
        $(By.xpath("//span[contains(text(), 'Участники')]")).click();
        //Push button plus
        appGroupUsers();
        $(By.xpath("//*[@id=\"mat-checkbox-2\"]/label")).click();
        $(By.xpath("//span[contains(text(), 'Добавить (1)')]")).click();
        //Checking if this user are really added in this group (Admin)
        $(By.xpath("//*[@id=\"users\"]/div/div[1]/mat-table/mat-row/mat-cell[1]/div")).shouldBe(Condition.visible).shouldHave(Condition.text("Админ"));

        //Adding all object for this user
        $(By.xpath("//span[contains(text(), 'Объекты')]")).click();
        //Push button plus
        appGroupObject();
        $(By.xpath("//mat-label[contains(text(), 'Тип объекта')]")).click();

    }
}