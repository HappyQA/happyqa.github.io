package utilites;
import static com.codeborne.selenide.Selenide.open;

public class testURL {
    public static void urlReporting () {
        open("http://testing.rig.space/reporting/");
    }
    public static void urlAdmin () {
        open("http://testing.rig.space/admin/");
    }
    public static void urlEquipments () {
        open("http://testing.rig.space/equipment/");
    }
    public static void urlAnalytics () {
        open("http://testing.rig.space/analytics/");
    }
}