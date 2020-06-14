package ru.geekbrains.my.first.project.at;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Story;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(ExecutionMode.CONCURRENT)
@Story("Навигация")
public class FirstTest {

    @BeforeEach
    void setUp() {
        Configuration.browserCapabilities.setCapability("enableVNC", true);
        SelenideLogger.addListener("AllureSelenide",
                new AllureSelenide().screenshots(true).savePageSource(false));
    }

    @Test
    public void test(){
        Selenide.open("https://geekbrains.ru/events");
        Selenide.$("[class=\"gb-left-menu__nav\"] [href=\"/courses\"]").click();
        Selenide.$("[class=\"gb-header__title\"]").shouldHave(Condition.exactText("Курсы"));
    }
}
