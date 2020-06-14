package ru.geekbrains.my.first.project.at;

import lombok.Data;

@Data
public class Page {
    private final Navigation navigation = new Navigation();
    private final Header header = new Header();

}
