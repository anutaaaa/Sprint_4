package ru.praktikum_services.sprint4.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MainPageObject extends AbstractPageObject{

    private final WebDriver driver;
    // Локатор верхней кнопки "Заказать"
    private final By topOrderButton = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[@class='Button_Button__ra12g']");
    // Локатор нижней кнопки "Заказать"
    private final By bottomOrderButton = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //Локатор вопроса "Сколько это стоит? И как оплатить?"
    private final By question1 = By.id("accordion__heading-0");
    //Локатор ответа "Сутки — 400 рублей. Оплата курьеру — наличными или картой."
    private final By answer1 = By.id("accordion__panel-0");
    //Локатор вопроса "Хочу сразу несколько самокатов! Так можно?"
    private final By question2 = By.id("accordion__heading-1");
    //Локатор ответа "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."
    private final By answer2 = By.id("accordion__panel-1");
    //Локатор вопроса "Как рассчитывается время аренды?"
    private final By question3 = By.id("accordion__heading-2");
    //Локатор ответа "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."
    private final By answer3 = By.id("accordion__panel-2");
    //Локатор вопроса "Можно ли заказать самокат прямо на сегодня?"
    private final By question4 = By.id("accordion__heading-3");
    //Локатор ответа "Только начиная с завтрашнего дня. Но скоро станем расторопнее."
    private final By answer4 = By.id("accordion__panel-3");
    //Локатор вопроса "Можно ли продлить заказ или вернуть самокат раньше?"
    private final By question5 = By.id("accordion__heading-4");
    //Локатора ответа "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."
    private final By answer5 = By.id("accordion__panel-4");
    //Локатор вопроса "Вы привозите зарядку вместе с самокатом?"
    private final By question6 = By.id("accordion__heading-5");
    //Локатор ответа "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."
    private final By answer6 = By.id("accordion__panel-5");
    //Локатор вопроса "Можно ли отменить заказ?"
    private final By question7 = By.id("accordion__heading-6");
    //Локатора ответа "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."
    private final By answer7 = By.id("accordion__panel-6");
    //Локатор вопроса "Я жизу за МКАДом, привезёте?"
    private final By question8 = By.id("accordion__heading-7");
    //Локатор ответа "Да, обязательно. Всем самокатов! И Москве, и Московской области."
    private final By answer8 = By.id("accordion__panel-7");

    public MainPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickOnTopOrderButton() {
        driver.findElement(topOrderButton).click();
    }

    public void clickOnBottomOrderButton() {
        driver.findElement(bottomOrderButton).click();
    }


    public String getAnswer1() {
        driver.findElement(question1).click();
        return driver.findElement(answer1).getText();
    }
    public String getAnswer2() {
        driver.findElement(question2).click();
        return driver.findElement(answer2).getText();
    }
    public String getAnswer3() {
        driver.findElement(question3).click();
        return driver.findElement(answer3).getText();
    }
    public String getAnswer4() {
        driver.findElement(question4).click();
        return driver.findElement(answer4).getText();
    }
    public String getAnswer5() {
        driver.findElement(question5).click();
        return driver.findElement(answer5).getText();
    }
    public String getAnswer6() {
        driver.findElement(question6).click();
        return driver.findElement(answer6).getText();
    }
    public String getAnswer7() {
        driver.findElement(question7).click();
        return driver.findElement(answer7).getText();
    }
    public String getAnswer8() {
        driver.findElement(question8).click();
        return driver.findElement(answer8).getText();
    }
}
