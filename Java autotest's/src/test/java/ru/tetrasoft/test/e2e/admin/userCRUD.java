package ru.tetrasoft.test.e2e.admin;
import static ru.tetrasoft.test.e2e.utilites.HoverButtons.*;
import static ru.tetrasoft.test.e2e.utilites.AuthorizationPage.login;
import static ru.tetrasoft.test.e2e.utilites.ButtonSave.saveButtonClick;
import static ru.tetrasoft.test.e2e.utilites.TextArea.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static ru.tetrasoft.test.e2e.utilites.TestURL.*;
import static ru.tetrasoft.test.e2e.utilites.LocatorPlaceholder.*;
import static ru.tetrasoft.test.e2e.utilites.ButtonPlus.*;
import static ru.tetrasoft.test.e2e.utilites.Toggles.*;
import static ru.tetrasoft.test.e2e.utilites.Credentials.*;
import static ru.tetrasoft.test.e2e.utilites.SnackBarChecker.*;
import static ru.tetrasoft.test.e2e.utilites.MatTable.*;

/**
*   autor a.stupin
*/

public class userCRUD {

    @BeforeEach
    public void setUp() throws MalformedURLException {
        clearBrowserCookies();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("78.0");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);
        RemoteWebDriver driver = new RemoteWebDriver(
                URI.create("http://localhost:4444/wd/hub").toURL(),
                capabilities
        );
        openAdminModule();
        login("admin", "1");
    }

    @Test
    public void createUser() {
        createUsersButtonClick();
        setUsername("Automata User");
        usersToggleClick();
        setPassword("secret");
        setFieldPlaceholder("Фамилия", "User");
        setFieldPlaceholder("Имя","From");
        setFieldPlaceholder("Отчество", "Autotest's");
        setFieldPlaceholder("Электронная почта", "2B@tetra-soft.ru");
        setFieldPlaceholder("Телефон","+79246666666");
        setFieldPlaceholder("Организация", "Tetra-Soft");
        setFieldPlaceholder("Отдел", "QA/QC/Testing");
        setFieldPlaceholder("Должность", "QA Engineer");
        setFieldTextarea("Описание", "Clean Code Production");
        saveButtonClick();
        checkContainsInSnackBar("Изменения сохранены");
    }

    @Test
    public void renameUser () {
        userInMatTable();
        clearFieldPlaceholder("Фамилия");
        setFieldPlaceholder("Фамилия", "Renamed name :)");
        saveButtonClick();
        checkContainsInSnackBar("Изменения сохранены");
    }

    @Test
    public void blockUser () {
        hoverButtonToUserLock();
        $(By.xpath("//span[contains(text(), 'Заблокировать')]")).click();
        checkContainsInSimpleSnackBar("Пользователь Renamed name :) From заблокирован");
    }

//    @AfterEach
//    public void tearsDown () {
//        clearBrowserCookies();
//        close();
//    }
}
