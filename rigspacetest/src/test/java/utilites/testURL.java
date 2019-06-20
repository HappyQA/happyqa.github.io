package utilites;
import static com.codeborne.selenide.Selenide.open;

public class testURL {

    public static void openAdminModule() {
        open("http://qa.rig.space/admin/");
    }
    public static void openReportingModule() {
        open("http://qa.rig.space/reporting/");
    }
}
