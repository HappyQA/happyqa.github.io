package ru.tetrasoft.test.e2e.common;

import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;


public class Storybook {
    @BeforeEach
    public void SetUp(){
        open("http://storybook/");
    }
}
