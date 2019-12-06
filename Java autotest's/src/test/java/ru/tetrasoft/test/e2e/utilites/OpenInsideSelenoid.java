package ru.tetrasoft.test.e2e.utilites;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URI;
import static com.codeborne.selenide.Selenide.open;
import static ru.tetrasoft.test.e2e.utilites.LocatorPlaceholder.setFieldPlaceholder;
import static ru.tetrasoft.test.e2e.utilites.TestURL.openAdminModule;

public class OpenInsideSelenoid {

    @BeforeEach
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("firefox");
        capabilities.setVersion("70.0");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);
        RemoteWebDriver driver = new RemoteWebDriver(URI.create("http://localhost:4444/wd/hub").toURL(), capabilities);
        driver.get("http://qa.rig.space/admin/");
    }
    @Test
    public void openAdminInsideSelenoid () {
        setFieldPlaceholder("Логин", "КРАСАВА");
    }
}
