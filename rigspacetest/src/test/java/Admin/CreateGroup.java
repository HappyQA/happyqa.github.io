package Admin;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static environment.AuthorizationPage.*;

public class CreateGroup {
    @Before
    public void SetUp() throws Exception {
        clearBrowserCookies();
        open("http://localhost:8082/admin/");
        login("admin", "1");
    }
    @Test
    public void createGroup () {
        $(By.xpath("//*[@id=\"main-content\"]/div/app-manage/app-nav-root/nav/div/div/a[2]")).click();
        $(By.xpath("//*[@id=\"groups\"]/div/div[2]/a")).click();
        $(By.xpath("//*[@id=\"main-content\"]/div/app-manage/app-nav-root/div/app-group/app-group-card/div/app-group-form/form/app-input")).click();
        $(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("Тестовая группа");
        $(By.xpath("//*[@id=\"mat-checkbox-1\"]")).click();
        $(By.xpath("//*[@id=\"main-content\"]/div/app-manage/app-nav-root/div/app-group/app-group-card/div/app-group-form/form/div/button")).click();
    }
}