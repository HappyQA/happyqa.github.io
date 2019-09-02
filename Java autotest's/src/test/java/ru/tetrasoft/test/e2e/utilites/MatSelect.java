package ru.tetrasoft.test.e2e.utilites;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

/**
 *   autor a.stupin
 */

public class MatSelect {
    public static void  selectMatContains (String placeholder, String value) {
        $(By.xpath("//mat-select[contains(@aria-label, '" + placeholder + "')]")).click();
        $(By.xpath("//mat-option/span[contains(text(), '" + value + "')]")).click();
    }
}