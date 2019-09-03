package ru.tetrasoft.test.e2e.utilites;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class Credentials {
    public static void setUsername (String username) {
        $(By.id("username")).sendKeys(username);
    }
    public static void setPassword (String password) {
        $(By.id("password")).sendKeys(password);
    }
}
