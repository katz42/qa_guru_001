package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

class YandexSearch {
    @Test
    void selenideSearchTest() {
        // Open Yandex
        open("https://www.yandex.ru");

        //Type in 'Java 8'
        $(byName("text")).setValue("Java 8").pressEnter();

        // Find 'oracle.com' on page
        $("html").shouldHave(text("oracle.com"));
    }
}