package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

class YandexSearch {
    @Test
    void selenideSearchTest() {
        open("https://www.yandex.ru");
        $(byName("text")).setValue("Java 8").pressEnter();
        $("html").shouldHave(text("oracle.com"));
    }
}