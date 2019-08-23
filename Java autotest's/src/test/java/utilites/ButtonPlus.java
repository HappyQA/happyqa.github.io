package utilites;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

/**
 *   autor a.stupin
 */

public class ButtonPlus {
    public static void  appGroupUsers () {
        $(By.xpath("//*[@id=\"main-content\"]/div/app-manage/app-nav-root/div/app-group/app-group-card/div/div/app-group-users/div/a")).click();
    }
    public static void  appGroupObject () {
        $(By.xpath("//*[@id=\"main-content\"]/div/app-manage/app-nav-root/div/app-group/app-group-card/div/div/app-group-objects/div/a")).click();
    }
    public static void appGroupRole () {
        $(By.xpath("//*[@id=\"main-content\"]/div/app-manage/app-nav-root/div/app-group/app-group-card/div/div/app-group-role/div/a")).click();
    }
}