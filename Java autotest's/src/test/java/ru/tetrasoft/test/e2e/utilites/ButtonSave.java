package ru.tetrasoft.test.e2e.utilites;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class ButtonSave {
    public static void saveButtonClick() {
        $(By.xpath("//*/button/span[contains(text(), 'Сохранить')]")).click();
    }
}
