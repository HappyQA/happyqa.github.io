package ru.tetrasoft.test.e2e.utilites;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class MatTable {
    public static void userInMatTable () {
        $(By.xpath("//*[@id=\"users\"]/div/div[1]/mat-table/mat-row[2]/mat-cell[1]/div")).click();
    }
}
