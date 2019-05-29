package utilites;
import org.junit.Before;
import static com.codeborne.selenide.Selenide.open;

public class testURL {

    public static void openReportingMainPage() {
        open("http://dev.rig.space/reporting/");
    }
    public static void openAdminMainPage() {
        open("http://dev.rig.space/admin/");
    }
    public static void openEquipmentMainPage() {
        open("http://dev.rig.space/equipment/");
    }
    public static void openAnalyticMainPage () {
        open("http://dev.rig.space/analytics/");
    }
}