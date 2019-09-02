package ru.tetrasoft.test.e2e.utilites;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

/**
 *   autor a.stupin
 */

public class TextArea {
    public static void setFieldTextarea(String placeholder, String name) {
        $(By.xpath("//textarea[contains(@placeholder, '" + placeholder + "')]")).sendKeys(name);
    }
}