package ru.praktikum_services.sprint4.cases;

import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import ru.praktikum_services.sprint4.data.OrderData;
import ru.praktikum_services.sprint4.page_objects.MainPageObject;
import ru.praktikum_services.sprint4.page_objects.OrderPageObject;
import ru.praktikum_services.sprint4.data.RentalDuration;
import ru.praktikum_services.sprint4.data.ScooterColor;

public abstract class AbstractOrderTest {

    protected WebDriver driver;

    protected OrderData data;

    public AbstractOrderTest(OrderData data) {
        this.data = data;
    }

    @Parameterized.Parameters
    public static OrderData[] getOrderData() {
        return new OrderData[] {
                new OrderData("Петя", "Иванов", "Бадаева улица", "Черкизовская", "71111111111", "24.04.2025", RentalDuration.FOUR_DAYS, ScooterColor.BLACK),
                new OrderData("Коля", "Сидоров", "Комсомольская улица", "Сокольники", "72222222222", "25.04.2025", RentalDuration.ONE_DAY, ScooterColor.GREY),
        };
    }

    public void makeOrderByTopButton() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageObject mainPageObject = new MainPageObject(driver);
        mainPageObject.allowCookie();
        mainPageObject.clickOnTopOrderButton();

        OrderPageObject orderPageObject = new OrderPageObject(driver);
        orderPageObject.waitForLoadStep1Page();
        orderPageObject.fillAndMakeOrder(data.getName(), data.getSurName(), data.getAddress(), data.getMetroStation(), data.getTelNumber());
        orderPageObject.waitForLoadStep2Page();
        orderPageObject.continueFillAndMakeOrder(data.getDate(), data.getRentalDuration(), data.getScooterColor());
        orderPageObject.waitForLoadStep3Page();
        orderPageObject.finishStepToOrder();
        orderPageObject.waitForLoadLastStepPage();
    }

    public void makeOrderByBottomButton() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageObject mainPageObject = new MainPageObject(driver);
        mainPageObject.allowCookie();
        mainPageObject.clickOnBottomOrderButton();

        OrderPageObject orderPageObject = new OrderPageObject(driver);
        orderPageObject.waitForLoadStep1Page();
        orderPageObject.fillAndMakeOrder(data.getName(), data.getSurName(), data.getAddress(), data.getMetroStation(), data.getTelNumber());
        orderPageObject.waitForLoadStep2Page();
        orderPageObject.continueFillAndMakeOrder(data.getDate(), data.getRentalDuration(), data.getScooterColor());
        orderPageObject.waitForLoadStep3Page();
        orderPageObject.finishStepToOrder();
        orderPageObject.waitForLoadLastStepPage();
    }
}
