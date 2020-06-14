package ru.geekbrains.my.first.project.at;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.Test;

public class FirstTest {

/* 1.Зайти на сайт https://geekbrains.ru/courses
   2.Нажать на кнопку Курсы
   3.Проверить что страница Курсы открылась
   4.Повторить для
        1.Курсы
        2.Вебинары
        3.Форум
        4.Блог
        5.Тесты
        6.Карьера */

    @Test
    public void test(){
        Selenide.open("https://geekbrains.ru/events");
        Selenide.$("[class=\"gb-left-menu__nav\"] [href=\"/courses\"]").click();
        Selenide.$("[class=\"gb-header__title\"]").shouldHave(Condition.exactText("Курсы"));

        Selenide.$("[class=\"gb-left-menu__nav\"] [href=\"/events\"]").click();
        Selenide.$("[class=\"gb-header__title\"]").shouldHave(Condition.exactText("Вебинары"));

        Selenide.$("[class=\"gb-left-menu__nav\"] [href=\"/topics\"]").click();
        Selenide.$("[class=\"gb-header__title\"]").shouldHave(Condition.exactText("Форум"));

        Selenide.$("[class=\"gb-left-menu__nav\"] [href=\"/posts\"]").click();
        Selenide.$("[class=\"gb-header__title\"]").shouldHave(Condition.exactText("Блог"));

        Selenide.$("[class=\"gb-left-menu__nav\"] [href=\"/tests\"]").click();
        Selenide.$("[class=\"gb-header__title\"]").shouldHave(Condition.exactText("Тесты"));

        Selenide.$("[class=\"gb-left-menu__nav\"] [href=\"/career\"]").click();
        Selenide.$("[class=\"gb-header__title\"]").shouldHave(Condition.exactText("Карьера"));
    }
}
