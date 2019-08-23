package utilites;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

/**
 *   autor a.stupin
 */

public class LocatorPlaceholder {
    public static void placeholder (String placeholder) {
        $(By.xpath("//input[contains(@placeholder, '" + placeholder + "')]")).sendKeys("User");
    }
}
