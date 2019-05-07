package utilites;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class AuthorizationPage {
    public static void login (String login, String pass) {
        $(By.name("username")).sendKeys(login);
        $(By.name("password")).sendKeys(pass);
        $("button[type]").click();
    }
    public static void logout() {
        $(By.xpath("//lib-avatar/button")).click();
        $(By.xpath("//*[@id=\"cdk-overlay-0\"]/div/div/button[2]")).click();
    }
}



