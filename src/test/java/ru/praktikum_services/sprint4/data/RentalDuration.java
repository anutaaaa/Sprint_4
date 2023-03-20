package ru.praktikum_services.sprint4.data;

import org.openqa.selenium.By;

public enum RentalDuration {

    ONE_DAY(By.xpath(".//div[@class='Dropdown-option' and text() = 'сутки']")),
    TWO_DAYS(By.xpath(".//div[@class='Dropdown-option' and text() = 'двое суток']")),
    THREE_DAYS(By.xpath(".//div[@class='Dropdown-option' and text() = 'трое суток']")),
    FOUR_DAYS(By.xpath(".//div[@class='Dropdown-option' and text() = 'четверо суток']")),
    FIVE_DAYS(By.xpath(".//div[@class='Dropdown-option' and text() = 'пятеро суток']")),
    SIX_DAYS(By.xpath(".//div[@class='Dropdown-option' and text() = 'шестеро суток']")),
    SEVEN_DAYS(By.xpath(".//div[@class='Dropdown-option' and text() = 'семеро суток']"));

    private final By rentalDurationInput;

    RentalDuration(By rentalDurationInput) {
        this.rentalDurationInput = rentalDurationInput;
    }

    public By getRentalDurationInput() {
        return rentalDurationInput;
    }
}
