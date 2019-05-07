package utilites;
import static com.codeborne.selenide.Selenide.open;

public class testURL {
    public static void openReportingMainPage() {
        open("http://testing.rig.space/reporting/");
    }
    public static void openAdminMainPage() {

        open("http://testing.rig.space/admin/");
    }
    public static void openEquipmentMainPage() {
        open("http://testing.rig.space/equipment/");
    }
    public static void openAnalyticMainPage () {
        open("http://testing.rig.space/analytics/");
    }
}
