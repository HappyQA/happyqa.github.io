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
        $(By.xpath("//*[@id=\"main-content\"]/div/app-manage/app-nav-root/div/app-group/app-group-card/div/div/app-group-users/div/a")).click();
        $(By.xpath("//*[@id=\"mat-checkbox-7-input\"]")).click();
    }
}
