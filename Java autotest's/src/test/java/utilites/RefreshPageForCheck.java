package utilites;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.refresh;

public class RefreshPageForCheck {
    public static void refreshPageForAdmin () {
        refresh();
        $(By.xpath("//span[contains(text(), 'Управление пользователями')]"))
                .shouldBe(Condition.visible);
    }
    public static void refreshPageForReporting () {
        refresh();
        $(By.xpath("//button[contains(text(), 'Название')]"))
                .shouldBe(Condition.visible);
    }
    public static void refreshPageForEquipment (){
        refresh();
        $(By.xpath("//span[contains(text(), 'Схема расположения оборудования')]"))
                .shouldBe(Condition.visible);
    }
    public static void refreshPageForAnalytics (){
        refresh();
        $(By.xpath("//span[contains(text(), 'Избранные')]"))
                .shouldBe(Condition.visible);
    }
}