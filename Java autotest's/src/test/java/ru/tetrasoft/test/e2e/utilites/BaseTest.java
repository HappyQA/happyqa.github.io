package ru.tetrasoft.test.e2e.utilites;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import java.net.MalformedURLException;

public class BaseTest {
    @BeforeAll
    public void setUp() throws MalformedURLException {
        Configuration.screenshots = false;
        Configuration.savePageSource = false;
    }
}
