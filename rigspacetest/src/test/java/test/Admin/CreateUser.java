package test.Admin;
import com.codeborne.selenide.Condition;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static utilites.AuthorizationPage.login;
import static utilites.testURL.*;

/**
*   @autor a.stupin
*/

public class CreateUser {
    @Before
    public void setUp() throws Exception {
        clearBrowserCookies();
        openAdminMainPage();
        login("admin", "1");
    }
    @Test
    public void createUser() {
        //Adding info in all fields
        $(By.xpath("//*[@id=\"users\"]/div/div[2]/a")).click();
        $(By.id("mat-input-20")).sendKeys("Automata User");
        $(By.id("mat-input-21")).sendKeys("User");
        $(By.id("mat-input-22")).sendKeys("From");
        $(By.id("mat-input-23")).sendKeys("Autotest's");
        $(By.id("mat-input-24")).sendKeys("+79246666666");
        $(By.id("mat-input-25")).sendKeys("Tetra-Soft");
        $(By.id("mat-input-26")).sendKeys("QA/QC/Testing");
        $(By.id("mat-input-27")).sendKeys("QA Engineer");
        $(By.id("mat-input-28")).sendKeys("Clean Code Production");
        $(By.xpath("//*/button/span[contains(text(), 'Сохранить')]")).click();
        //Checking if it real create?
        $(By.xpath("//*[@id=\"cdk-overlay-2\"]/snack-bar-container")).shouldBe(Condition.visible);
    }
    @After
    public void tearDown() throws Exception {
        clearBrowserCookies();
        close();
    }
}