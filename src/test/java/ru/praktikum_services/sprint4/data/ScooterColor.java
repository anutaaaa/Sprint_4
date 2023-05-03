package ru.praktikum_services.sprint4.data;

import org.openqa.selenium.By;

public enum ScooterColor {
    BLACK(By.xpath(".//label[@class='Checkbox_Label__3wxSf']/input[@id='black']")),
    GREY(By.xpath(".//label[@class='Checkbox_Label__3wxSf']/input[@id='grey']"));

    private final By colorInput;

    ScooterColor(By colorInput) {
        this.colorInput = colorInput;
    }

    public By getColorInput() {
        return colorInput;
    }
}
