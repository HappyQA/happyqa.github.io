package ru.tetrasoft.test.e2e.utilites;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    @BeforeAll
    public void setUp() {
        Configuration.screenshots = false;
        Configuration.savePageSource = false;
    }
}
