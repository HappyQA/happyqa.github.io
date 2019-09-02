package ru.tetrasoft.test.e2e.utilites;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

/**
 *   autor a.stupin
 */

public class LocatorPlaceholder {
    public static void setFieldPlaceholder(String placeholder, String name) {
        $(By.xpath("//input[contains(@placeholder, '" + placeholder + "')]")).sendKeys(name);
    }
}