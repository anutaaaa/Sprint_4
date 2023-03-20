package ru.praktikum_services.sprint4.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class AbstractPageObject {
    private final WebDriver driver;
    // Кнопка принятия куки
    private final By cookieButton = By.className("App_CookieButton__3cvqF");

    public AbstractPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void allowCookie() {
       driver.findElement(cookieButton).click();
    }
}
