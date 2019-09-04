package ru.tetrasoft.test.e2e.utilites;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class HoverButtons {
    public static void hoverButtonToUserLock() {
        $(By.xpath("//*[@id=\"users\"]/div/div[1]/mat-table/mat-row[2]/mat-cell[6]/button"))
                .hover().click();
    }

}
