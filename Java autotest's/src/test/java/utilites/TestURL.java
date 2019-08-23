package utilites;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.refresh;

/**
 *   autor a.stupin
 */

public class TestURL {

    public static void openAdminModule () {
        open("http://qa.rig.space/admin/");
    }
    public static void openReportingModule () {
        open("http://qa.rig.space/reporting/");
    }
    public static void openEquipmentModule (){
        open("http://qa.rig.space/equipment/");
    }
    public static void openAnalyticsModule (){
        open("http://qa.rig.space/analytics/");
    }
}
