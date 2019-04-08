package Admin;
import static environment.AuthorizationPage.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

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
        $(By.xpath("//*[@id=\"main-content\"]/div/app-wells/app-nav-root/div/app-well/app-well-card/div/app-well-form/form/div[1]/app-select[1]/mat-form-field")).click();
        $(By.xpath("/html/body/div[3]")).click();
        $(By.xpath("//*[@id=\"mat-select-1\"]/div/div[1]/span")).click();
        $(By.xpath("/html/body/div[3]")).click();
    }
    @After
    public void tearDown () throws Exception {
        clearBrowserCookies();
        close();
    }
}
