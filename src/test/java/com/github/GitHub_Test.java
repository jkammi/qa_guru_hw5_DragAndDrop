package com.github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GitHub_Test {

    @BeforeAll
    static void configure() {
        Configuration.baseUrl = "https://github.com";
        Configuration.browserSize = "1920x1080";
        Configuration.browserPosition = "0x0";
    }

    @Test
        // Откройте страницу Selenide в Github
        // Перейдите в раздел Wiki проекта
        // Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        // Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5

    void gitHubTest() {
        open("/selenide/selenide");
        $("#wiki-tab").click();
        $(".markdown-body").$(byText("Soft assertions")).click();
        $(".markdown-body").shouldHave(Condition.text("Using JUnit5"));
    }
}
