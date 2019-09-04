package ru.tetrasoft.test.e2e.utilites;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class SnackBarChecker {
    public static void checkContainsInSnackBar (String contains) {
        $(By.xpath("//snack-bar-container"))
                .shouldBe(Condition.visible)
                .shouldHave(Condition.text(contains));
    }
    public static void checkContainsInSimpleSnackBar (String contains) {
        $(By.xpath("//simple-snack-bar"))
                .shouldBe(Condition.visible)
                .shouldHave(Condition.text(contains));
    }
}
