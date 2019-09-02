package ru.tetrasoft.test.e2e.utilites;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class Toggles {
    public static void usersToggle () {
        $(By.id("mat-slide-toggle-1")).click();
    }
}
