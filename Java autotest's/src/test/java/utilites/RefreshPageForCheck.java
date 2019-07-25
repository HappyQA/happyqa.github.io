package utilites;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.refresh;

public class RefreshPageForCheck {
    public static void refreshPageForAdmin () {
        refresh();
        $("title").
                shouldHave(attribute("text" , "Rigspace Administrative Panel"));
    }
    public static void refreshPageForReporting () {
        refresh();
        $("title").
                shouldHave(attribute("text" , "RigSpace Reporting"));
    }
    public static void refreshPageForEquipment (){
        refresh();
        $("title").
                shouldHave(attribute("text" , "Rigspace Equipment"));
    }
    public static void refreshPageForAnalytics (){
        refresh();
        $("title").
                shouldHave(attribute("text" , "Rigspace Analytics"));
    }
}