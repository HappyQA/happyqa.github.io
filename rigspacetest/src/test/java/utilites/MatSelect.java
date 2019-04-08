package Reporting;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MatSelect {
    public void selectContains (String placeholder, String value) {
        $(By.xpath("//app-select[contains(@placeholder, '" + placeholder + "')]")).click();
        $(By.xpath("//mat-option/span[contains(text(), '" + value + "')]")).click();
    }
}
