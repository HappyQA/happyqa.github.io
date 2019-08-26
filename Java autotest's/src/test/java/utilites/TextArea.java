package utilites;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

/**
 *   autor a.stupin
 */

public class TextArea {
    public static void textarea (String placeholder, String name) {
        $(By.xpath("//input[contains(@placeholder, '" + placeholder + "')]")).sendKeys(name);
    }
}