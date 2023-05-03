package ru.praktikum_services.sprint4.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.praktikum_services.sprint4.data.RentalDuration;
import ru.praktikum_services.sprint4.data.ScooterColor;

public class OrderPageObject extends AbstractPageObject {
    private final WebDriver driver;

    // Заголовок "Про аренду"
    private final By pageTitle = By.className("Order_Header__BZXOb");
    // Заголовок "Хотите оформить заказ?"
    private final By wantToMakeOrder = By.className("Order_ModalHeader__3FDaJ");
    // Поле для ввода Имени
    private final By nameInput = By.xpath(".//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Имя']");
    // Поле для ввода Фамилии
    private final By surnameInput = By.xpath(".//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Фамилия']");
    // Поле для ввода адреса
    private final By addressInput = By.xpath(".//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Адрес: куда привезти заказ']");
    // Поле для выбора станции метро
    private final By metroStationInput = By.xpath(".//div[@class='select-search__value']/input[@placeholder='* Станция метро']");
    // Поле для ввода телефонного номера
    private final By telNumberInput = By.xpath(".//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Телефон: на него позвонит курьер']");
    // Кнопка "Далее"
    private final By nextButton = By.xpath(".//div[@class='Order_NextButton__1_rCA']/button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    // Поле для выбора даты доставки самоката
    private final By dateInput = By.xpath(".//div[@class='react-datepicker__input-container']/input[@placeholder='* Когда привезти самокат']");
    // Поле для выбора срока аренды самоката
    private final By durationPlaceholderInput = By.xpath(".//div[@class='Dropdown-placeholder' and (text() = '* Срок аренды')]");
    // Кнопка "Заказать"
    private final By orderFinalButton = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text() = 'Заказать']");
    // Кнопка "Да"
    private final By finishButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and (text() = 'Да')]");
    // Заголовок "Заказ оформлен"
    private final By pageOrderFinished = By.className("Order_ModalHeader__3FDaJ");


    public OrderPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void waitForLoadStep1Page() {
        new WebDriverWait(driver, 3)
                .until(driver -> (driver.findElement(pageTitle).getText().equals("Для кого самокат")));
    }

    public void waitForLoadStep2Page() {
        new WebDriverWait(driver, 3)
                .until(driver -> (driver.findElement(pageTitle).getText().equals("Про аренду")));
    }

    public void waitForLoadStep3Page() {
        new WebDriverWait(driver, 3)
                .until(driver -> (driver.findElement(wantToMakeOrder).getText().startsWith("Хотите оформить заказ?")));
    }

    public void waitForLoadLastStepPage() {
        new WebDriverWait(driver, 3)
                .until(driver -> (driver.findElement(pageOrderFinished).getText().startsWith("Заказ оформлен")));
    }
    public void fillAndMakeOrder(String name, String surname, String address, String metroStation, String telNumber) {
        driver.findElement(nameInput).sendKeys(name);
        driver.findElement(surnameInput).sendKeys(surname);
        driver.findElement(addressInput).sendKeys(address);

        WebElement metroStationElement = driver.findElement(metroStationInput);
        metroStationElement.click();
        metroStationElement.sendKeys(metroStation);
        metroStationElement.sendKeys(Keys.DOWN);
        metroStationElement.sendKeys(Keys.ENTER);

        driver.findElement(telNumberInput).sendKeys(telNumber);
        driver.findElement(nextButton).click();
    }


    public void continueFillAndMakeOrder(String date, RentalDuration rentalDuration, ScooterColor color) {
        WebElement datePickerElement = driver.findElement(dateInput);
        datePickerElement.sendKeys(date);
        datePickerElement.sendKeys(Keys.ENTER);

        driver.findElement(durationPlaceholderInput).click();
        driver.findElement(rentalDuration.getRentalDurationInput()).click();

        driver.findElement(color.getColorInput()).click();
        driver.findElement(orderFinalButton).click();
    }

    public void finishStepToOrder() {
        driver.findElement(finishButton).click();
    }
}
