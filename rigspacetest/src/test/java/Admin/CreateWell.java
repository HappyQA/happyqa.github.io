package Admin;
import static utilites.AuthorizationPage.*;
import com.codeborne.selenide.Selenide;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static utilites.MatSelect.*;

public class CreateWell {
    @Before
    public void setUp () throws Exception {
        clearBrowserCookies();
        open("http://standalone.rig.space/admin/");
        login("admin" , "1");
    }
    @Test
    public void сreateWell (){
        $(By.xpath("//*[@id=\"main-content\"]/lib-toolbar/mat-toolbar/button")).click();
        $(By.xpath("/html/body/app-root/lib-root/mat-sidenav-container/mat-sidenav/div/lib-nav-list/mat-nav-list/a[2]/div/mat-icon")).click();
        $(By.xpath("//*[@id=\"wells\"]/div/div[2]/a/span")).click();
        $(By.xpath("//*[@id=\"main-content\"]/div/app-wells/app-nav-root/div/app-well/app-well-card/div/app-well-form/form/div[1]/app-input/mat-form-field")).click();
        $(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("Тестовая скважина");
        selectContains("Месторождение", "Тестовые");
        selectContains("Площадь", "Тестовые");
        selectContains("Недропользователь", "Тестовые");
        selectContains("Назначение", "Тестовые");
        $(By.xpath("//*[@id=\"main-content\"]/div/app-wells/app-nav-root/div/app-well/app-well-card/div/app-well-form/form/div[2]/button")).click();
        Selenide.screenshot("1.png");
    }
    @After
    public void tearDown () throws Exception {
        clearBrowserCookies();
        close();
    }
}
