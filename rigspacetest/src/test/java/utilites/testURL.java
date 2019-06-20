package utilites;
import static com.codeborne.selenide.Selenide.open;

public class testURL {

    public static void openReportingMainPage() {
        open("http://qa.rig.space/reporting/");
    }
    public static void openAdminMainPage() {
        open("http://qa.rig.space/admin/");
    }
    public static void openEquipmentMainPage() {
        open("http://qa.rig.space/equipment/");
    }
    public static void openAnalyticMainPage () {
        open("http://qa.rig.space/analytics/");
    }
}
