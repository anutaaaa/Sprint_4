package ru.praktikum_services.sprint4.cases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import ru.praktikum_services.sprint4.page_objects.MainPageObject;

import static org.junit.Assert.assertEquals;


public class FAQTest {

    private WebDriver driver;

    @Before
    public void init() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(chromeOptions);
    }

    @Test
    public void checkFAQ1() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageObject mainPageObject = new MainPageObject(driver);
        mainPageObject.allowCookie();
        String answer = new MainPageObject(driver).getAnswer1();
        assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", answer);
    }

    @Test
    public void checkFAQ2() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageObject mainPageObject = new MainPageObject(driver);
        mainPageObject.allowCookie();
        String answer = new MainPageObject(driver).getAnswer2();
        assertEquals("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", answer);

    }

    @Test
    public void checkFAQ3() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageObject mainPageObject = new MainPageObject(driver);
        mainPageObject.allowCookie();
        String answer = new MainPageObject(driver).getAnswer3();
        assertEquals("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", answer);
    }

    @Test
    public void checkFAQ4() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageObject mainPageObject = new MainPageObject(driver);
        mainPageObject.allowCookie();
        String answer = new MainPageObject(driver).getAnswer4();
        assertEquals("Только начиная с завтрашнего дня. Но скоро станем расторопнее.", answer);
    }

    @Test
    public void checkFAQ5() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageObject mainPageObject = new MainPageObject(driver);
        mainPageObject.allowCookie();
        String answer = new MainPageObject(driver).getAnswer5();
        assertEquals("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.", answer);
    }

    @Test
    public void checkFAQ6() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageObject mainPageObject = new MainPageObject(driver);
        mainPageObject.allowCookie();
        String answer = new MainPageObject(driver).getAnswer6();
        assertEquals("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.", answer);
    }

    @Test
    public void checkFAQ7() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageObject mainPageObject = new MainPageObject(driver);
        mainPageObject.allowCookie();
        String answer = new MainPageObject(driver).getAnswer7();
        assertEquals("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", answer);
    }

    @Test
    public void checkFAQ8() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageObject mainPageObject = new MainPageObject(driver);
        mainPageObject.allowCookie();
        String answer = new MainPageObject(driver).getAnswer8();
        assertEquals("Да, обязательно. Всем самокатов! И Москве, и Московской области.", answer);
    }


    @After
    public void tearDown() {
        driver.quit();
    }


}


